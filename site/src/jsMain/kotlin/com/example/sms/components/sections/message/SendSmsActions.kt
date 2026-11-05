package com.example.sms.components.sections.message

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.*
import com.example.sms.components.widgets.ActionButton
import com.example.sms.components.widgets.ActionButtonKind
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaLink
import com.varabyte.kobweb.silk.components.icons.fa.FaUserPlus
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Button as HtmlButton


@Composable
fun SendSmsTopActions(
    onSend: () -> Unit,
    onSaveDraft: () -> Unit
) {
    Div(attrs = SendSmsTopActionsStyle.toAttrs()) {
        ActionButton("Envoyer", ActionButtonKind.Gradient, onSend)
        ActionButton("Enregistrer comme brouillon", ActionButtonKind.Outline, onSaveDraft)
    }
}

@Composable
fun SendSmsBottomBar(
    onAddLink: () -> Unit,
    onAddContact: () -> Unit,
    onSchedule: () -> Unit,
    onSend: () -> Unit
) {
    Div(attrs = SendSmsBottomBarStyle.toAttrs()) {
        Div(attrs = SendSmsChipListStyle.toAttrs()) {
            AddItemChip("Ajouter un lien", onAddLink) { FaLink(it, size = IconSize.XS) }
            AddItemChip("Ajouter un contact", onAddContact) { FaUserPlus(it, size = IconSize.XS) }
        }

        Div(attrs = SendSmsBottomButtonsStyle.toAttrs()) {
            ActionButton("Programmer", ActionButtonKind.Outline, onSchedule)
            ActionButton("Envoyer", ActionButtonKind.Gradient, onSend)
        }
    }
}

@Composable
private fun AddItemChip(
    label: String,
    onClick: () -> Unit,
    icon: @Composable (Modifier) -> Unit
) {
    HtmlButton(
        attrs = AddItemChipStyle.toAttrs {
            attr("type", "button")
            onClick { onClick() }
        }
    ) {
        Text(label)
        icon(Modifier)
    }
}
