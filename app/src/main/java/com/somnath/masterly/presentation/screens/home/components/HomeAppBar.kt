package com.somnath.masterly.presentation.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnath.masterly.R

@Composable
fun HomeAppBar(modifier: Modifier = Modifier) {

    Surface(
        color = MaterialTheme.colorScheme.surface,
        modifier = modifier
            .fillMaxWidth(),

    ) {
        Row(modifier = modifier.padding(10.dp)) {

            Column(modifier = modifier.weight(1f)) {
                Text(
                    text = "Masterly",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,

                )
                Spacer(modifier = modifier.height(4.dp))
                Text(
                    text = "Track your journey to mastery",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.6f),
                )
            }

            TextButton(
                onClick = { /* TODO */ }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_chart),
                    contentDescription = "Icon analytics",
                    modifier = modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Analytics",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.6f)
                )
            }

            TextButton(
                onClick = { /* TODO */ }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_settings),
                    contentDescription = "Icon analytics",
                    modifier = modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Settings",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.6f)
                )
            }

            TextButton(
                onClick = { /* TODO */ }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_crown),
                    contentDescription = "Icon analytics",
                    modifier = modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Pro",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(0.6f)
                )
            }
        }
    }
}

@Preview
@Composable
fun HomeAppBarPreview(modifier: Modifier = Modifier) {
    HomeAppBar()
}