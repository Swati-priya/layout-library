package com.zopping.layout_builder.ui.layouts

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.zopping.layout_builder.R
import com.zopping.layout_builder.ui.constants.LayoutConstants.Companion.EMPTY_STRING
import com.zopping.layout_builder.ui.custom_element.ButtonLayout

@Composable
fun EditTextCustomDialog(textFieldValue: String = EMPTY_STRING, onDismiss:() -> Unit) {
//    val textFieldState = remember {
//        mutableListOf(textFieldValue)
//    }
//    Dialog(onDismissRequest = { onDismiss() }) {
//        Card(
//            modifier = Modifier.size(210.dp),
//            shape = RoundedCornerShape(4.dp),
//            elevation = 1.dp,
//            border = BorderStroke(0.5.dp, Color.Gray),
//            backgroundColor = Color.White
//        ) {
//            Column {
//                Text(
//                    text = "Alert",
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.Blue)
//                        .padding(8.dp),
//                    style = MaterialTheme.typography.body2,
//                    color = Color.Black,
//                    fontFamily = FontFamily(Font(R.font.open_sans_regular)),
//                    fontSize = 8.sp,
//                    fontWeight = FontWeight.Black,
//                    fontStyle = FontStyle.Normal
//                )
//                Spacer(Modifier.size(0.5.dp))
//                Text(
//                    text = "Enter Data",
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color.Transparent)
//                        .padding(8.dp),
//                    style = MaterialTheme.typography.body2,
//                    color = Color.Gray,
//                    fontFamily = FontFamily(Font(R.font.open_sans_medium)),
//                    fontSize = 12.sp,
//                    fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Normal,
//                    textAlign = TextAlign.Center
//                )
//                Spacer(Modifier.size(2.dp))
//                TextField(
//                    value = "",
//                    onValueChange = {
//                        with(textFieldState) {
//                            clear()
//                            add(it)
//                        }
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(40.dp)
//                        .padding(horizontal = 15.dp)
//                        .border(0.1.dp, Color.Gray, RoundedCornerShape(2.dp)),
//                )
//                Spacer(Modifier.size(2.dp))
//                ButtonLayout()
//            }
//        }
//        Card(
//            //shape = MaterialTheme.shapes.medium,
//            shape = RoundedCornerShape(10.dp),
//            // modifier = modifier.size(280.dp, 240.dp)
//            modifier = Modifier.padding(8.dp),
//            elevation = 8.dp
//        ) {
//            Column(
//                Modifier
//                    .background(Color.White)
//            ) {
//
//                Text(
//                    text = "Search your favorite food",
//                    modifier = Modifier.padding(8.dp),
//                    fontSize = 20.sp
//                )
//
//                OutlinedTextField(
//                    value = searchedFood,
//                    onValueChange = { searchedFood = it }, modifier = Modifier.padding(8.dp),
//                    label = { Text("Favorite Food") }
//                )
//
//                Row {
//                    OutlinedButton(
//                        onClick = { onDismiss() },
//                        Modifier
//                            .fillMaxWidth()
//                            .padding(8.dp)
//                            .weight(1F)
//                    ) {
//                        Text(text = "Cancel")
//                    }
//
//                    Button(
//                        onClick = { onDismiss() },
//                        Modifier
//                            .fillMaxWidth()
//                            .padding(8.dp)
//                            .weight(1F)
//                    ) {
//                        Text(text = "Search")
//                    }
//                }
//
//            }
//        }
//    }
}