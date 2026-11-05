package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
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

val MessageEditorToolbarStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .alignItems(AlignItems.Center)
        .gap(0.25.cssRem)
        .padding(0.25.cssRem)
        .borderBottom(1.px, LineStyle.Solid, SiteColors.Navy.copyf(alpha = 0.15f))
}

val MessageEditorToolButtonStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .width(2.cssRem)
            .height(2.cssRem)
            .backgroundColor(Colors.Transparent)
            .color(SiteColors.Navy)
            .borderRadius(0.25.cssRem)
            .cursor(Cursor.Pointer)
            .styleModifier { property("border", "none") }
    }
    hover { Modifier.backgroundColor(SiteColors.Turquoise.copyf(alpha = 0.15f)) }
}

val MessageEditorTextAreaStyle = CssStyle {
    base {
        Modifier
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .height(9.cssRem)
            .padding(0.75.cssRem)
            .backgroundColor(Colors.White)
            .color(SiteColors.Navy)
            .fontSize(0.95.cssRem)
            .styleModifier {
                property("border", "none")
                property("resize", "none")
                property("font-family", "inherit")
                property("outline-offset", "-2px")
            }
    }
    focus { Modifier.outline(2.px, LineStyle.Solid, SiteColors.Turquoise) }
    Breakpoint.MD { Modifier.height(12.cssRem) }
}

val MessageEditorCounterStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .boxSizing(BoxSizing.BorderBox)
        .padding(topBottom = 0.25.cssRem, leftRight = 0.75.cssRem)
        .textAlign(TextAlign.Right)
        .fontSize(0.75.cssRem)
        .color(SiteColors.Navy.copyf(alpha = 0.65f))
}
