package com.br.juan.ferreira.commomcompose.home.ui.features.coilsample.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun GiraffeDescriptionPreview() {
    GiraffeDescription(
        name = "Giraffe",
        age = "10 age",
    )
}

@Composable
fun GiraffeDescription(name: String, age: String) {
    Column {
        Text(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            text = name,
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            text = age,
        )
    }
}
