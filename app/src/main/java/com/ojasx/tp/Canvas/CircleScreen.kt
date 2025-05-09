package com.ojasx.tp.Canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CircleScreen() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawCircle(color = Color.Red,
            radius = size.minDimension / 4,
            style = Stroke(50f,
                pathEffect = PathEffect.dashPathEffect(
                    floatArrayOf(10f,30f)
                ))
            )

    }
}