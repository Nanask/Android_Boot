package screen

class ShoppingCategory {

    fun showCategories() {
        /*
        1. 상품 카테고리 표기
        2. 사용자 입력 받기
        3. 사용가자 기대하는 값을 입력하지 않는 경우에 대한 처리
         */
        // 1번
        // 우선 카테고리 를 담고 있을 변수를 선언
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }

        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        // 2번
        var selectedCategory = readLine()

        //3번
        // 사용자가 입력해야 하는 값을 입력하도록 계속 반복하기
        // while의 조건문을 이용해서 입력한 값이 없거나 존재하지 않는 값일 경우 다시 입력할 수 있도록 반복
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readLine()
        }
        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동
        } else {
            // TODO 2. 카테고리 상품 목록 보여주기
            if(categories.contains(selectedCategory)) {
                // 존재하면 true  , 존재하지 않으면 false
            } else {
                showErrormassage(selectedCategory)
            }

        }
    }

    private fun showErrormassage(selectedCategory: String?) {
        // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
        // 존재하지 않으면 입력한 값을 보여주고
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다.")
        // 입력값을 다시 입력할 수 있도록 반복
        showCategories()
    }
}