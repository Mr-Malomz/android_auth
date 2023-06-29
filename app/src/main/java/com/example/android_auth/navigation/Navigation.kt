package com.example.android_auth.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android_auth.MainActivity
import com.example.android_auth.screens.Home
import com.example.android_auth.screens.Login

@Composable
fun Navigation(activity: MainActivity) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(route = Screen.Login.route) {
            Login(navController, activity)
        }
        composable(route = Screen.Home.route){
            Home()
        }
    }
}