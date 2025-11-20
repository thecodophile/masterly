package com.somnath.masterly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.somnath.masterly.presentation.screens.home.HomeScreen
import com.somnath.masterly.presentation.theme.MasterlyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MasterlyTheme {
                /*Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                } */


                HomeScreen(modifier = Modifier)

            }
        }
    }
}