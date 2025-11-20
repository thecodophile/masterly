package com.somnath.masterly.presentation.components

import android.nfc.tech.MifareUltralight
import android.widget.ProgressBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnath.masterly.R
import com.somnath.masterly.presentation.theme.DarkBackground
import com.somnath.masterly.presentation.theme.LightPrimaryForeground

@Composable
fun SkillCard(
    modifier: Modifier = Modifier,
    skillName: String,
    hoursLogged: Int,
    totalHours: Int,
    onClick: () -> Unit = {}
) {

    val percent = (hoursLogged.toFloat() / totalHours * 100).coerceAtMost(100f).toInt()

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(140.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(10.dp),
        color = DarkBackground,
        shadowElevation = 8.dp
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Column {
                Row(
                    modifier = modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = skillName,
                        style = MaterialTheme.typography.titleLarge,
                        color = LightPrimaryForeground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = modifier.weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "Arrow right",
                        modifier = modifier.size(20.dp),
                    )
                }
                Spacer(modifier = modifier.height(8.dp))
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.timer),
                        contentDescription = "Clock",
                        modifier = modifier.size(20.dp)
                    )
                    Spacer(modifier = modifier.width(6.dp))
                    Text(
                        text = "$hoursLogged / $totalHours hours",
                        style = MaterialTheme.typography.bodySmall,
                        color = LightPrimaryForeground
                    )
                }
            }

            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Progress",
                        style = MaterialTheme.typography.bodySmall,
                        color = LightPrimaryForeground
                    )
                    Spacer(modifier = modifier.width(6.dp))
                    Text(
                        text = "$percent%",
                        style = MaterialTheme.typography.bodyMedium,
                        color = LightPrimaryForeground
                    )
                }
                Spacer(modifier = modifier.height(4.dp))
                LinearProgressIndicator(
                    progress = { 0.3f },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    color = Color(0xFF9B5CF6),
                    trackColor = ProgressIndicatorDefaults.linearTrackColor,
                    strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
                )
            }

        }
    }
}

@Preview()
@Composable
fun SkillCardPreview(modifier: Modifier = Modifier) {
    SkillCard(
        skillName = "Android development",
        hoursLogged = 1200,
        totalHours = 10000,
    )
}