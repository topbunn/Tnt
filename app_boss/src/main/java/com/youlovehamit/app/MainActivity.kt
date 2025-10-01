package com.youlovehamit.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import ru.topbun.ui.App
import ru.topbun.ui.components.OpenAppAd
import ru.topbun.ui.theme.Colors
import ru.topbun.ui.theme.colorScheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OpenAppAd(this)
            MaterialTheme(colorScheme.copy(primary = Colors.PRIMARY)) {
                App()
            }
        }
    }


}