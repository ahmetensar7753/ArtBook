package com.ahmetensarbesir.artbook2.model

data class ImageResponse(
    val hits: List<ImageResult>,
    val total : Int,
    val totalHits: Int,
)
