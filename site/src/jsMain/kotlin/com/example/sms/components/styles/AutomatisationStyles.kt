
package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val AutomatisationSectionStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .backgroundColor(SiteColors.Surface)
        .boxSizing(BoxSizing.BorderBox)
}

val AutomatisationContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .maxWidth(75.cssRem)
            .margin(leftRight = autoLength)
            .padding(
                leftRight = 1.5.cssRem,
                topBottom = 2.5.cssRem
            )
            .gap(2.cssRem)
    }

    Breakpoint.MD {
        Modifier
            .padding(
                leftRight = 2.5.cssRem,
                topBottom = 3.cssRem
            )
            .gap(3.cssRem)
    }
}

val AutomatisationContentStyle = CssStyle {
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

    Breakpoint.MD {
        Modifier.alignItems(AlignItems.Start)
    }
}

val AutomatisationTitleStyle = CssStyle.base {
    Modifier
        .margin(0.px)
        .fontSize(2.5.cssRem)
        .fontWeight(700)
        .lineHeight(1.2)
        .color(SiteColors.DeepBlue)
        .textAlign(TextAlign.Center)
}

val AutomatisationDescriptionStyle = CssStyle.base {
    Modifier
        .maxWidth(24.cssRem)
        .margin(0.px)
        .fontSize(1.35.cssRem)
        .lineHeight(1.4)
        .color(SiteColors.Navy)
        .textAlign(TextAlign.Center)
}

val AutomatisationIconStyle = CssStyle.base {
    Modifier
        .width(5.cssRem)
        .height(5.cssRem)
        .objectFit(ObjectFit.Contain)
}

val AutomatisationImageColumnStyle = CssStyle {
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

val AutomatisationPhotoStyle = CssStyle.base {
    Modifier
        .width(75.percent)
        .height(85.percent)
        .borderRadius(2.cssRem)
        .boxShadow(
            offsetX = 0.px,
            offsetY = 10.px,
            blurRadius = 20.px,
            color = SiteColors.Navy.copyf(alpha = 0.18f)
        )
        .objectFit(ObjectFit.Cover)
}
