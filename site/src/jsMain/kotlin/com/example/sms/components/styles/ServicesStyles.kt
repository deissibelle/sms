
package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val EnvoiSmsSectionStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .backgroundColor(SiteColors.Surface)
        .boxSizing(BoxSizing.BorderBox)
}

val EnvoiSmsContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .maxWidth(75.cssRem)
            .margin(leftRight = 0.px)
            .padding(
                leftRight = 1.5.cssRem,
                topBottom = 2.5.cssRem
            )
            .gap(2.cssRem)
    }

    Breakpoint.MD {
        Modifier
            .margin(leftRight = 0.px)
            .padding(
                leftRight = 2.5.cssRem,
                topBottom = 3.cssRem
            )
            .gap(3.cssRem)
    }
}

val EnvoiSmsImageColumnStyle = CssStyle {
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

val EnvoiSmsPhotoStyle = CssStyle.base {
    Modifier
        .width(75.percent)
        .height(85.percent)
        .borderRadius(1.5.cssRem)
        .boxShadow(
            offsetX = 0.px,
            offsetY = 10.px,
            blurRadius = 20.px,
            color = SiteColors.Navy.copyf(alpha = 0.18f)
        )
}

val EnvoiSmsContentStyle = CssStyle {
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

val EnvoiSmsTitleStyle = CssStyle.base {
    Modifier
        .margin(0.px)
        .fontSize(2.cssRem)
        .fontWeight(500)
        .color(SiteColors.DeepBlue)
        .textAlign(TextAlign.Center)
}

val EnvoiSmsIllustrationStyle = CssStyle.base {
    Modifier
        .width(10.cssRem)
        .height(10.cssRem)
}

val EnvoiSmsDescriptionStyle = CssStyle.base {
    Modifier
        .margin(0.px)
        .fontSize(1.35.cssRem)
        .color(SiteColors.Navy)
        .textAlign(TextAlign.Center)
}
