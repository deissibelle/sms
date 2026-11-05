package com.example.sms.pages.home

import androidx.compose.runtime.*
import com.example.sms.components.layouts.PageLayout
import com.example.sms.components.sections.home.AutomationSection
import com.example.sms.components.sections.home.SendSmsSection
import com.example.sms.components.sections.home.HeroSection
import com.example.sms.components.sections.home.TrackingBand
import com.varabyte.kobweb.core.Page

@Page("/")
@Composable
fun HomePage() {
    PageLayout("Home") {
        HeroSection()
        SendSmsSection()
        TrackingBand()
        AutomationSection()
    }
}
