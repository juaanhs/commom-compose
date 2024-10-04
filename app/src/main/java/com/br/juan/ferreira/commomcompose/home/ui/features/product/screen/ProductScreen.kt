package com.br.juan.ferreira.commomcompose.home.ui.features.product.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.br.juan.ferreira.commomcompose.home.domain.product.ProductSectionViewObject
import com.br.juan.ferreira.commomcompose.home.domain.product.createProductSectionViewObject
import com.br.juan.ferreira.commomcompose.home.ui.features.product.components.ProductSection

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun ProductPreview() {
    ProductScreen(createProductSectionViewObject())
}

@Composable
fun ProductScreen(data: ProductSectionViewObject) {
    ProductContent(data)
}

@Composable
private fun ProductContent(data: ProductSectionViewObject) {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Spacer(Modifier)
        ProductSection("Produtos em destaque", data.products)
        ProductSection("Burguers", data.products)
        ProductSection("Pizzas", data.products)
        ProductSection("Fries", data.products)
        Spacer(Modifier)
    }
}
