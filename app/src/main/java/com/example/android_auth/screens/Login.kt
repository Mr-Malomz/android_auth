package com.example.android_auth.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.android_auth.MainActivity
import com.example.android_auth.R
import com.example.android_auth.navigation.Screen
import com.example.android_auth.utils.Client
import kotlinx.coroutines.launch

@Composable
fun Login(navController: NavController, activity: MainActivity) {
    var client = Client()
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(id = R.drawable.lock), contentDescription = "lock image")
            Spacer(modifier = Modifier.padding(30.dp))
            Button(
                onClick = {
                    coroutineScope.launch {
                        var data = client.loginWithGoogle(activity, context)
                        if (data.error == true) {
                            Toast.makeText(activity, "Error login in with google", Toast.LENGTH_SHORT).show()
                        } else {
                            navController.navigate("${Screen.Home.route}/${data.name}/${data.email}")
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF0165E1)),
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Login with Google",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    };
}