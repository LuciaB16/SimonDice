package com.dam.simondice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun juegoSimon(miViewModel: MyViewModel) {

    Box{
        // Cuadro de suma de rondas
        if(miViewModel.getContador()<10){
            Text("Ronda: ${miViewModel.getContador()}",
                modifier = Modifier.offset(y=400.dp, x= 250.dp))
        }else{
            Text("Ronda: ${miViewModel.getContador()}",
                modifier = Modifier.offset(y=400.dp, x= 250.dp), fontSize = 24.sp)
        }


        Button( //Botón azul
            onClick = {},
            modifier = Modifier
                .offset(y = 470.dp)
                .offset(x = 100.dp)
                .size(40.dp)
                .background(color = Color.Blue)


        ){

        }

        Button( //Botón verde
            onClick = {},
            modifier = Modifier
                .offset(y = 470.dp)
                .offset(x = 200.dp)
                .size(40.dp)
                .background(color = Color.Green)



        ){

        }
        Button( //Botón rojo
            onClick = {},
            modifier = Modifier
                .offset(y = 530.dp)
                .offset(x = 100.dp)
                .size(40.dp)
                .background(color = Color.Red)


        ){

        }

        Button( //Botón amarillo
            onClick = {},
            modifier = Modifier
                .offset(y = 530.dp)
                .offset(x = 200.dp)
                .size(40.dp)
                .background(color = Color.Yellow)



        ){

        }



        Button( //Botón PLAY
            onClick = {miViewModel.contador()},
            modifier = Modifier
                .size(80.dp, 40.dp)
                .offset(y = 610.dp)
                .offset(x = 200.dp)




        ){
            Image(
                painter = painterResource(id = R.drawable.playbuttonclear),
                contentDescription = "Play",
                modifier = Modifier
                    .size(100.dp)

            )

        }
        startReset()
    }
}

@Composable
fun startReset() {
    var isStart by remember { mutableStateOf(true) }

    Button(
        onClick = {
            isStart = !isStart
        },
        modifier = Modifier
            .size(80.dp, 45.dp)
            .offset(y = 610.dp)
            .offset(x = 70.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        Text(
            text = if (isStart) "START" else "RESET", // Cambia el texto del botón
            style = TextStyle(fontSize = 10.sp)
        )
    }

}
