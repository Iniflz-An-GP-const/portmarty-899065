package archive.portmarty.connect.ui.composable.screen.productdetails.image

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import archive.portmarty.connect.ui.composable.screen.shared.ProductImage
import archive.portmarty.connect.ui.theme.LocalDimens
import archive.portmarty.connect.ui.theme.imageBorder

private val ImageElevation = 2.dp

@Composable
fun ProductDetailsImage(
    imageUrl: String,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current
    val shape = RoundedCornerShape(dimens.cardCornerRadius)

    ProductImage(
        imageUrl = imageUrl,
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .shadow(elevation = ImageElevation, shape = shape, clip = true)
            .imageBorder(shape),
    )
}
