package com.somnath.masterly.presentation.screens.home

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnath.masterly.presentation.components.SkillCard
import com.somnath.masterly.presentation.screens.home.components.HomeAppBar

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier
            .fillMaxSize()
            .systemBarsPadding(),
        color = MaterialTheme.colorScheme.surface,
    ) {

        Column(modifier = modifier.fillMaxSize()) {
            HomeAppBar()
            Spacer(modifier = modifier.height(2.dp))
            LazyColumn(
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                items(
                    listOf(
                        Triple("Guitar", 1250, 10000),
                        Triple("JavaScript", 3450, 10000),
                        Triple("Digital Painting", 780, 10000),
                        Triple("Spanish", 520, 10000),
                        Triple("Spanish", 520, 10000),
                        Triple("Spanish", 520, 10000),
                        Triple("Spanish", 520, 10000),
                        Triple("Spanish", 520, 10000),
                        Triple("Spanish", 520, 10000),
                    )
                ) { item ->

                    SkillCard(
                        modifier = modifier,
                        skillName = item.first,
                        hoursLogged = item.second,
                        totalHours = item.third
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(modifier: Modifier = Modifier) {
    HomeScreen()
}