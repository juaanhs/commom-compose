package com.br.juan.ferreira.commomcompose.home.domain.coilsample

data class GiraffeViewObject(
    val name: String,
    val age: String,
    val imgUrl: String,
)

fun createGiraffeViewObject(
    name: String = "Giraffe",
    age: String = "10 age",
    imgUrl: String =
        "https://img.freepik.com/vetores-premium/ilustracao-em-vetor-girafa-bonitinha_8319-1325.jpg",
): GiraffeViewObject =
    GiraffeViewObject(
        name,
        age,
        imgUrl,
    )
