package archive.portmarty.connect.ui.composable.screen.productdetails.quantity

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import archive.portmarty.connect.R
import archive.portmarty.connect.ui.theme.LocalDimens
import archive.portmarty.connect.ui.theme.controlBorderStroke

private val StepperButtonSize = 44.dp
private val StepperIconSize = 20.dp
private val CounterMinWidth = 40.dp

const val MIN_QUANTITY = 1
const val MAX_QUANTITY = 99

@Composable
fun QuantitySelector(
    quantity: Int,
    onQuantityChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(dimens.controlCornerRadius),
        color = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
        border = controlBorderStroke(),
    ) {
        Row(
            modifier = Modifier.height(StepperButtonSize),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(
                onClick = { onQuantityChange(quantity - 1) },
                enabled = quantity > MIN_QUANTITY,
                modifier = Modifier.size(StepperButtonSize),
            ) {
                Icon(
                    imageVector = Icons.Default.Remove,
                    contentDescription = stringResource(R.string.decrease_quantity_icon_description),
                    modifier = Modifier.size(StepperIconSize),
                )
            }

            Box(
                modifier = Modifier.widthIn(min = CounterMinWidth),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = quantity.toString(),
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center,
                )
            }

            IconButton(
                onClick = { onQuantityChange(quantity + 1) },
                enabled = quantity < MAX_QUANTITY,
                modifier = Modifier.size(StepperButtonSize),
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = stringResource(R.string.increase_quantity_icon_description),
                    modifier = Modifier.size(StepperIconSize),
                )
            }
        }
    }
}
