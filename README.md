# study_Spring
Spring을 공부한 것을 정리하는 Repository
- Spring Framework 버전 5를 중심으로 수업하지만 버전 4에서 테스트가 완료된 상태이다.
- 윤재성의 Spring Framework 개발자를 위한 실습을 통한 입문 과정

## Setting
1. Elicpse에서 JAVA EE 모드로 변경
2. File -> New -> Maven Project
3. 체크박스(Create a simple project) 클릭
4. Group ID는 group id, Artifact ID는 프로젝트 이름으로 작성
5. 프로젝트 이름 -> Properties -> Project Facets -> Convert to faceted form
    - 자바 처음 세팅이 1.5버전으로 되어있기 때문에 자바 1.8부터의 유용한 문법들을 사용할 수 없어 교체해주는 것이다.
6. Java -> 1.8 -> Apply

## Spring Framework
- 가장 많이 사용하는 Java 기반 응용 프로그램 개발 프레임워크
- 모든 Java 애플리케이션 개발에 이용할 수 있으며 Java EE 위의 웹 애플리케이션 개발에 주로 사용되고 있다.
- 정부 표준 프레임 워크도 마찬가지이다. 
- 스프링 프레임 워크를 사용은 xml을 이용하는 방법과 자바 어노테이션을 이용하는 방법 두 가지로 구분할 수 있다.
- 보통 Maven이나 Gradle을 이용해 라이브러리를 다운 받아 사용한다.
- 특징
    - 메모리를 적은 컨테어너로써 자바 객체를 직접 관리한다.
    - POJO(Plain Old Java Object) 방식의 프레임 워크
    - IOC(Inversion of Control) 지원
    - DI(Dependency Injection) 지원
    - AOP(Aspect-Oriented Programming) 지원
    - iBATIS, myBATIS, Hibernate 등의 데이터베이스 라이브러리를 지원한다.
    - 이외 특징
        - Java 파일에서 Java 코드를 줄일 수 있다.
        - 다수의 개발자와 동시에 프로젝트 하기가 용이하다.
        - 반복되는 작업을 줄일 수 있어 기능 개발에 집중할 수 있다.
        - 프로젝트 관리가 용이하다.
- xml에 객체를 생성 위한 코드를 작성한다.
- IoC 컨테이너를 이용하여 bean 객체들을 관리한다.

### Spring Framework 기능
- 객체 생성과 소멸 시 호출될 메서드 등록
    - 객체가 생성될 때 생성자가 호출된 이후 init-method에 설정한 메서드가 자동으로 호출되고 IoC 컨테이너의 close 메서드를 호출하면 객체가 소멸되며 destroy-method에 설정한 메서드가 자동으로 호출된다.
    - init-method와 destroy-method가 설정되어 있지 않다면 default-init-method와 default-destory-method에 설정되어 있는 메서드를 호출한다.
    - init-method; 생성자 호출 이후 자동으로 호출된다.
    - destory-method: 객체 소멸될 때 자동으로 호출된다. -> [ctx.close()일 때 소멸]
    - default-init-method: init- method를 설정하지 않은 경우 자동으로 호출된다.
    - default-destory-method: destory-method를 설정하지 않은 경우 자동으로 호출된다.

### Maven
- 자바 프로젝트의 빌드를 자동으로 해주는 도구이다.
- XML에 작성한 프로젝트 정보를 바탕으로 컴파일하고 라이브러리를 연결하는 등 작업을 해주는 도구이다.
- Maven 서버를 통해 라이브러리를 다운받아 설정하는 작업도 수행한다.
- pom.xml에 maven 프로젝트와 관련된 사항을 작성한다.

### IoC(Inversion of Contrl) 컨테이너
- 프로그래밍을 작성할 때 프로그램이 흘러가는 흐름이나 생성되는 객체에 대한 제어권을 개발자가 만드는 개발자가 가지는 것과 달리 프레임워크가 가지는 것을 의미한다.
- 프레임워크가 사용하는 파일에 작성하면 이를 토대로 프레임워크가 객체를 생성하여 반환하고 코드가 동작하는 순서를 결정하게 된다.
- 종류: BeanFactory, ApplicationContext
    - BeanFactory: 클래스를 통해 객체를 생성하고 전달하며 상속 등 객체 간의 관계를 형성하고 관리한다.
    - ApplicationContext: BeanFactory 기능에 더하여 국제화 지원 등 문자열에 관련된 다양한 기능을 제공하고 리스너로 등록되어 있는 Bean에 이벤트를 발생시킬 수 있다.
