package com.zopping.layout_builder.ui.custom_element

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Composable
fun ButtonLayout() {
    val constraint = ConstraintSet {
        val okButton = createRefFor("btnOk")
        val cancelButton = createRefFor("btnCancel")
        constrain(cancelButton) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            end.linkTo(okButton.start)
            width = Dimension.fillToConstraints
            height = Dimension.value(40.dp)
        }
        constrain(okButton) {
            start.linkTo(cancelButton.end)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(40.dp)
        }
    }
    ConstraintLayout(
        constraintSet = constraint,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Button(onClick = { }, modifier = Modifier.layoutId("btnCancel")) {
            Text(text = "No")
        }
        Spacer(modifier = Modifier.size(10.dp))
        Button(onClick = { }, modifier = Modifier.layoutId("btnOk")) {
            Text(text = "Yes")
        }
    }
}