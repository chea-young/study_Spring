# study_Spring
Spring을 공부한 것을 정리하는 Repository
- Spring Framework 버전 5를 중심으로 수업하지만 버전 4에서 테스트가 완료된 상태이다.
- 윤재성의 Spring Framework 개발자를 위한 실습을 통한 입문 과정

## Spring Framework
- 가장 많이 사용하는 Java 기반 응용 프로그램 개발 프레임워크
- 모든 Java 애플리케이션 개발에 이용할 수 있으며 Java EE 위의 웹 애플리케이션 개발에 주로 사용되고 있다.
- 정부 표준 프레임 워크도 마찬가지이다. 
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

## Installation
- 설치할 프로그램 목록
    - JDK(Java 8.0 이상 권장)
    - Elicpse