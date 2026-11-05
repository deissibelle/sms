package com.example.sms.components.sections.message

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaAlignLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaBold
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaItalic
import com.varabyte.kobweb.silk.components.icons.fa.FaLink
import com.varabyte.kobweb.silk.components.icons.fa.FaListUl
import com.varabyte.kobweb.silk.components.icons.fa.FaUnderline
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.TextArea
import org.jetbrains.compose.web.dom.Button as HtmlButton

private const val MAX_MESSAGE_LENGTH = 1500

private data class ToolbarAction(
    val label: String,
    val icon: @Composable (Modifier) -> Unit
)

private val toolbarActions = listOf(
    ToolbarAction("Gras") { FaBold(it, size = IconSize.LG) },
    ToolbarAction("Italique") { FaItalic(it, size = IconSize.LG) },
    ToolbarAction("Souligné") { FaUnderline(it, size = IconSize.LG) },
    ToolbarAction("Liste à puces") { FaListUl(it, size = IconSize.LG) },
    ToolbarAction("Insérer un lien") { FaLink(it, size = IconSize.LG) },
    ToolbarAction("Aligner à gauche") { FaAlignLeft(it, size = IconSize.LG) }
)

@Composable
fun MessageEditor(
    message: String,
    onMessageChange: (String) -> Unit
) {
    FormCard(
        title = "Message",
        titleId = "message-title",
        icon = { FaEnvelope(size = IconSize.LG) }
    ) {
        MessageEditorToolbar()

        TextArea(
            value = message,
            attrs = MessageEditorTextAreaStyle.toAttrs {
                attr("placeholder", "Entrez votre message...")
                attr("maxlength", MAX_MESSAGE_LENGTH.toString())
                attr("aria-labelledby", "message-title")
                onInput { onMessageChange(it.value) }
            }
        )

        Div(attrs = MessageEditorCounterStyle.toAttrs()) {
            Text("${message.length}/$MAX_MESSAGE_LENGTH")
        }
    }
}

@Composable
private fun MessageEditorToolbar() {
    Div(attrs = MessageEditorToolbarStyle.toAttrs { attr("role", "toolbar") }) {
        toolbarActions.forEach { action ->
            HtmlButton(
                attrs = MessageEditorToolButtonStyle.toAttrs {
                    attr("type", "button")
                    attr("aria-label", action.label)
                    attr("title", action.label)
                }
            ) {
                action.icon(Modifier)
            }
        }
    }
}
