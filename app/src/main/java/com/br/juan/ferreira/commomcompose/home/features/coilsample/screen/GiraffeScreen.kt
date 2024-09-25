package com.br.juan.ferreira.commomcompose.home.features.coilsample.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.br.juan.ferreira.commomcompose.home.R

@Composable
fun GiraffeScreen() {
    GiraffeContent()
}

@Preview
@Composable
fun GiraffePreview() {
    GiraffeScreen()
}

@Composable
fun GiraffeContent() {
    // botoes layout geral
    ShowGiraffeDescription()
}

@Composable
fun ShowGiraffeDescription() {
    val imgUrl =
        "https://img.freepik.com/vetores-premium/ilustracao-em-vetor-girafa-bonitinha_8319-1325.jpg"

    Row(Modifier
        .fillMaxSize()
        .background(Color.Yellow),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        ShowImageGiraffe(imgUrl)

        ShowDescriptionGiraffe()
    }
}

@Composable
private fun ShowDescriptionGiraffe() {
    Column {
        Text(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            text = "Giraffe",
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            text = "10 age",
        )
    }
}

@Composable
private fun ShowImageGiraffe(imgUrl: String) {
    val imgUrlLoading =
        "https://dslv9ilpbe7p1.cloudfront.net/wQvYdj8UNDn0Klz77JbmUw_store_header_image"

    AsyncImage(
        model = imgUrl,
        contentDescription = "Fotinha da girafa",
        modifier =
            Modifier
                .size(200.dp)
                .clip(CircleShape),
        contentScale = ContentScale.Crop,
        filterQuality = FilterQuality.High,
        placeholder = rememberAsyncImagePainter(model = imgUrlLoading),
        error = painterResource(id = R.drawable.ic_img_error),
    )
}
