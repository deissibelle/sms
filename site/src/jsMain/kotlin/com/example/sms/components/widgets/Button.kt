package com.example.sms.components.widgets


import androidx.compose.runtime.Composable
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text

enum class ButtonStyle { Gradient, Outline }

@Composable
fun Button(text: String, href: String, style: ButtonStyle, modifier: Modifier = Modifier) {
    val base = Modifier
        .padding(leftRight = 1.5.cssRem, topBottom = 0.6.cssRem)
        .borderRadius(50.px)
        .fontWeight(600)
        .fontSize(0.9.cssRem)
        .cursor(Cursor.Pointer)

    val styled = when (style) {
        ButtonStyle.Gradient -> base
            .color(Color.white)
            .backgroundImage(
                linearGradient(
                    from = SiteColors.DeepBlue,
                    to = SiteColors.Turquoise,
                    dir = LinearGradient.Direction.ToRight
                )            )
        ButtonStyle.Outline -> base
            .color(SiteColors.Turquoise)
            .backgroundColor(Color.white)
            .border(1.px, LineStyle.Solid, SiteColors.Turquoise)
    }

    Link(
        path = href,
        modifier = modifier.then(styled),
        variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
    ) { Text(text) }
}