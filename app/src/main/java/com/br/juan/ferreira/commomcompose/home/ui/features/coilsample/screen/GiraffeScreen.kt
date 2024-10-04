package com.br.juan.ferreira.commomcompose.home.ui.features.coilsample.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.br.juan.ferreira.commomcompose.home.domain.coilsample.GiraffeViewObject
import com.br.juan.ferreira.commomcompose.home.domain.coilsample.createGiraffeViewObject
import com.br.juan.ferreira.commomcompose.home.ui.features.coilsample.components.GiraffeDescription
import com.br.juan.ferreira.commomcompose.home.ui.features.coilsample.components.GiraffeImage

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun GiraffePreview() {
    GiraffeScreen(createGiraffeViewObject())
}

@Composable
fun GiraffeScreen(data: GiraffeViewObject) {
    GiraffeContent(data)
}

@Composable
private fun GiraffeContent(data: GiraffeViewObject) {
    Row(
        Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        GiraffeImage(data.imgUrl)
        GiraffeDescription(data.name, data.age)
    }
}
