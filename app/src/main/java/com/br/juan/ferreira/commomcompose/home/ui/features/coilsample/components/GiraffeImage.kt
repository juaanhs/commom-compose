package com.br.juan.ferreira.commomcompose.home.ui.features.coilsample.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.br.juan.ferreira.commomcompose.home.R

@Preview
@Composable
private fun GiraffeImagePreview() {
    GiraffeImage(
        "https://img.freepik.com/vetores-premium/ilustracao-em-vetor-girafa-bonitinha_8319-1325.jpg",
    )
}

@Composable
fun GiraffeImage(imgUrl: String) {
    AsyncImage(
        model = imgUrl,
        contentDescription = "Fotinha da girafa",
        modifier =
            Modifier
                .size(200.dp)
                .clip(CircleShape),
        contentScale = ContentScale.Crop,
        filterQuality = FilterQuality.High,
        placeholder = painterResource(R.drawable.ic_placeholder),
        error = painterResource(id = R.drawable.ic_img_error),
    )
}
