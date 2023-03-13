package com.zopping.layout_library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.zopping.layout_builder.ui.layouts.ImageWithTextVertical
import com.zopping.layout_builder.ui.theme.Purple700
import com.zopping.layout_library.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) ||
            super.onSupportNavigateUp()
    }
//        setContent {
//            Box {}
//        }
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
            imageAlignment = Alignment.Bottom,
        )
//            EditTextCustomDialog(textFieldValue = "ab")
    }
}
