fun main(args: Array<String>) {
    /*
    1. 인사말 출력
    2. 사용자 이름 받기
    3. 입력 받은 사용자 이름 출력
     */
    println("안녕하세요!")
    println("쇼핑을 계속 하시려면 이름을 입력해주세요")

    val name = readLine()
    println("""
        반갑습니다. $name 님
    """.trimIndent())
    //trimIndent() 개행으로 생기는 부분을 없애주는것
}