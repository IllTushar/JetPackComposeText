 package com.example.text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.text.ui.theme.TextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //text()
            val name ="Tushar Gupta"
            SelectedText()
        }
    }


@Composable
fun text()
  {
    Text("Hello Devil!!",
       fontSize = 30.sp,
        color = Color.Cyan,
        )
  }
    @Composable
    fun  TextInLoop(){
        val list = listOf<String>("Tushar","Aman","Rohan")
        Column {
            for (name in list){
                Text("Hello, $name", fontSize = 30.sp
                , fontStyle = FontStyle.Italic,
                color = Color.Blue)
            }
        }
    }
    @Composable
    fun textWithInput(name:String)
    {
      Text(text = name,
          modifier = Modifier.width(500.dp),
           textAlign = TextAlign.Center
          )
    }
    @Composable
    fun SelectedText(){
        Column{
            SelectionContainer {
                Text(text = "This is Selected Text"
                    , fontSize = 30.sp
                )
            }
            DisableSelection {
                Text(text = "This is Diselected text",
                    fontSize = 30.sp)
            }
        }

    }
}