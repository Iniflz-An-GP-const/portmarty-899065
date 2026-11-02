package archive.portmarty.connect.ui.composable.screen.productdetails.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import archive.portmarty.connect.R
import archive.portmarty.connect.ui.composable.screen.productdetails.quantity.QuantitySelector
import archive.portmarty.connect.ui.theme.LocalDimens

private val ButtonHeight = 52.dp

private val FooterDividerWidth = 1.dp

val SuccessGreen = Color(0xFF2E7D32)
val SuccessContainer = Color(0xFFE8F5E9)

@Composable
fun AddToCartButton(
    quantity: Int,
    isAdded: Boolean,
    onQuantityChange: (Int) -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current
    val containerColor by animateColorAsState(
        targetValue = if (isAdded) SuccessGreen else MaterialTheme.colorScheme.primary,
        label = "add_to_cart_container_color",
    )
    val contentColor by animateColorAsState(
        targetValue = if (isAdded) Color.White else MaterialTheme.colorScheme.onPrimary,
        label = "add_to_cart_content_color",
    )

    Column(modifier = modifier.fillMaxWidth()) {
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = dimens.screenPadding),
            thickness = FooterDividerWidth,
            color = MaterialTheme.colorScheme.outlineVariant,
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimens.screenPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            QuantitySelector(
                quantity = quantity,
                onQuantityChange = onQuantityChange,
            )

            Spacer(modifier = Modifier.width(dimens.contentSpacing))

            Button(
                onClick = onClick,
                modifier = Modifier
                    .weight(1f)
                    .height(ButtonHeight),
                shape = RoundedCornerShape(dimens.controlCornerRadius),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 3.dp,
                    pressedElevation = 1.dp,
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = containerColor,
                    contentColor = contentColor,
                ),
            ) {
                AnimatedContent(
                    targetState = isAdded,
                    transitionSpec = {
                        (scaleIn(animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy)) +
                            fadeIn()) togetherWith fadeOut()
                    },
                    label = "add_to_cart_label",
                ) { added ->
                    if (added) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp),
                            )

                            Spacer(modifier = Modifier.width(8.dp))

                            Text(
                                text = stringResource(R.string.product_details_snackbar_added_to_cart),
                                style = MaterialTheme.typography.titleMedium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    } else {
                        Text(
                            text = stringResource(R.string.button_add_to_cart_label),
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }
    }
}
