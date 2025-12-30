package com.dscoding.echojournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dscoding.echojournal.core.presentation.designsystem.theme.EchoJournalTheme
import com.dscoding.echojournal.echos.presentation.echos.EchosRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EchoJournalTheme {
                EchosRoot()
            }
        }
    }
}