package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val SendSmsPageStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexDirection(FlexDirection.Column)
        .fillMaxWidth()
//        .minHeight(100.vh)
}

val SendSmsMainStyle = CssStyle {
    base {
        Modifier
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .flexGrow(1)
            .margin(leftRight = autoLength)
            .padding(topBottom = 1.5.cssRem, leftRight = 1.25.cssRem)
    }
    Breakpoint.MD {
        Modifier.padding(topBottom = 2.5.cssRem, leftRight = 4.cssRem)
    }
}

val SendSmsFormStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .gap(1.cssRem)
            .fillMaxWidth()
//            .maxWidth(52.cssRem)
            .margin(leftRight = autoLength)
    }
    Breakpoint.MD { Modifier.gap(1.5.cssRem) }
}

val SendSmsTitleStyle = CssStyle {
    base {
        Modifier
            .margin(0.px)
            .fontSize(1.25.cssRem)
            .fontWeight(600)
            .color(SiteColors.DeepBlue)
    }
    Breakpoint.MD { Modifier.fontSize(1.5.cssRem) }
}
