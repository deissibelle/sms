package com.example.sms.pages.message

import androidx.compose.runtime.Composable
import com.example.sms.components.layouts.PageLayout
import com.example.sms.components.sections.message.SendSmsForm
import com.example.sms.components.styles.SendSmsMainStyle
import com.example.sms.components.styles.SendSmsPageStyle
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main


@Page("/nouveau-message")
@Composable
fun NouveauMessagePage() {

    PageLayout("Send SMS") {
        Div(attrs = SendSmsPageStyle.toAttrs()) {
            Main(attrs = SendSmsMainStyle.toAttrs()) {
                SendSmsForm()
            }
        }
    }
}
