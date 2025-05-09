package com.ojasx.tp.Canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DiagonalLine(modifier: Modifier = Modifier) {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawLine(
            color = Color.Red,
            start = Offset(0f,0f),
            end = Offset(canvasWidth,canvasHeight),
            strokeWidth = 10f
        )
    }
}