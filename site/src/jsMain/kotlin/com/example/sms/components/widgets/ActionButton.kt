package com.example.sms.components.widgets

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.ActionButtonBaseStyle
import com.example.sms.components.styles.ActionButtonGradientStyle
import com.example.sms.components.styles.ActionButtonOutlineStyle
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Button as HtmlButton

enum class ActionButtonKind { Gradient, Outline }


@Composable
fun ActionButton(
    text: String,
    kind: ActionButtonKind,
    onClick: () -> Unit
) {
    val kindModifier = when (kind) {
        ActionButtonKind.Gradient -> ActionButtonGradientStyle.toModifier()
        ActionButtonKind.Outline -> ActionButtonOutlineStyle.toModifier()
    }

    HtmlButton(
        attrs = ActionButtonBaseStyle.toModifier().then(kindModifier).toAttrs {
            attr("type", "button")
            onClick { onClick() }
        }
    ) {
        Text(text)
    }
}
