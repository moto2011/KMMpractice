package com.motonakami.android.kmmpractice

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform