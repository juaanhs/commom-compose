package com.br.juan.ferreira.commomcompose.home.ui.features.product.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.juan.ferreira.commomcompose.home.R
import com.br.juan.ferreira.commomcompose.home.domain.product.ProductViewObject
import java.math.BigDecimal

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun ProductSectionPreview() {
    ProductSection()
}

@Composable
fun ProductSection() {
    Column {
        Text(
            modifier =
                Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                    ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            text = "Promoções",
        )
        Row(
            modifier =
                Modifier
                    .padding(
                        top = 8.dp,
                    ).fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Spacer(Modifier)
            ProductItem(
                ProductViewObject(
                    name = "Burguer",
                    price = BigDecimal("26.99"),
                    image = R.drawable.ic_burguer,
                ),
            )
            ProductItem(
                ProductViewObject(
                    name = "Fries",
                    price = BigDecimal("19.99"),
                    image = R.drawable.ic_fries,
                ),
            )
            ProductItem(
                ProductViewObject(
                    name = "Pizza",
                    price = BigDecimal("29.99"),
                    image = R.drawable.ic_pizza,
                ),
            )
            Spacer(Modifier)
        }
    }
}
