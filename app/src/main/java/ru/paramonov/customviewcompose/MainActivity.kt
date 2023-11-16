package ru.paramonov.customviewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.paramonov.customviewcompose.samples.les1.CanvasTest
import ru.paramonov.customviewcompose.samples.les3.CanvasLes3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasLes3()
        }
    }
}