package archive.portmarty.connect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import archive.portmarty.connect.ui.composable.approot.AppRoot
import archive.portmarty.connect.ui.theme.AVMCTAppTheme
import archive.portmarty.connect.ui.theme.Primary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Primary.toArgb(), Primary.toArgb())
        )
        setContent {
            AVMCTAppTheme {
                AppRoot()
            }
        }
    }
}
