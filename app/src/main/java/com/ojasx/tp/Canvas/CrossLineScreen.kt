package com.ojasx.tp.Canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CrossLineScreen() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawLine(
            color = Color.Red,
            start = Offset(canvasWidth/2,0f),
            end = Offset(canvasWidth/2,canvasHeight),
            strokeWidth = 10f
        )
        drawLine(
            color = Color.Red,
            start = Offset(0f,canvasHeight/2),
            end = Offset(canvasWidth,canvasHeight/2),
            strokeWidth = 10f
        )
    }
}