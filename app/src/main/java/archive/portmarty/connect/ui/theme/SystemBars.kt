package archive.portmarty.connect.ui.theme

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private const val LightBackgroundLuminance = 0.179f

fun Color.isLight(): Boolean = luminance() > LightBackgroundLuminance

@Composable
fun StatusBarIconsFor(backgroundColor: Color) {
    val view = LocalView.current
    if (view.isInEditMode) return

    val window = view.context.findActivity()?.window ?: return
    // The status bar strip is always drawn in Primary, so its icons follow Primary.
    val useDarkIcons = Primary.isLight()

    SideEffect {
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = useDarkIcons
    }
}

private fun Context.findActivity(): Activity? {
    var context: Context = this
    while (context is ContextWrapper) {
        if (context is Activity) {
            return context
        }
        context = context.baseContext
    }
    return null
}
