
package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val SendSmsSectionStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .backgroundColor(SiteColors.Surface)
        .boxSizing(BoxSizing.BorderBox)
}

val SendSmsContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .maxWidth(68.cssRem)
            .margin(leftRight = autoLength)
            .padding(
                leftRight = 1.5.cssRem,
                topBottom = 2.5.cssRem
            )
            .gap(1.5.cssRem)
            .boxSizing(BoxSizing.BorderBox)
    }

    Breakpoint.MD {
        Modifier
            .padding(
                leftRight = 2.cssRem,
                topBottom = 3.cssRem
            )
            .gap(2.cssRem)
    }
}


val SendSmsImageColumnStyle = CssStyle {
    base {
        Modifier
            .flex(1, 1, 20.cssRem)
            .minWidth(16.cssRem)
            .height(18.cssRem)
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
    }

    Breakpoint.MD {
        Modifier.height(20.cssRem)
    }
}

val SendSmsPhotoStyle = CssStyle.base {
    Modifier
        .width(75.percent)
        .height(85.percent)
        .objectFit(ObjectFit.Cover)
        .border(width = 6.px, style = LineStyle.Solid, color = Colors.White)
        .styleModifier { property("border-radius", "2rem 2rem 0.2rem 2rem") }
        .boxShadow(
            offsetX = 0.px,
            offsetY = 10.px,
            blurRadius = 20.px,
            color = SiteColors.Navy.copyf(alpha = 0.18f)
        )
}

val SendSmsContentStyle = CssStyle {
    base {
        Modifier
            .flex(1, 1, 20.cssRem)
            .minWidth(16.cssRem)
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .gap(1.25.cssRem)
            .padding(topBottom = 1.cssRem)
    }
}

val SendSmsTitleStyle = CssStyle.base {
    Modifier
        .margin(0.px)
        .fontSize(2.cssRem)
        .fontWeight(500)
        .color(SiteColors.DeepBlue)
        .textAlign(TextAlign.Center)
}

val SendSmsIllustrationStyle = CssStyle.base {
    Modifier
        .width(10.cssRem)
        .height(10.cssRem)
}

val SendSmsDescriptionStyle = CssStyle.base {
    Modifier
        .margin(0.px)
        .fontSize(1.35.cssRem)
        .color(SiteColors.Navy)
        .textAlign(TextAlign.Center)
}
