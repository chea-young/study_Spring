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
- beans : 데이터를 관리하기 위한 목적으로 사용하거나 도구적인 성격을 가지고 있는 method 들을 가지고 있는 Class들을 모아둔다.
- xml에 객체를 생성 위한 코드를 작성한다.

### Maven
- 자바 프로젝트의 빌드를 자동으로 해주는 도구이다.
- XML에 작성한 프로젝트 정보를 바탕으로 컴파일하고 라이브러리를 연결하는 등 작업을 해주는 도구이다.
- Maven 서버를 통해 라이브러리를 다운받아 설정하는 작업도 수행한다.
- pom.xml에 maven 프로젝트와 관련된 사항을 작성한다.

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