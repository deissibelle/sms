package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*


val TrackingBandStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .padding(top = 1.75.cssRem, bottom = 1.5.cssRem, leftRight = 1.25.cssRem)
            .gap(1.9.cssRem)
            .backgroundColor(SiteColors.DeepBlue)
            .backgroundImage(
                linearGradient(
                    from = SiteColors.DeepBlue,
                    to = SiteColors.Turquoise,
                    dir = LinearGradient.Direction.ToBottomLeft
                )
            )
            .styleModifier {
                property("background-repeat", "no-repeat")
                property("background-position", "left bottom")
            }
    }
    Breakpoint.MD {
        Modifier
            .padding(top = 3.25.cssRem, bottom = 3.4.cssRem, leftRight = 1.25.cssRem)
            .gap(4.cssRem)
    }
}

val TrackingTitleStyle = CssStyle {
    base {
        Modifier
            .margin(0.px)
            .fontSize(1.3.cssRem)
            .fontWeight(700)
            .lineHeight(1.2)
            .textAlign(TextAlign.Center)
            .color(Colors.White)
    }
    Breakpoint.MD { Modifier.fontSize(2.1.cssRem) }
}


val TrackingPhotosStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .boxSizing(BoxSizing.BorderBox)
            .width(74.percent)
            .maxWidth(42.cssRem)
            .gap(1.1.cssRem)
    }
    Breakpoint.MD { Modifier.gap(2.1.cssRem) }
}

val TrackingPhotoStyle = CssStyle {
    base {
        Modifier
            .flex(1, 1, 0.px)
            .minWidth(0.px)
            .boxSizing(BoxSizing.BorderBox)
            .styleModifier { property("aspect-ratio", "1 / 1") }
            .objectFit(ObjectFit.Cover)
            .border(2.px, LineStyle.Solid, Colors.White)
            .borderRadius(0.4.cssRem)
            .boxShadow(
                0.px, 0.25.cssRem, 0.6.cssRem,
                color = SiteColors.Navy.copyf(alpha = 0.35f)
            )
    }
    Breakpoint.MD {
        Modifier
            .border(3.px, LineStyle.Solid, Colors.White)
            .borderRadius(0.65.cssRem)
            .boxShadow(
                0.px, 0.4.cssRem, 1.cssRem,
                color = SiteColors.Navy.copyf(alpha = 0.35f)
            )
    }
}


val TrackingCaptionStyle = CssStyle {
    base {
        Modifier
            .margin(0.px)
            .maxWidth(90.percent)
            .fontSize(0.7.cssRem)
            .fontWeight(500)
            .textAlign(TextAlign.Center)
            .color(Colors.White)
    }
    Breakpoint.MD { Modifier.fontSize(1.1.cssRem) }
}