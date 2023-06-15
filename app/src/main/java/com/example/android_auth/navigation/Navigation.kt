package com.example.android_auth.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_auth.screens.Home
import com.example.android_auth.screens.Login

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(route = Screen.Login.route) {
            Login(navController)
        }
        composable(route = Screen.Home.route){
            Home()
        }
    }
}