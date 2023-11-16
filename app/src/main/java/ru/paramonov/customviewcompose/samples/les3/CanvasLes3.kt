package ru.paramonov.customviewcompose.samples.les3

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CanvasLes3() {
    var points by rememberSaveable { mutableStateOf<List<Point>>(listOf()) }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .pointerInput(key1 = Unit) {
                detectDragGestures(
                    onDragStart = {
                        points = points + Point(offset = it, isStartedPosition = true)
                    },
                    onDrag = { change, _ ->
                        points = points + change.historical.map {
                            Point(offset = it.position, isStartedPosition = false)
                        }
                    }
                )
            }
    ) {
        val path = Path()

        points.forEach { pointOffset ->
            if (pointOffset.isStartedPosition) {
                path.moveTo(x = pointOffset.offset.x, y = pointOffset.offset.y)
            } else {
                path.lineTo(x = pointOffset.offset.x, y = pointOffset.offset.y)
            }
        }

        drawPath(
            path = path,
            brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Yellow)),
            style = Stroke(width = 10.dp.toPx())
        )
    }
}

data class Point(
    val offset: Offset,
    val isStartedPosition: Boolean
)