<img src=".img/IoC동작.PNG"/>
- Metadata: xml이나 java 코드를 가지고 설정한 정보이다.
- JAVA POJO classes: 만들어 놓은 객체이다.
- 동작: IoC 컨테이너가 Metadata에서 읽어와서 그 정보를 토대로 POJO class를 가지고 객체를 만들어서 그 객체를 사용할 수 있도록 반환한다.

#### POJO(Plain Old Java Object) Class
- 자바 모델이나, 기능, 프레임워크 등에 따르지 않고 독립적이며 단순한 기능만을 가진 객체이다.
- 자바에서는 이러한 객체를 Bean라고 부른다.
#### BeanPostProcessor
- BeanPostProcessor 인터페이스를 구현한 클래스를 정의하면 Bean 객체를 생성할 때 호출될 init 메서드 호출을 가로채 다른 메서드를 호출 할 수 있도록 할 수 있다.
- postProcessBeforeInitialization: init-method에 지정된 메서드가 호출되기 전에 호출된다.
- postProcessAfterInitialization: init-method에 지정된 메서드가 호출된 후에 호출된다.

### Bean
- beans : 데이터를 관리하기 위한 목적으로 사용하거나 도구적인 성격을 가지고 있는 method 들을 가지고 있는 Class들을 모아둔다.
    - beans.xml 작성 시 내용
        - beans.xml에 작성한 후 getBean 메소드를 통해서 받아오는 것이 아니라 참조변수를 선언해 놓으면 객체 주소값이 자동으로 들어가는 자동 주입이라는 기능이 있다. 자동 주입을 이용하게 되면 id 속성이 필요없다.
            - getBean으로 생성된 객체는 더이상 생성되지 않고 주소값만 받아온다. -> Singleton [같은 객체의 같은 주소값만을 계속 받기 때문이다.]
        [bean 태그의 기본 속성]
        - `lazy-init= "true"`을 사용하면 xml을 로딩할 때 객체 생성을 하지 않고 getBean을 사용할 때만 객체를 생성한다.
        - scope: 객체의 범위를 설정한다.
            - singleton: 객체를 하나만 생성해서 사용한다.
            - Prototype: xml 로딩할 때 객체가 생성되지 않고 getBean 메소드로 객체를 호출할 때 마다 새로운 객체를 생성한다.
- bean 객체의 생명주기
    - Singleton인 경우 xml 파일을 로딩 할 떄 객체가 생성된다.
    - Singleton이고 lazy-init 속성이 true인 경우 getBean 메서드를 사용할 때 객체가 생성된다.
    - Prototype 일 경우 getBean 메서드를 사용할 때 객체가 생성된다.

### Dependency Injection
- Bean 객체를 생성할 때 Bean 객체가 관리할 값이나 객체를 주인하는 것을 의미한다.
- Bean 객체 생성 후 Bean 객체가 가질 기본 값을 자바 코드로 설정하는 것이 아닌 Bean을 정의하는 xml 코드에서 정의하는 개념이다.
- 컬렉션 주입
    - Bean을 정의할 때 주입해야 하는 멤버가 컬렉션인 경우 컬렉션이 관리할 객체를 초기에 설정할 수 있다.
    - List, Map, Set Property를 사용
- 자동 주입
    - 이름, 타입, 생성자로 통할 수 있으며 auto wire라는 용어로 부른다.

