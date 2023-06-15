package com.example.android_auth.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.android_auth.R
import com.example.android_auth.navigation.Screen


@Composable
fun Login(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(id = R.drawable.lock), contentDescription = "lock image")
            Spacer(modifier = Modifier.padding(30.dp))
            Button(
                onClick = {
                          navController.navigate(Screen.Home.route)
                }, colors = ButtonDefaults.buttonColors(Color(0xFF0165E1)),
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Login with Facebook",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    };
}