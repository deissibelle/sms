
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
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val AutomationSectionStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .backgroundColor(SiteColors.Surface)
        .boxSizing(BoxSizing.BorderBox)
}

val AutomationContainerStyle = CssStyle {
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

val AutomationContentStyle = CssStyle {
    base {
        Modifier
            .flex(1, 1, 20.cssRem)
            .minWidth(0.px)
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .gap(1.25.cssRem)
            .padding(topBottom = 1.cssRem)
            .boxSizing(BoxSizing.BorderBox)
    }

    Breakpoint.MD {
        Modifier
            .alignItems(AlignItems.Center)
    }
}




val AutomationTitleStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .margin(0.px)
        .fontSize(2.5.cssRem)
        .fontWeight(700)
        .lineHeight(1.2)
        .color(SiteColors.DeepBlue)
        .textAlign(TextAlign.Center)
//        .styleModifier {
//            property("text-align", "left")
//        }
}


val AutomationDescriptionStyle = CssStyle.base {
    Modifier
        .maxWidth(24.cssRem)
        .margin(0.px)
        .fontSize(1.3.cssRem)
        .lineHeight(1.4)
        .color(SiteColors.Navy)
        .textAlign(TextAlign.Center)
}

val AutomationIconStyle = CssStyle.base {
    Modifier
        .width(5.cssRem)
        .height(5.cssRem)
        .fontSize(100.px)
        .color(SiteColors.DeepBlue)
        .objectFit(ObjectFit.Contain)

}

val AutomationImageColumnStyle = CssStyle {
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

val AutomationPhotoStyle = CssStyle.base {
    Modifier
        .width(75.percent)
        .height(85.percent)
        .styleModifier { property("border-radius", "2rem 2rem 0.2rem 2rem") }
        .boxShadow(
            offsetX = 0.px,
            offsetY = 10.px,
            blurRadius = 20.px,
            color = SiteColors.Navy.copyf(alpha = 0.18f)
        )
        .objectFit(ObjectFit.Cover)
}
