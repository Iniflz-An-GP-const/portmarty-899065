package archive.portmarty.connect.ui.composable.screen.cart.summary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import archive.portmarty.connect.R
import archive.portmarty.connect.ui.composable.approot.LocalContentBottomPadding
import archive.portmarty.connect.ui.theme.ControlDivider
import archive.portmarty.connect.ui.theme.LocalDimens

@Composable
fun CartSummary(
    itemsCount: Int,
    totalPrice: Double,
    modifier: Modifier = Modifier,
    onCompleteOrderButtonClick: () -> Unit,
) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceContainer),
    ) {
        ControlDivider()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = dimens.screenPadding,
                    top = dimens.screenPadding,
                    end = dimens.screenPadding,
                    bottom = dimens.screenPadding + LocalContentBottomPadding.current,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.price, totalPrice),
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.headlineSmall,
                )

                Text(
                    text = stringResource(R.string.cart_items_count, itemsCount),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    style = MaterialTheme.typography.bodySmall,
                )
            }

            Spacer(modifier = Modifier.width(dimens.contentSpacing))

            Button(
                onClick = onCompleteOrderButtonClick,
                shape = RoundedCornerShape(dimens.controlCornerRadius),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                ),
            ) {
                Text(text = stringResource(R.string.button_confirm_order_label))
            }
        }
    }
}
