package com.br.juan.ferreira.commomcompose.home.domain.product

import androidx.annotation.DrawableRes
import com.br.juan.ferreira.commomcompose.home.R
import java.math.BigDecimal

data class Product(
    val name: String,
    val price: BigDecimal,
    @DrawableRes val image: Int,
)

fun createProductViewObject(
    name: String = "Nome Produto",
    price: BigDecimal = BigDecimal("26.99"),
    image: Int = R.drawable.ic_placeholder,
): Product =
    Product(
        name,
        price,
        image,
)
