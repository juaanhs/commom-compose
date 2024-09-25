package com.br.juan.ferreira.commomcompose.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.juan.ferreira.commomcompose.home.ui.theme.CommomComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
//    private val viewModel: OnboardingViewModel by viewModels()

    // Command + Option + L = Identar codigo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        enableEdgeToEdge()
        setContent {
            CommomComposeTheme {
                Home()
            }
        }
    }
}

data class InfoCardData(
    val title: String? = null,
    val infoItems: List<Pair<String, String>> = emptyList(),
)

@Preview(
    showBackground = true,
//    widthDp = 1000,
    showSystemUi = true,
)
@Composable
fun Home() {
//    ProductSection()
    val data =
        InfoCardData(
            title = "Informações do Cliente",
            infoItems =
                listOf(
                    "Nome Completo" to "Maria Aparecida Silva",
                    "CPF" to "456.789.123-00",
                    "Data de Nascimento" to "15/08/1980",
                    "Telefone" to "(11) 99999-8888",
                    "Email" to "maria.silva@email.com",
                    "Endereço" to "Rua das Flores, 123",
                    "Cidade" to "São Paulo",
                    "Estado" to "SP",
                ),
        )
    InfoCard(data)
}

@Composable
fun InfoCard(data: InfoCardData) {
    Surface(
        Modifier.padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        shadowElevation = 0.5.dp,
    ) {
        InfoSection(data)
    }
}

@Composable
private fun InfoSection(data: InfoCardData) {
    Column(
        Modifier
            .background(color = colorResource(id = R.color.blue_cyan)),
    ) {
        if (!data.title.isNullOrEmpty()) {
            Title(data.title)
            HorizontalDivider(color = Color.Gray, thickness = 0.3.dp)
        }

        LazyColumn {
            items(data.infoItems) { item ->
                InfoItemSection(item.first, item.second)
            }
        }
    }
}

@Composable
fun InfoItemSection(
    label: String,
    value: String,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight(450),
            color = colorResource(id = R.color.blue_primary),
        )
        Text(
            text = value,
            fontWeight = FontWeight(450),
            fontSize = 16.sp,
            color = Color.Black,
        )
    }
}

@Composable
private fun Title(title: String) {
    Text(
        modifier =
            Modifier.padding(
                start = 16.dp,
                top = 18.dp,
                end = 16.dp,
                bottom = 18.dp,
            ),
        fontSize = 18.sp,
        fontWeight = FontWeight(700),
        text = title,
        color = colorResource(id = R.color.blue_primary),
    )
}

// -----------------------------

@Composable
fun ItemSection() {
    Column(
        Modifier
            .background(color = Color.Blue)
            .width(50.dp)
            .height(100.dp),
    ) { }
}

@Composable
fun ProductSection() {
    Column {
        Text(
            modifier =
                Modifier
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
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
                        bottom = 16.dp,
                    ).fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Spacer(Modifier)
            ProductItem()
            ProductItem()
            ProductItem()
            Spacer(Modifier)
        }
    }
}

@Composable
fun ProductItem() {
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
                    painter = painterResource(id = R.drawable.ic_launcher_background),
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
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700), // TextStyle BOLD
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis, // Caso texto seja grande ele corta com ...
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "R$ 22,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )
            }
        }
    }
}
