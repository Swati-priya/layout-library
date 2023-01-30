package com.zopping.layout_builder.ui.layouts

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zopping.layout_builder.R
import com.zopping.layout_builder.ui.constants.LayoutConstants.Companion.EMPTY_STRING

@Composable
fun ImageWithTextVertical(
    backGroundColor: Color = Color.Gray,
    image: Painter,
    contentDescription: String = EMPTY_STRING,
    imageAlignment: Alignment.Vertical = Alignment.Top,
    onImageClick: () -> Unit = {},
    cardRadius: RoundedCornerShape = RoundedCornerShape(10.dp),
    cardBorder: BorderStroke? = null,
    cardElevation: Dp = 1.dp,
    title: String = EMPTY_STRING,
    modifier: Modifier = Modifier,
    titleColor: Color = Color.DarkGray,
    titleFontSize: TextUnit = 12.sp,
    titleFontStyle: FontStyle? = null,
    titleFontWeight: FontWeight? = null,
    subTitle: String = EMPTY_STRING,
    subTitleModifier: Modifier = Modifier,
    subTitleColor: Color = Color.DarkGray,
    subTitleFontSize: TextUnit = 12.sp,
    subTitleFontStyle: FontStyle? = null,
    subTitleFontWeight: FontWeight? = null
) {
    Card(
        modifier = Modifier.size(210.dp),
        shape = cardRadius,
        elevation = cardElevation,
        border = cardBorder,
        backgroundColor = backGroundColor
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (imageAlignment == Alignment.Top) {
                Image(
                    painter = image,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onImageClick() },
                )
                Spacer(Modifier.size(5.dp))
                SetTextComponent(
                    title = title,
                    titleColor = titleColor,
                    titleFontSize = titleFontSize,
                    modifier = modifier,
                    titleFontStyle = titleFontStyle,
                    titleFontWeight = titleFontWeight,
                    subTitle = subTitle,
                    subTitleModifier = subTitleModifier,
                    subTitleColor = subTitleColor,
                    subTitleFontSize = subTitleFontSize,
                    subTitleFontStyle = subTitleFontStyle,
                    subTitleFontWeight = subTitleFontWeight
                )
            } else {
                SetTextComponent(
                    title = title,
                    titleColor = titleColor,
                    titleFontSize = titleFontSize,
                    modifier = modifier,
                    titleFontStyle = titleFontStyle,
                    titleFontWeight = titleFontWeight,
                    subTitle = subTitle,
                    subTitleModifier = subTitleModifier,
                    subTitleColor = subTitleColor,
                    subTitleFontSize = subTitleFontSize,
                    subTitleFontStyle = subTitleFontStyle,
                    subTitleFontWeight = subTitleFontWeight
                )
                Spacer(Modifier.size(5.dp))
                Image(
                    painter = image,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onImageClick() },
                )
            }
        }
    }
}

@Composable
private fun SetTextComponent(
    title: String,
    titleColor: Color,
    titleFontSize: TextUnit,
    modifier: Modifier,
    titleFontStyle: FontStyle?,
    titleFontWeight: FontWeight?,
    subTitle: String,
    subTitleModifier: Modifier,
    subTitleColor: Color,
    subTitleFontSize: TextUnit,
    subTitleFontStyle: FontStyle?,
    subTitleFontWeight: FontWeight?
) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = title,
            modifier = modifier,
            style = MaterialTheme.typography.body1,
            color = titleColor,
            fontSize = titleFontSize,
            fontFamily = FontFamily(Font(R.font.open_sans_bold_italic)),
            fontStyle = titleFontStyle,
            fontWeight = titleFontWeight,
        )
        Spacer(Modifier.size(2.dp))
        Text(
            text = subTitle,
            modifier = subTitleModifier,
            style = MaterialTheme.typography.body2,
            color = subTitleColor,
            fontFamily = FontFamily(Font(R.font.open_sans_medium_italic)),
            fontSize = subTitleFontSize,
            fontWeight = subTitleFontWeight,
            fontStyle = subTitleFontStyle
        )
    }
}