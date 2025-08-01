package com.example.uvg_ppm_lab2_android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uvg_ppm_lab2_android.ui.theme.Uvgppmlab2androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Uvgppmlab2androidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Home(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Proyecto UVG - Lab 2",
            fontSize = 26.sp,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "¡Hello World!",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = {
            Toast.makeText(context, "¡Gracias por presionar el botón!", Toast.LENGTH_SHORT).show()
        }) {
            Text("Haz clic aquí")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Uvgppmlab2androidTheme {
        Home()
    }
}
