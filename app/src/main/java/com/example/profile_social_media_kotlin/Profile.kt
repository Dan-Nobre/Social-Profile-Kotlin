package com.example.profile_social_media_kotlin

data class Profile(
    val name: String,
    val username: String,
    val bio: String,
    val website: String,
    val posts: Int,
    val followers: Int,
    val following: Int,
    val isFollowing: Boolean
)