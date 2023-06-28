package com.example.android_auth.utils

import android.content.Context
import com.example.android_auth.MainActivity
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Account
import java.lang.Exception


private class ClientInit(context: Context) {
    var clientInstance = Client(context)
        .setEndpoint("https://cloud.appwrite.io/v1")
        .setProject("REPLACE WITH PROJECT ID")
}

class Client {
    suspend fun loginWithGoogle(activity: MainActivity, context: Context): ResourceResponse {
        var account = Account(ClientInit(context).clientInstance)
        try {
            account.createOAuth2Session(activity = activity, provider = "google")
            var data = account.get()
            return ResourceResponse(name = data.name, email = data.email, error = false)
        } catch (e: AppwriteException) {
            return ResourceResponse(error = true)
        }
    }

    suspend fun logOut(context: Context) {
        var account = Account(ClientInit(context).clientInstance)
        try {
            account.deleteSessions()
        } catch (e: AppwriteException) {
            throw Exception("error login out")
        }
    }
}
