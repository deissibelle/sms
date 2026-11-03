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
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.*

val NavDropdownFadeIn = Keyframes {
    from { Modifier.opacity(0).translateY(0.4.cssRem) }
    to { Modifier.opacity(1).translateY(0.px) }
}

val NavDropdownStyle = CssStyle.base {
    Modifier
        .position(Position.Relative)
        .display(DisplayStyle.Flex)
        .alignItems(AlignItems.Center)
        .gap(0.25.cssRem)
        .padding(topBottom = 0.75.cssRem)
}

val NavDropdownToggleStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .alignItems(AlignItems.Center)
        .padding(0.25.cssRem)
        .backgroundColor(Colors.Transparent)
        .cursor(Cursor.Pointer)
        .styleModifier { property("border", "none") }
}
val NavDropdownPanelStyle = CssStyle.base {
    Modifier
        .position(Position.Absolute)
        .top(100.percent)
        .left(50.percent)
        .minWidth(12.cssRem)
        .zIndex(20)
        .boxSizing(BoxSizing.BorderBox)
        .padding(topBottom = 0.4.cssRem, leftRight = 0.5.cssRem)
        .backgroundColor(Colors.White)
        .borderRadius(0.75.cssRem)
        .boxShadow(
            0.px, 0.5.cssRem, 1.5.cssRem,
            color = SiteColors.Navy.copyf(alpha = 0.18f)
        )
        .styleModifier {
            property("width", "max-content")
            property("translate", "-50% 0")
        }
        .animation(
            NavDropdownFadeIn.toAnimation(
                duration = 150.ms,
                timingFunction = AnimationTimingFunction.EaseOut
            )
        )
}
val NavDropdownItemStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(0.9.cssRem)
            .padding(topBottom = 0.6.cssRem, leftRight = 0.25.cssRem)
            .borderRadius(0.5.cssRem)
            .color(SiteColors.Navy)
            .fontSize(0.95.cssRem)
            .fontWeight(500)
            .styleModifier { property("white-space", "nowrap") }
    }
    hover {
        Modifier
            .backgroundColor(SiteColors.Surface)
            .color(SiteColors.DeepBlue)
    }
}
val NavDropdownIconStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.InlineBlock)
        .justifyContent(JustifyContent.Center)
        .width(1.25.cssRem)
        .textAlign(TextAlign.Center)
        .color(SiteColors.Navy)
}

val NavDropdownDividerStyle = CssStyle.base {
    Modifier
        .height(1.px)
        .margin(leftRight = 0.25.cssRem)
        .backgroundColor(SiteColors.Navy.copyf(alpha = 0.12f))
}