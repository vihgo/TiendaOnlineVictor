package com.example.tiendaonlinevictor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tiendaonlinevictor.model.Mensaje

import com.example.tiendaonlinevictor.ui.theme.TiendaOnlineVictorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TiendaOnlineVictorTheme{
                Surface(modifier = Modifier.fillMaxSize()) {
                    TarjetaConMensaje(
                        Mensaje("Viktor","Bienvenido a la primera clase de Jetpack Compose")
                    )
                }
            }



        }
    }
}
@Composable
fun TarjetaConMensaje(mensaje: Mensaje){
    Row(modifier = Modifier.padding(all=10.dp)) {
        Image(
            painter = painterResource(R.drawable.zoroicon),
            contentDescription = "Imagen de perfil",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary,CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(mensaje.autor,color=MaterialTheme.colorScheme.secondary )
            Spacer(modifier = Modifier.height(7.dp))
            Text(mensaje.cuerpo, color = MaterialTheme.colorScheme.tertiary)
        }
    }


}
@Preview
@Composable
fun VistaPreviaTarjetaConMensaje(){
    TiendaOnlineVictorTheme{
        Surface(modifier = Modifier.fillMaxSize()) {
            TarjetaConMensaje(
                Mensaje("Viktor","Bienvenido a la primera clase de Jetpack Compose")
            )
        }
    }
}