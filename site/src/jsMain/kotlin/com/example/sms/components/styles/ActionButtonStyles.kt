package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.focus
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.*

val ActionButtonBaseStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Inline)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .padding(topBottom = 0.5.cssRem, leftRight = 1.cssRem)
            .borderRadius(0.4.cssRem)
            .fontSize(0.85.cssRem)
            .fontWeight(600)
            .cursor(Cursor.Pointer)
            .styleModifier { property("font-family", "inherit") }
    }
    focus { Modifier.outline(2.px, LineStyle.Solid, SiteColors.Turquoise) }
    Breakpoint.MD {
        Modifier.padding(topBottom = 0.6.cssRem, leftRight = 1.25.cssRem).fontSize(0.9.cssRem)
    }
}

val ActionButtonGradientStyle = CssStyle {
    base {
        Modifier
            .backgroundImage(
                linearGradient(
                    from = SiteColors.DeepBlue,
                    to = SiteColors.Turquoise,
                    dir = LinearGradient.Direction.ToRight
                )            )
            .color(Colors.White)
            .styleModifier { property("border", "1px solid transparent") }
    }
    hover { Modifier.opacity(0.9) }
}

val ActionButtonOutlineStyle = CssStyle {
    base {
        Modifier
            .backgroundColor(Colors.Transparent)
            .color(SiteColors.Navy)
            .border(1.px, LineStyle.Solid, SiteColors.Navy)
    }
    hover { Modifier.backgroundColor(SiteColors.Turquoise.copyf(alpha = 0.12f)) }
}
