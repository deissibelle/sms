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

val RecipientsPickerButtonStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .gap(1.cssRem)
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .minHeight(10.cssRem)
            .padding(1.25.cssRem)
            .backgroundColor(Colors.Transparent)
            .color(SiteColors.Navy)
            .cursor(Cursor.Pointer)
            .styleModifier {
                property("border", "none")
                property("font-family", "inherit")
                property("outline-offset", "-2px")
            }
    }
    hover { Modifier.backgroundColor(SiteColors.Turquoise.copyf(alpha = 0.06f)) }
    focus { Modifier.outline(2.px, LineStyle.Solid, SiteColors.Turquoise) }
    Breakpoint.MD { Modifier.minHeight(12.cssRem) }
}

val RecipientsPickerHintStyle = CssStyle.base {
    Modifier.textAlign(TextAlign.Center).fontSize(0.9.cssRem)
}

val RecipientsPickerPlusStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .size(3.cssRem)
            .borderRadius(0.5.cssRem)
            .backgroundColor(SiteColors.Navy.copyf(alpha = 0.35f))
            .color(Colors.White)
    }
    Breakpoint.MD { Modifier.size(3.5.cssRem) }
}
