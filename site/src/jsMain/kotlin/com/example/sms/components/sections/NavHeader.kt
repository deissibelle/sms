package com.example.sms.components.sections


import androidx.compose.runtime.Composable
import com.example.sms.components.widgets.Button
import com.example.sms.components.widgets.ButtonStyle
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronDown
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Nav

private data class NavLink(
    val label: String,
    val href: String,
    val hasMenu: Boolean = false
)

private val navLinks = listOf(
    NavLink("Messagerie", "/messagerie", hasMenu = true),
    NavLink("Contacts", "/contacts", hasMenu = true),
    NavLink("Prix", "/prix")
)

@Composable
fun NavHeader(modifier: Modifier = Modifier) {
    Header(
        attrs = modifier
            .fillMaxWidth()
            .position(Position.Sticky)
            .top(0.px)
            .zIndex(10)
            .backgroundColor(Color.white)
            .boxShadow(0.px, 2.px, 8.px, color = SiteColors.Navy.copyf(alpha = 0.08f))            .toAttrs()
    ) {
        Nav(
            attrs = Modifier
                .attrsModifier { attr("aria-label", "Navigation principale") }
                .toAttrs()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .maxWidth(75.cssRem)
                    .margin(leftRight = autoLength)
                    .padding(leftRight = 1.5.cssRem, topBottom = 1.cssRem),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Logo()
                NavLinks(Modifier.displayIfAtLeast(Breakpoint.MD))
                NavActions()
            }
        }
    }
}

@Composable
private fun Logo() {
    Link("/", variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)) {
        Image(
            src = "../logo.png",
            alt = "SMS, retour à l'accueil",
            modifier = Modifier.height(3.cssRem)
        )
    }
}

@Composable
private fun NavLinks(modifier: Modifier = Modifier) {
    Row(modifier.gap(2.5.cssRem), verticalAlignment = Alignment.CenterVertically) {
        navLinks.forEach { NavItem(it) }
    }
}

@Composable
private fun NavItem(link: NavLink) {
    Row(Modifier.gap(0.5.cssRem), verticalAlignment = Alignment.CenterVertically) {
        Link(
            path = link.href,
            text = link.label,
            modifier = Modifier.color(SiteColors.Navy).fontWeight(500),
            variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
        )
        if (link.hasMenu) {
            FaChevronDown(Modifier.color(SiteColors.Turquoise), size = IconSize.XS)
        }
    }
}

@Composable
private fun NavActions() {
    Row(Modifier.gap(1.cssRem), verticalAlignment = Alignment.CenterVertically) {
        Button("Nouveau message", "/nouveau-message", ButtonStyle.Gradient)
        Button("Connexion", "/connexion", ButtonStyle.Outline)
    }
}