package com.br.juan.ferreira.commomcompose.home.domain.product

import com.br.juan.ferreira.commomcompose.home.R
import java.math.BigDecimal

data class ProductSectionViewObject(
    val title: String,
    val products: List<Product>,
)

fun createProductSectionViewObject(
    title: String = "Titulo da seção",
    products: List<Product> =
        listOf(
            Product(
                name = "Burguer",
                price = BigDecimal("26.99"),
                image = R.drawable.ic_burguer,
            ),
            Product(
                name = "Fries",
                price = BigDecimal("19.99"),
                image = R.drawable.ic_fries,
            ),
            Product(
                name = "Pizza",
                price = BigDecimal("29.99"),
                image = R.drawable.ic_pizza,
            ),
        ),
): ProductSectionViewObject =
    ProductSectionViewObject(
        title,
        products,
    )
