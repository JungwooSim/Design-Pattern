## Design Pattern
특정 문맥에서 공통적으로 발생할 수 있는 문제를 재사용 가능한 해결책이다.

### Singleton
Singleton은 인스턴스의 개수를 제한하여 생성 후 인스턴스를 공유하는 디자인 패턴중 하나이다.

**Why?**
<br>
하드웨어는 물리적이므로 한계가 있다.
<br>
Singleton은 인스턴스의 개수를 제한 후 공유하며 사용하기 때문에 공간의 효율성을 같게 된다.
- - -
### Strategy
Strategy는 Interface를 통해 느슨하게 연결하고, 여러개의 구현체를 만들어 필요에 따라 다른 기능을 주입할 수 있다.

**Why?**<br>
1.유연하고 확장성이 뛰어나다.<br>
2.코드 중복 방지
- - -
### Template
Template는 알고리즘의 구조를 메소드에 정의 후, 하위 클래스에서 알고리즘의 변경없이 재정의 하는 패턴이다.

**Why?**<br>
알고리즘이 단계별로 나누어 지거나, 같은 역할을 하는 메소드 이지만 여러곳에서 다른 기능을 해야될 때 사용할 수 있다.  
- - -
### Template CallBack Method
Template 이란 단어는 고정된 작업 흐름을 가진 코드를 재사용한다는 의미에서 붙여진 이름이다.<br>
Callback은 Template 안에서 호출되는 것을 목적으로 만들어진 객체이다.<br>
strategy 패턴과의 차이점은 strategy는 여러 개의 메소드를 가진 일반적인 인터페이스를 사용하는 반면에 Template CallBack 패턴은 단일 메소드를 가진 인터페이스를 사용한다.

**Why?**<br>
보통 중복된 코드를 메소드로 분리할 수 있게 되는데, Template CallBack 패턴을 사용하게되면 메소드 조차도 줄일 수 있다. 
- - - 
### Proxy
클라이언트로부터 요청을 받을 수 있는데, 이것을 대리(Proxy) 해주는 것을 Proxy 패턴이라고 한다.

**Why?**<br>
특별한 상황에서 target에 대한 접근권한을 제어할 수 있다.(Protected Proxy)<br>
객체 사용 시점을 제어하여 Lazy Initialisation 가능하다.(Virtual Proxy)

용어<br>
targeet : proxy를 통해 받은 요청을 실제로 처리하는 실제 오브젝트
- - -
