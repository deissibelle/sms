package com.example.sms.components.sections.message

import androidx.compose.runtime.*
import com.example.sms.components.styles.*
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Div

@Composable
fun SendSmsForm() {
    var message by remember { mutableStateOf("") }

    Div(attrs = SendSmsFormStyle.toAttrs()) {
        H1(attrs = SendSmsTitleStyle.toAttrs()) { Text("Envoyer un sms") }

        SendSmsTopActions(
            onSend = { },
            onSaveDraft = { }
        )

        MessageEditor(
            message = message,
            onMessageChange = { message = it }
        )

        RecipientsPicker(
            onPickRecipients = { }
        )

        SendSmsBottomBar(
            onAddLink = { },
            onAddContact = { },
            onSchedule = { },
            onSend = { }
        )
    }
}
