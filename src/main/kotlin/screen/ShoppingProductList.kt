package screen

import data.Product

class ShoppingProductList {

    // TODO 2. 카테고리 상품 목록 보여주기
    private val product = arrayOf(
        Product("패션", "겨울 패딩"),
        Product("패션", "겨울 바지"),
        Product("전자기기", "핸드폰"),
        Product("전자기기", "블루투스 이어폰"),
        Product("전자기기", "노트북"),
        Product("반려동물용품", "건식사료"),
        Product("반려동물용품", "습식사료"),
        Product("반려동물용품", "치약"),
        Product("반려동물용품", "간식"),
    )
    // Label 을 기준으로 카테고리를 분리하기
    private val categories: Map<String, List<Product>> = product.groupBy { product ->
        product.categoryLabel
    }

    // 사용자가 입력한 정보를 매개변수로 전달받음
    fun showProduct(selectCategory: String) {
        val categoryProducts = categories[selectCategory]

        // 상품이 하나라도 존재한다면 선택한 카테고리를 보여주기
        if(!categoryProducts.isNullOrEmpty()) {
            println("""
                선택하신 [$selectCategory] 카테고리 상품입니다.
            """.trimIndent())
            val productSize = categoryProducts.size

            for(index in 0 until productSize!!) {
                println("${index}. ${categoryProducts[index].name}")
            }
            // 등록된 상품이 없으면 보여주기
        }else {
            showEmptyProductMessage(selectCategory)
        }
    }

    private fun showEmptyProductMessage(selectCategory: String) {
        println("[$selectCategory] 카테고리 상품이 등록되기 전입니다.")
    }



}