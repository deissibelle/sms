package com.example.sms.components.styles

import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.*


val NavHeaderStyle = CssStyle.base {
    Modifier
        .fillMaxWidth()
        .position(Position.Sticky)
        .top(0.px)
        .zIndex(10)
        .backgroundColor(Colors.White)
        .boxShadow(0.px, 2.px, 8.px, color = SiteColors.Navy.copyf(alpha = 0.08f))
}

val NavBarStyle = CssStyle {
    base {
        Modifier
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .maxWidth(75.cssRem)
            .margin(leftRight = autoLength)
            .padding(topBottom = 0.5.cssRem, leftRight = 1.25.cssRem)
    }
    Breakpoint.MD {
        Modifier.padding(topBottom = 0.75.cssRem, leftRight = 4.cssRem)
    }
}

val NavLogoStyle = CssStyle {
    base { Modifier.height(2.25.cssRem) }
    Breakpoint.MD { Modifier.height(3.cssRem) }
}


val NavLinksStyle = CssStyle {
    base { Modifier.display(DisplayStyle.None) }
    Breakpoint.LG {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(2.5.cssRem)
    }
}

val NavActionsStyle = CssStyle {
    base { Modifier.display(DisplayStyle.None) }
    Breakpoint.LG {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .gap(1.cssRem)
    }
}

val NavLinkStyle = CssStyle {
    base { Modifier.color(SiteColors.Navy).fontWeight(500) }
    hover { Modifier.color(SiteColors.Turquoise) }
}


val NavToggleStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .padding(0.5.cssRem)
            .backgroundColor(Colors.Transparent)
            .color(SiteColors.Navy)
            .fontSize(1.5.cssRem)
            .cursor(Cursor.Pointer)
            .styleModifier { property("border", "none") }
    }
    Breakpoint.LG { Modifier.display(DisplayStyle.None) }
}

val NavMobileMenuStyle = CssStyle {
    base {
        Modifier
            .display(DisplayStyle.Flex)
            .flexDirection(FlexDirection.Column)
            .boxSizing(BoxSizing.BorderBox)
            .fillMaxWidth()
            .gap(0.25.cssRem)
            .padding(topBottom = 1.cssRem, leftRight = 1.25.cssRem)
            .backgroundColor(Colors.White)
            .borderTop(1.px, LineStyle.Solid, SiteColors.Navy.copyf(alpha = 0.1f))
    }
    Breakpoint.MD { Modifier.padding(leftRight = 4.cssRem) }
    Breakpoint.LG { Modifier.display(DisplayStyle.None) }
}

val NavMobileLinkStyle = CssStyle {
    base {
        Modifier
            .color(SiteColors.Navy)
            .fontSize(1.1.cssRem)
            .fontWeight(500)
            .padding(topBottom = 0.6.cssRem)
    }
    hover { Modifier.color(SiteColors.Turquoise) }
}

val NavMobileActionsStyle = CssStyle.base {
    Modifier
        .display(DisplayStyle.Flex)
        .flexWrap(FlexWrap.Wrap)
        .gap(0.75.cssRem)
        .margin(top = 0.75.cssRem)
}