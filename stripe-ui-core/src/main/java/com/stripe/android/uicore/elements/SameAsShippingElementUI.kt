package com.stripe.android.uicore.elements

import androidx.annotation.RestrictTo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.stripe.android.uicore.utils.collectAsState

const val SAME_AS_SHIPPING_CHECKBOX_TEST_TAG = "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG"

@Composable
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
fun SameAsShippingElementUI(
    controller: SameAsShippingController,
    modifier: Modifier = Modifier,
) {
    val checked by controller.value.collectAsState()
    val label by controller.label.collectAsState()

    CheckboxElementUI(
        modifier = modifier,
        automationTestTag = SAME_AS_SHIPPING_CHECKBOX_TEST_TAG,
        isChecked = checked,
        label = stringResource(label),
        isEnabled = true,
        onValueChange = {
            controller.onValueChange(!checked)
        }
    )
}
