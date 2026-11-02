package archive.portmarty.connect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import archive.portmarty.connect.ui.composable.approot.AppRoot
import archive.portmarty.connect.ui.theme.AVMCTAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AVMCTAppTheme {
                AppRoot()
            }
        }
    }
}
