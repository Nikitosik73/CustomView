package ru.paramonov.customviewcompose.samples.les2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun House() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Magenta, Color.Blue),
                    end = Offset(
                        x = convertDpToPx(dp = 600.dp),
                        y = convertDpToPx(dp = 350.dp)
                    )
                )
            )
    ) {
        drawPath(
            path = Path().apply {
                moveTo(x = center.x, y = 200.dp.toPx())
                lineTo(x = center.x + 100.dp.toPx(), y = 300.dp.toPx())
                moveTo(x = center.x, y = 200.dp.toPx())
                lineTo(x = center.x - 100.dp.toPx(), y = 300.dp.toPx())
                lineTo(x = center.x + 100.dp.toPx(), y = 300.dp.toPx())
                lineTo(x = center.x + 100.dp.toPx(), y = 450.dp.toPx())
                lineTo(x = center.x - 100.dp.toPx(), y = 450.dp.toPx())
                lineTo(x = center.x - 100.dp.toPx(), y = 300.dp.toPx())

                // окно
                moveTo(x = center.x - 50.dp.toPx(), y = 350.dp.toPx())
                lineTo(x = center.x + 50.dp.toPx(), y = 350.dp.toPx())
                lineTo(x = center.x + 50.dp.toPx(), y = 400.dp.toPx())
                lineTo(x = center.x - 50.dp.toPx(), y = 400.dp.toPx())
                lineTo(x = center.x - 50.dp.toPx(), y = 350.dp.toPx())

                // перегородки
                moveTo(x = center.x, y = 350.dp.toPx())
                lineTo(x = center.x, y = 400.dp.toPx())
                moveTo(x = center.x + 50.dp.toPx(), y = 375.dp.toPx())
                lineTo(x = center.x - 50.dp.toPx(), y = 375.dp.toPx())
            },
            color = Color.White,
            style = Stroke(width = 2.dp.toPx())
        )
    }
}

@Composable
fun convertDpToPx(dp: Dp): Float {
    return LocalDensity.current.density * dp.value
}