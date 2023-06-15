package com.example.android_auth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Text(
            text = "Welcome Demola",
            color = Color(0xFF0165E1),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "acx@gmail.com")
        Spacer(modifier = Modifier.padding(10.dp))
        Button(
            onClick = {}, colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .height(45.dp)
        ) {
            Text(
                text = "Log out",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}