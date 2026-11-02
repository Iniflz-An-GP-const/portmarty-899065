package archive.portmarty.connect.data.model

import androidx.annotation.StringRes
import archive.portmarty.connect.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    SEATING(R.string.avmct_category_seating),
    TABLES(R.string.avmct_category_tables),
    STORAGE(R.string.avmct_category_storage),
    LIGHTING(R.string.avmct_category_lighting),
    DECOR(R.string.avmct_category_decor),
}
