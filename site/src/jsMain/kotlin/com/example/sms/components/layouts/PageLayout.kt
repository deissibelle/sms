package com.example.sms.components.layouts


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.example.sms.components.sections.Footer
import com.example.sms.components.sections.NavHeader
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import kotlinx.browser.document
import org.jetbrains.compose.web.css.vh

@Composable
fun PageLayout(
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    LaunchedEffect(title) {
        document.title = "SMS - $title"
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .minHeight(100.vh)
    ) {
        NavHeader()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(SiteColors.background)
                .weight(1f),
            content = content
        )

        Footer()
    }
}