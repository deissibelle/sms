package com.example.sms.components.sections.message

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.*
import com.varabyte.kobweb.silk.components.icons.fa.FaPaperPlane
import com.varabyte.kobweb.silk.components.icons.fa.FaPlus
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Button as HtmlButton

@Composable
fun RecipientsPicker(onPickRecipients: () -> Unit) {
    FormCard(
        title = "Destinataires",
        titleId = "recipients-title",
        icon = { FaPaperPlane(size = IconSize.LG) }
    ) {
        HtmlButton(
            attrs = RecipientsPickerButtonStyle.toAttrs {
                attr("type", "button")
                onClick { onPickRecipients() }
            }
        ) {
            Span(attrs = RecipientsPickerHintStyle.toAttrs()) {
                Text("Cliquer ici pour sélectionner les contacts")
            }
            Span(attrs = RecipientsPickerPlusStyle.toAttrs()) {
                FaPlus(size = IconSize.XXL)
            }
        }
    }
}
