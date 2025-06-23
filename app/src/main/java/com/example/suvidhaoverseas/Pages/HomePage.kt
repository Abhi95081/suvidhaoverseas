package com.example.suvidhaoverseas.Pages

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.suvidhaoverseas.R

@Composable
fun HomePage(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFF1F9FF), Color.White)
                )
            )
    ) {
        Column(
            modifier = modifier
                .verticalScroll(scrollState)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Suvidha Logo",
                modifier = Modifier
                    .height(120.dp)
                    .padding(16.dp)
            )

            // Hero Section
            Text("Launch Your", fontSize = 26.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFF1A237E))
            Text("Overseas Education", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFF5722))
            Text("Journey with Free Consultation", fontSize = 20.sp, color = Color.Gray, textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Dream, Explore, Achieve.\nYour Global Education Journey Begins Now.",
                fontSize = 16.sp, color = Color.DarkGray, textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    val intent = Intent(
                        Intent.ACTION_VIEW,
                        "https://docs.google.com/forms/d/e/1FAIpQLSf9Mz4HpahdtjFaEmR20JC1D-pRELSUXGjrr2IsxlpUZtYYMg/viewform".toUri()
                    )
                    context.startActivity(intent)
                },
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1565C0)),
                contentPadding = PaddingValues(horizontal = 30.dp, vertical = 14.dp),
                modifier = Modifier.fillMaxWidth(),
                elevation = ButtonDefaults.buttonElevation(6.dp),
                enabled = true

            ) {
                Text("Get Started with Free Consultation", color = Color.White, fontSize = 11.sp)
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Experts Section
            Text("Meet Our Experts", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0D47A1))
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                listOf(R.drawable.person1, R.drawable.person2).forEach {
                    Image(
                        painter = painterResource(id = it),
                        contentDescription = null,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .shadow(6.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Why Choose Us
            Text("Why Choose Suvidha?", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0D47A1))
            Text(
                "Empowering Futures Through Accessible Global Education.",
                fontSize = 16.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.person3),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .shadow(8.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text("Your Success Starts Here", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0D47A1))
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Welcome to Suvidha Overseas – your gateway to higher education in the US and Germany. Our consultants provide 100% free personalized guidance throughout your journey.",
                fontSize = 15.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Justify
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text("Our Key Features", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFF5722))
            Spacer(modifier = Modifier.height(16.dp))

            listOf(
                "✅ Expert Guidance",
                "✅ Accessibility Advocates",
                "✅ Free Consultation Services"
            ).forEach { feature ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFF9FCFF)),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Text(
                        text = feature,
                        fontSize = 16.sp,
                        color = Color(0xFF1A237E),
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text("Our Services", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color(0xFF2196F3))
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "We offer a wide range of free services to guide you through your study abroad journey smoothly and confidently.",
                fontSize = 16.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(60.dp))
        }

        // WhatsApp Floating Button
        Image(
            painter = painterResource(id = R.drawable.whatsapp),
            contentDescription = "WhatsApp",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp)
                .size(60.dp)
                .clip(CircleShape)
                .shadow(6.dp, CircleShape)
                .clickable {
                    val message = "Hello, I'm interested in your services."
                    val encodedMessage = Uri.encode(message)
                    val intent = Intent(
                        Intent.ACTION_VIEW,
                        "https://wa.me/918010996763?text=$encodedMessage".toUri()
                    )
                    context.startActivity(intent)
                }
        )
    }
}
