package com.example.calculadorapagosliquidos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.calculadorapagosliquidos.ui.theme.CalculadoraPagosLiquidosTheme

class HonorariosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraPagosLiquidosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    PantallaHonorarios()
                }
            }
        }
    }
}

@Composable
fun PantallaHonorarios() {
    // ... tu implementación existente ...
}