fun main(args: Array<String>) {
    /*
    1. 인사말 출력
    2. 사용자 이름 받기
    3. 입력 받은 사용자 이름 출력
     */
    println("안녕하세요!")
    println("쇼핑을 계속 하시려면 이름을 입력해주세요")

    // 입력받은 값ㄴ
    val name = readLine()
    println("""
        반갑습니다. $name 님
    """.trimIndent())
    //trimIndent() 개행으로 생기는 부분을 없애주는것

    /*
    1. 상품 카테고리 표기
    2. 사용자 입력 받기
    3. 사용가자 기대하는 값을 입력하지 않는 경우에 대한 처리
     */
    // 1번
    // 우선 카테고리 를 담고 있을 변수를 선언
    val categories = arrayOf("패션","전자기기", "반려동물용품")
    for(category in categories) {
        println(category)
    }

    println("=> 장바구니로 이동하시려면 #을 입력해주세요")

    // 2번
    var selectedCategory = readLine()

    //3번
    // 사용자가 입력해야 하는 값을 입력하도록 계속 반복하기
    // while의 조건문을 이용해서 입력한 값이 없거나 존재하지 않는 값일 경우 다시 입력할 수 있도록 반복
    while(selectedCategory.isNullOrBlank()) {
        println("값을 입력해주세요")
        selectedCategory = readLine()
    }
    if(selectedCategory == "#") {
        // TODO 1. 장바구니 이동
    } else {
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
    }

}