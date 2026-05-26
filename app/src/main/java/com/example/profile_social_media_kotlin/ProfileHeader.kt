package com.example.profile_social_media_kotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileHeader() {
    val avatarSize = 136.dp
    val avatarHalf = 68.dp

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight()
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_screen),
            contentDescription = "Foto de capa",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.BottomCenter)
                .border(6.dp, MaterialTheme.colorScheme.outline),

            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.gemini_generated_image_pgt6m8pgt6m8pgt6),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(avatarSize)
                .align(Alignment.BottomCenter)
                .offset(y = avatarHalf)
                .clip(CircleShape)
                .border(0.dp, MaterialTheme.colorScheme.background),

            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileHeaderkkkkkk() {
    ProfileHeader()
}