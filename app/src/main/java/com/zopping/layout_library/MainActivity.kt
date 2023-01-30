package com.zopping.layout_library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zopping.layout_builder.ui.layouts.ImageWithTextVertical
import com.zopping.layout_builder.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box {}
        }
    }

    @Preview
    @Composable
    fun ShowLayout() {
        Box {
            ImageWithTextVertical(
                cardRadius = RoundedCornerShape(0.dp),
                cardBorder = BorderStroke(1.dp, color = Color.Gray),
                cardElevation = 3.dp,
                title = "Hello world",
                titleFontStyle = FontStyle(3),
                titleColor = Color.Black,
                titleFontSize = 14.sp,
                subTitle = "This is my world!!",
                subTitleFontStyle = FontStyle(5),
                subTitleColor = Purple700,
                subTitleFontSize = 10.sp,
                image = painterResource(com.zopping.layout_builder.R.drawable.marguerite),
                contentDescription = "aaa",
                imageAlignment = Alignment.Bottom
            )
//            EditTextCustomDialog(textFieldValue = "ab")
        }
    }
}