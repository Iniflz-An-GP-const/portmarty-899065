package archive.portmarty.connect.data.model

data class ProductText(
    val title: String,
    val description: String,
)

/**
 * [texts] maps a two-letter language code ("en", "de", ...) to the product text.
 * The "en" entry is mandatory: it is the fallback and the source of the product
 * name used to look up the photo.
 */
data class Product(
    val id: Int,
    val texts: Map<String, ProductText>,
    val category: ProductCategory,
    val price: Double,
    val imageUrl: String,
) {
    val title: String get() = texts.forCurrentLocale().title
    val description: String get() = texts.forCurrentLocale().description
}
