package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val FormCardStyle = CssStyle.base {
    Modifier
        .boxSizing(BoxSizing.BorderBox)
        .fillMaxWidth()
        .backgroundColor(Colors.White)
        .border(1.px, LineStyle.Solid, SiteColors.Navy.copyf(alpha = 0.25f))
        .borderRadius(0.25.cssRem)
        .overflow(Overflow.Hidden)
}

val FormCardHeaderStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(0.5.cssRem)
            .padding(topBottom = 0.5.cssRem, leftRight = 0.75.cssRem)
            .backgroundColor(SiteColors.Navy.copyf(alpha = 0.04f))
            .borderBottom(1.px, LineStyle.Solid, SiteColors.Navy.copyf(alpha = 0.15f))
            .color(SiteColors.Navy)
    }
    Breakpoint.MD {
        Modifier.padding(topBottom = 0.65.cssRem, leftRight = 1.cssRem)
    }
}

val FormCardTitleStyle = CssStyle.base {
    Modifier.margin(0.px).fontSize(1.6.cssRem).fontWeight(600)
}
