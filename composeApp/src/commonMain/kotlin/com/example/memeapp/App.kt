package com.example.memeapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.example.memeapp.core.presentation.NavigationRoot
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavigationRoot()
    }
}