package com.example.chitchat.Extensions

import android.content.Context
import android.content.Intent
import kotlin.reflect.KClass

fun Context.navigate(to: KClass<*>) {
    startActivity(Intent(this,to.java))
}