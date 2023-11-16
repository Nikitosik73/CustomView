package ru.paramonov.customviewcompose.samples

import android.graphics.Paint.Style
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DrawPath() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Cyan, Color.Magenta),
                    start = Offset(x = 0.dp.toPx(), 100.dp.toPx()),
                    end = Offset(x = 100.dp.toPx(), y = 100.dp.toPx()),
                    tileMode = TileMode.Mirror
                )
            )
    ) {
        drawPath(
            path = Path().apply {
                moveTo(x = center.x, y = 100.dp.toPx())
                lineTo(x = center.x + 25.dp.toPx(), y = 150.dp.toPx())
                lineTo(x = center.x + 75.dp.toPx(), y = 150.dp.toPx())
                lineTo(x = center.x + 25.dp.toPx(), y = 180.dp.toPx())
                lineTo(x = center.x + 50.dp.toPx(), y = 230.dp.toPx())
                lineTo(x = center.x, y = 200.dp.toPx())

                moveTo(x = center.x, y = 100.dp.toPx())
                lineTo(x = center.x - 25.dp.toPx(), y = 150.dp.toPx())
                lineTo(x = center.x - 75.dp.toPx(), y = 150.dp.toPx())
                lineTo(x = center.x - 25.dp.toPx(), y = 180.dp.toPx())
                lineTo(x = center.x - 50.dp.toPx(), y = 230.dp.toPx())
                lineTo(x = center.x, y = 200.dp.toPx())
            },
            color = Color.Red,
            style = Fill
        )
    }
}

@Composable
fun Dp.toPx() = with(LocalDensity.current) {
    this@toPx.toPx()
}