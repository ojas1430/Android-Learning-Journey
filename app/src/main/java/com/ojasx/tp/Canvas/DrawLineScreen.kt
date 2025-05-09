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
fun DrawLineScreen() {
    Canvas(modifier= Modifier.fillMaxSize()) {
        val CanvasWidth = size.width
        val CanvasHeight = size.height

        drawLine(
            color = Color.Red,
            start = Offset(0f,CanvasHeight/2),
            end = Offset(CanvasWidth,CanvasHeight/2),
            strokeWidth = 10f
        )
    }
}