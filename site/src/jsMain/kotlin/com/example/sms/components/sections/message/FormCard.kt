package com.example.sms.components.sections.message

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.*
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text


@Composable
fun FormCard(
    title: String,
    titleId: String,
    icon: @Composable () -> Unit,
    content: @Composable () -> Unit
) {
    Section(attrs = FormCardStyle.toAttrs { attr("aria-labelledby", titleId) }) {
        Div(attrs = FormCardHeaderStyle.toAttrs()) {
            icon()
            H2(attrs = FormCardTitleStyle.toAttrs { id(titleId) }) { Text(title) }
        }
        content()
    }
}
