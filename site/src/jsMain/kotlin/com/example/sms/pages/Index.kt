package com.example.sms.pages

import androidx.compose.runtime.*
import com.example.sms.components.layouts.PageLayout
import com.example.sms.components.sections.HeroSection
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    PageLayout("Accueil") {
        HeroSection()
    }

}
