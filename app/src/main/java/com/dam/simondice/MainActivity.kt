package com.dam.simondice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dam.simondice.ui.theme.SimonDiceTheme

val TAG: String = "estado"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val miViewModel: MyViewModel = MyViewModel()

        setContent {
            SimonDiceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    juegoSimon(miViewModel)
                }
            }
        }
        Log.d(TAG, "Estoy en on Create")
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "He llegado al onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "He llegado al onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "He llegado al onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "He llegado al onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "He llegado al onDestroy")
    }


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        SimonDiceTheme {
            Greeting("Android")
        }
    }
}