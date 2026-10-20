package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.*

val FooterStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .backgroundColor(SiteColors.DeepBlue)
        .color(Colors.White)
}

val FooterContainerStyle = CssStyle {
    base {
        Modifier
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .maxWidth(75.cssRem)
            .margin(leftRight = autoLength)
            .padding(top = 2.5.cssRem, bottom = 1.5.cssRem, leftRight = 1.25.cssRem)
    }
    Breakpoint.MD {
        Modifier.padding(top = 3.5.cssRem, leftRight = 4.cssRem)
    }
}

val FooterTopStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .gap(1.5.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .flexDirection(FlexDirection.Row)
            .gap(2.cssRem)
    }
}

val FooterBrandStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .gap(1.cssRem)
    }
    Breakpoint.MD { Modifier.flex(2, 1, 0.px) }
}

val FooterLogoStyle = CssStyle {
    base { Modifier.height(2.5.cssRem) }
    Breakpoint.MD { Modifier.height(3.cssRem) }
}

val FooterTextStyle = CssStyle.base {
    Modifier.margin(0.px).maxWidth(16.cssRem).fontSize(0.95.cssRem).lineHeight(1.5)
}

val FooterGroupsStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexWrap(FlexWrap.Wrap)
            .gap(2.cssRem)
    }
    Breakpoint.MD { Modifier.flex(3, 1, 0.px) }
}

val FooterColumnStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexDirection(FlexDirection.Column)
        .gap(1.cssRem)
        .flex(1, 1, 9.cssRem)
}

val FooterTitleStyle = CssStyle.base {
    Modifier.margin(0.px).fontSize(1.1.cssRem).fontWeight(600).color(Colors.White)
}

val FooterLinkListStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexDirection(FlexDirection.Column)
        .gap(0.75.cssRem)
}

val FooterLinkStyle = CssStyle {
    base { Modifier.color(Colors.White).fontSize(0.95.cssRem) }
    hover { Modifier.color(SiteColors.Turquoise) }
}

val FooterDividerStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .height(1.px)
        .backgroundColor(SiteColors.Turquoise)
        .opacity(0.1)
        .margin(topBottom = 1.5.cssRem)
}

val FooterCopyrightStyle = CssStyle.base {
    Modifier
        .margin(bottom = 4.px)
        .fillMaxWidth()
        .textAlign(TextAlign.Center)
        .fontSize(0.9.cssRem)
}