package ru.paramonov.customviewcompose.samples.les1

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Oleg() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        // O
        drawCircle(
            color = Color.White,
            radius = 35.dp.toPx(),
            style = Stroke(width = 1.dp.toPx()),
            center = Offset(x = 50.dp.toPx(), y = 100.dp.toPx())
        )
        // Л
        drawLine(
            color = Color.White,
            start = Offset(x = 120.dp.toPx(), y = 65.dp.toPx()),
            end = Offset(x = 101.dp.toPx(), y = 135.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(x = 120.dp.toPx(), y = 65.dp.toPx()),
            end = Offset(x = 142.dp.toPx(), y = 135.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        // E
        drawLine(
            color = Color.White,
            start = Offset(x = 168.dp.toPx(), y = 65.dp.toPx()),
            end = Offset(x = 168.dp.toPx(), y = 135.dp.toPx()),
            strokeWidth = 1.dp.toPx()
        )
        drawLine(
            color = Color.White,
            strokeWidth = 1.dp.toPx(),
            start = Offset(x = 168.dp.toPx(), y = 65.dp.toPx()),
            end = Offset(x = 208.dp.toPx(), y = 65.dp.toPx())
        )
        drawLine(
            color = Color.White,
            strokeWidth = 1.dp.toPx(),
            start = Offset(x = 168.dp.toPx(), y = 100.dp.toPx()),
            end = Offset(x = 198.dp.toPx(), y = 100.dp.toPx())
        )
        drawLine(
            color = Color.White,
            strokeWidth = 1.dp.toPx(),
            start = Offset(x = 168.dp.toPx(), y = 135.dp.toPx()),
            end = Offset(x = 208.dp.toPx(), y = 135.dp.toPx())
        )
        // Г
        drawLine(
            color = Color.White,
            strokeWidth = 1.dp.toPx(),
            start = Offset(x = 229.dp.toPx(), y = 65.dp.toPx()),
            end = Offset(x = 229.dp.toPx(), y = 135.dp.toPx())
        )
        drawLine(
            color = Color.White,
            strokeWidth = 1.dp.toPx(),
            start = Offset(x = 229.dp.toPx(), y = 65.dp.toPx()),
            end = Offset(x = 259.dp.toPx(), y = 65.dp.toPx())
        )
    }
}