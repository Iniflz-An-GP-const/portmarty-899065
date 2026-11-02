package archive.portmarty.connect.data.model

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home

/**
 * [texts] maps a two-letter language code ("en", "de", ...) to the benefit text.
 * The "en" entry is mandatory: it is the fallback.
 */
data class Benefit(
    val icon: ImageVector,
    val texts: Map<String, String>,
) {
    val text: String get() = texts.forCurrentLocale()
}

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Default.Build,
        texts = mapOf(
            "en" to "Built to last", "de" to "Langlebig gebaut",
            "es" to "Hecho para durar", "fr" to "Conçu pour durer",
            "hi" to "टिकाऊ बनावट", "id" to "Dibuat tahan lama",
            "pt" to "Feito para durar", "ar" to "مصمم ليدوم",
        ),
    ),
    Benefit(
        icon = Icons.Default.Check,
        texts = mapOf(
            "en" to "One-year warranty", "de" to "Ein Jahr Garantie",
            "es" to "Un año de garantía", "fr" to "Garantie d\'un an",
            "hi" to "एक साल की वारंटी", "id" to "Garansi satu tahun",
            "pt" to "Um ano de garantia", "ar" to "ضمان لمدة عام",
        ),
    ),
    Benefit(
        icon = Icons.Default.Home,
        texts = mapOf(
            "en" to "Made for home", "de" to "Für Zuhause gemacht",
            "es" to "Hecho para el hogar", "fr" to "Pensé pour la maison",
            "hi" to "घर के लिए बना", "id" to "Dibuat untuk rumah",
            "pt" to "Feito para casa", "ar" to "مصمم للمنزل",
        ),
    ),
)
