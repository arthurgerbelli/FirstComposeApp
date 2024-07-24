package com.example.aluvery

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() { //é o minimo para o compose, já extende o AppCompatActivity tbm
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { //similar to setContentView
            //Para se enquadrar nos temas
            AluveryTheme {
                Surface {
                    //apesar de começar com maisculas, não são classes, mas sim funçoes do Compose
                    // que chamamos de Composables. Tem a annotation @Composable
                    MyFirstComposable()
                }
            }

        }
    }
}

//comp + enter cria esse template, são os live templates do AS
@Composable
fun MyFirstComposable(){
    Text(text = "my first text")
    Text(text = "my second text")
}

@Preview()
@Preview(name = "uimode prev",
    //showSystemUi = true, //show as a device
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(name = "custom text preview",
    heightDp = 200,
    widthDp = 300,
    showBackground = true,
    backgroundColor = 0xff00ff
)
@Composable
fun MyFirstComposablePreview(){
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}
