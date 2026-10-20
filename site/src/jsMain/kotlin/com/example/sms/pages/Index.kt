package com.example.sms.pages

import androidx.compose.runtime.*
import com.example.sms.components.layouts.PageLayout
import com.example.sms.components.sections.AutomatisationSection
import com.example.sms.components.sections.EnvoiSmsSection
import com.example.sms.components.sections.HeroSection
import com.example.sms.components.sections.TrackingBand
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    PageLayout("Accueil") {
        HeroSection()
        EnvoiSmsSection()
        TrackingBand()
        AutomatisationSection()
    }

}
