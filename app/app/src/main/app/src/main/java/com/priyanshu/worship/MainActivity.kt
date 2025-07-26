 package com.priyanshu.worship

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.priyanshu.worship.ui.theme.PriyanshuWorshipTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PriyanshuWorshipTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Text(text = "Welcome to Priyanshu Worship App!")
                }
            }
        }
    }
}
