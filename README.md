# 객체
식별자, 상태, 행동을 가진 실체

### 객체를 분리할때의 장점
함수 하나에서 모든 객체를 작성한다면, 코드가 길어지고 가독성이 낮아 유지보수가 어렵다.  
분리한다면 어디에서 실행되고 있는지 알아보기 편해지고, 함수가 간결해져서 유지보수가 편리해진다. 

현재 만들고 있는 쇼핑앱에서 쇼핑앱 실행 -> 카테고리 보여주기 -> 카테고리별 상품 보여주기 등  
모두 main 에서 보여주는 것이 아닌, 객체로 나누고 클래스를 분리해서 보여줄 계획이다.

# 클래스
* PascalCase를 사용한다.
* 생성자에 Property 를 파라미터로 받을 수 있다.
* 상속을 통해 계층구조로 만들 수 있다.
* 상속을 허용하려면 open 클래스를 추가해야하며, 동시에 여러 클래스를 상속 받을 수 없다.

## 프로퍼티
* 데이터를 저장하는 field + 접근자(getter / setter)

## 인스턴스
* 클래스로 만드는 객체
  * 생성자에 파라미터가 있을 때 인스턴스화 하는 방법
  *     private val product = Product("패션", "겨울 패딩")
  * 생성자에 파라미터가 없는 경우 인스턴스화 하는 방법
  *     fun store {
          var store = Store()}
  
## 추상클래스
* 인스턴스화가 불가하다.
* subClass 에서 구현해야 한다.

# 인터페이스
* 프로퍼티를 정의할 수 있다.
* 값을 할당해서 상태 저장은 불가능하나 접근자를 제공할 수 있다.
* 동시에 여러 클래스를 상속받을 수 있다.

# 함수
* Named argument 알아보기
* 반환하는 타입을 생략할 수 있다.
* 클래스 내의 함수를 호출할 수 있다.
  * fun main(args: Array<String>) {
    val shoppingHome = ShoppingHome()
    shoppingHome.start()
  * 가능한 이유는 클래스 맴버함수, 클래스 내에 함수가 갖고 있기 때문
  
