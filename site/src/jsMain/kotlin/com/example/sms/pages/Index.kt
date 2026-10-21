package com.example.sms.pages

import androidx.compose.runtime.*
import com.example.sms.components.layouts.PageLayout
import com.example.sms.components.sections.AutomationSection
import com.example.sms.components.sections.SendSmsSection
import com.example.sms.components.sections.HeroSection
import com.example.sms.components.sections.TrackingBand
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    PageLayout("Accueil") {
        HeroSection()
        SendSmsSection()
        TrackingBand()
        AutomationSection()
    }

}
