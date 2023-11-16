package ru.paramonov.customviewcompose.samples.les1

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun CanvasTest() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        drawLine(
            color = Color.White,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(x = size.width, y = 0f),
            end = Offset(x = 0f, y = size.height),
            strokeWidth = 1.dp.toPx()
        )
        drawCircle(
            color = Color.White,
            radius = 50.dp.toPx(),
            style = Stroke(width = 1.dp.toPx())
        )
    }
}