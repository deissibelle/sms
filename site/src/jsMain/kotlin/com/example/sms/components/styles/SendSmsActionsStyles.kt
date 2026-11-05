package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.autoLength
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

val SendSmsTopActionsStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
       .justifyContent(JustifyContent.FlexEnd)
        .gap(0.5.cssRem)
}

val SendSmsBottomBarStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .alignItems(AlignItems.Center)
        .justifyContent(JustifyContent.SpaceBetween)
        .gap(0.75.cssRem)
}

val SendSmsChipListStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .gap(0.5.cssRem)
}

val SendSmsBottomButtonsStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .gap(0.5.cssRem)
        .margin(left = autoLength)
}

val AddItemChipStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Inline)
            .alignItems(AlignItems.Center)
            .gap(0.4.cssRem)
            .padding(topBottom = 0.35.cssRem, leftRight = 0.8.cssRem)
            .backgroundColor(Colors.Transparent)
            .color(SiteColors.Navy)
            .border(1.px, LineStyle.Solid, SiteColors.Navy)
            .borderRadius(999.px)
            .fontSize(0.8.cssRem)
            .cursor(Cursor.Pointer)
            .styleModifier { property("font-family", "inherit") }
    }

    Breakpoint.MD { Modifier.fontSize(0.875.cssRem) }
}
