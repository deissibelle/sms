package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.extendedByBase
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.*


val HeroSectionStyle = CssStyle.base {
    Modifier
        .position(Position.Relative)
        .overflow(Overflow.Hidden)
        .fillMaxWidth()
        .backgroundColor(SiteColors.DeepBlue)
        .color(Colors.White)
        .styleModifier { property("border-radius", "0 0 1.75rem 1.75rem") }
}


val HeroContentStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .maxWidth(75.cssRem)
            .margin(leftRight = autoLength)
            .padding(topBottom = 2.5.cssRem, leftRight = 1.25.cssRem)
            .gap(2.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .flexDirection(FlexDirection.Row)
            .padding(topBottom = 3.cssRem, leftRight = 4.cssRem)
            .gap(0.px)
    }
}


val HeroTextColumnStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
            .textAlign(TextAlign.Center)
            .fillMaxWidth()
            .gap(1.5.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .flex(1, 1, 0.px)
            .alignItems(AlignItems.Start)
            .textAlign(TextAlign.Start)
            .gap(1.75.cssRem)
    }
}

val HeroTitleStyle = CssStyle {
    base { Modifier.margin(0.px).fontSize(1.75.cssRem).fontWeight(700).lineHeight(1.25) }
    Breakpoint.MD { Modifier.fontSize(1.9.cssRem) }
    Breakpoint.LG { Modifier.fontSize(2.25.cssRem) }
}

val HeroAccentStyle = CssStyle.base { Modifier.color(SiteColors.Turquoise) }

val HeroSubtitleStyle = CssStyle.base {
    Modifier.margin(0.px).maxWidth(20.5.cssRem).fontSize(1.cssRem).lineHeight(1.5)
}

val HeroCtaStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.InlineBlock)
            .boxSizing(BoxSizing.BorderBox)
            .margin(0.px)
            .width(100.percent)
            .maxWidth(20.cssRem)
            .textAlign(TextAlign.Center)
            .backgroundColor(SiteColors.Turquoise)
            .color(Colors.White)
            .padding(topBottom = 0.8.cssRem, leftRight = 2.cssRem)
            .borderRadius(50.px)
            .fontSize(1.05.cssRem)
            .fontWeight(700)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .backgroundColor(SiteColors.Electric)
            .color(SiteColors.Navy)
    }
    Breakpoint.MD {
        Modifier.width(autoLength)
    }
}


val HeroVisualsStyle = CssStyle {
    base {
        Modifier
            .position(Position.Relative)
            .fillMaxWidth()
            .maxWidth(30.cssRem)
            .styleModifier { property("aspect-ratio", "383 / 298") }
    }
    Breakpoint.MD {
        Modifier
            .flex(1, 1, 0.px)
            .maxWidth(100.percent)
    }
}

val HeroImageStyle = CssStyle.base {
    Modifier
        .position(Position.Absolute)
        .borderRadius(1.1.cssRem)
        .objectFit(ObjectFit.Cover)
}

val HeroImageTopLeftStyle = HeroImageStyle.extendedByBase {
    Modifier.top(0.px).left(0.px).width(53.percent).height(68.percent)
}

val HeroImageRightStyle = HeroImageStyle.extendedByBase {
    Modifier.top(20.5.percent).right(0.px).width(58.percent).height(73.5.percent)
}

val HeroImageBottomStyle = HeroImageStyle.extendedByBase {
    Modifier.bottom(0.px).left(18.6.percent).width(34.6.percent).height(44.percent)
}