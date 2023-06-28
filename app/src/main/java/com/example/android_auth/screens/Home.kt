package com.example.android_auth.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.android_auth.navigation.Screen
import com.example.android_auth.utils.Client
import kotlinx.coroutines.launch

@Composable
fun Home(navController: NavController, name: String?, email: String?) {
    var client = Client()
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            text = "Welcome $name",
            color = Color(0xFF0165E1),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "$email")
        Spacer(modifier = Modifier.padding(10.dp))
        Button(
            onClick = {
                coroutineScope.launch {
                    client.logOut(context);
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Login.route)
                    }
                }
            }, colors = ButtonDefaults.buttonColors(Color.Black),
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