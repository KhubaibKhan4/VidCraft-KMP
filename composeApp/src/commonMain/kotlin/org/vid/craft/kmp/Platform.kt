package org.vid.craft.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform