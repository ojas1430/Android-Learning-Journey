package com.ojasx.tp.Canvas

import android.util.Size
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RectangleScreen() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawRect(color = Color.Red,
            size = _root_ide_package_.androidx.compose.ui.geometry.Size(0f,canvasHeight/4),
            topLeft = Offset(0f,canvasHeight/3)
            )
    }
}