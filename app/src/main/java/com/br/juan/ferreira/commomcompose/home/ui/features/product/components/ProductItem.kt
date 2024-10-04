package com.br.juan.ferreira.commomcompose.home.ui.features.product.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.juan.ferreira.commomcompose.home.domain.product.Product
import com.br.juan.ferreira.commomcompose.home.domain.product.createProductViewObject
import com.br.juan.ferreira.commomcompose.home.extensions.toBrazilianCurrency

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun ProductItemPreview() {
    ProductItem(createProductViewObject())
}

@Composable
fun ProductItem(product: Product) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp,
    ) {
        Column(
            Modifier
                .heightIn(min = 250.dp, max = 300.dp)
                .width(200.dp),
        ) {
            val imageSize = 100.dp
            Box(
                Modifier
                    .height(imageSize)
                    .fillMaxWidth()
                    .background(
                        brush =
                            Brush.horizontalGradient(
                                colors = listOf(Color.Red, Color.Yellow),
                            ),
                    ),
            ) {
                Image(
                    modifier =
                        Modifier
                            .size(imageSize)
                            .offset(y = imageSize / 2)
                            .clip(shape = CircleShape)
                            .align(BottomCenter),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = product.image),
                    contentDescription = "Product Image",
                )
            }
            Spacer(modifier = Modifier.height(50.dp))

            Column(
                modifier =
                    Modifier
                        .padding(16.dp),
            ) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = product.price.toBrazilianCurrency(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )
            }
        }
    }
}