### Annotaion 활용
- benas.xml 파일에 등록했던 내용을 java 파일에 작성할 수 있다. xml은 값을 정해줘야 하는 반면 java 파일은 코드를 자유롭게 작성할 수 있다.
- Bean 설정 파일에 `<context:annotation-config/>` 코드를 추가하면 빈에 대한 설정을 xml 파일이 아닌 Bean 클래서 Annotation을 검색해 반영하게 된다. 
#### Annotation 설명
- 초기화 방법
```
AnnotationConfigApplicationContext ctx 
			= new AnnotationConfigApplicationContext();
ctx.register(BeanConfig.class);
ctx.refresh();
```
- @Configuration:  현재 자바 파일이 빈 등록을 위한 자바 파일임을 알려준다.
-  @Bean: bean 객체를 정의할 때 사용한다. 메서드의 이름이 bean의 이름이 된다.
    - @Bean(name=[이름]): bean의 이름을 새롭게 벙의한다.
    - @Lazy: lazy-init 속성을 지정한다.
    - @Scope:  bean의 scope를 설정한다.
    - @Primary: primary 속성을 지정한다.
- init, destroy 메서드
    - `@Bean(initMethod = "bean2_init", destroyMethod = "bean2_destroy")`
- 자동 주입
    - `@Bean(autowire = 주입방식)`: 자동 주입 방식을 설정한다.
    - `Autowire.BY_NAME `: 이름을 통한 자동 주입이다.
    - `Autowire.BY_TYPE `: 타입을 통한 자동 주입이다.
- Bean 설정
    - @Required: 반드시 주인 해야 할 프로퍼티로 설정한다.
    - @Autowired: 객체 타입을 통해 bean 객체를 자동으로 주입한다.
    - @Qualifier: @Autowired는 주입 시 같은 타입의 Bean의 여러 개 정의되어 있다면 Qualifier에 설정 되어 있는 bean을 찾아 주입한다.
    - 생성자 주입 @Value: 생성자에 주인 시 참조변수 타입 변수들은 자동으로 주입되고 기본 자료형 및 문자열 값만 주입을 설정해주면 된다.

### Component
- @Component를 사용하면 Bean Configuration 파일에 Bean을 등록하지 않아도 자동으로 등록된다.
    - Xml을 이용하는 방식
        `<context:component-scan base-package="kr.co.softcampus.beans"/>`
    - Bean Configuration Class 사용
        `@ComponentScan(basePackages = {"kr.co.softcampus.beans", "kr.co.softcampus.bean2"})`
### A. 자바 프로젝트
- 문제점
    - 자바 프로젝트에서 클래스가 변경되면 객체 생성 부분과 참조 변수 선언 부분 모두를 수정해야 한다.
    - 즉, 유지보수가 불편해 진다.

### B. 다형성
- 자바에서의 모든 객체는 부모클래스형 참조변수나 구현한 인터페이스 변수에 담을 수 있다. (overwriting)
- 이러한 참조변수를 통해 메서드를 호출하면 Overwriting 된 메서드가 호출된다.
- 문제점
    - 다형성 개념을 사용하면 클래스가 변경되었을 때 참조 변수 선언 부분은 수정하지 않아도 되지만 객체를 생성하는 부분의 코드는 변경되어야 한다.
    - 유수보수가 어렵다.

### ===> A, B의 문제점을 해결하기 위해 사용하는 것이 Spring Framework이다.
    - Spring Framework와 같은 경우 beans.xml 파일만을 수정하면 된다.

#### 기타
- logback 과 slf4j를 다운 후 연결한 후 다음과 같은 코드를 pom.xml에 추가하면 runtime 중에 로그를 볼 수 있다.
```
		<!-- logback -->
		<!-- https://mvnrepository.com/artifact/ch.qos.logback/logback-classic -->
		<dependency>
			<groupId>ch.qos.logback</groupId>
			<artifactId>logback-classic</artifactId>
			<version>${ch.qos.logback}</version>
			<exclusions>
				<exclusion>
				<!-- logback이 연결해서 사용할 수 있도록 -->
					<groupId>org.slf4j</groupId>
					<artifactId>slf4j-api</artifactId>
				</exclusion>
			</exclusions>
			<scope>runtime</scope>
```

#### Eclipse 단축키
- ctrl + Shift +/ : 주석
- ctrl + Shift + \: 주석 풀기

## Installation
- 설치할 프로그램 목록
    - JDK(Java 8.0 이상 권장)
    - Elicpse