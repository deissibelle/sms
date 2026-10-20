package com.example.sms.components.sections

import androidx.compose.runtime.*
import com.example.sms.components.styles.*
import com.example.sms.components.widgets.Button
import com.example.sms.components.widgets.ButtonStyle
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronDown
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Button as HtmlButton

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
fun NavHeader() {
    var menuOpen by remember { mutableStateOf(false) }

    Header(attrs = NavHeaderStyle.toAttrs()) {
        Nav(
            attrs = Modifier
                .attrsModifier { attr("aria-label", "Navigation principale") }
                .toAttrs()
        ) {
            Row(
                modifier = NavBarStyle.toModifier(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Logo()

                Div(attrs = NavLinksStyle.toAttrs()) {
                    navLinks.forEach { NavItem(it) }
                }

                Div(attrs = NavActionsStyle.toAttrs()) {
                    Button("Nouveau message", "/nouveau-message", ButtonStyle.Gradient)
                    Button("Connexion", "/connexion", ButtonStyle.Outline)
                }

                MenuToggle(open = menuOpen) { menuOpen = !menuOpen }
            }

            if (menuOpen) MobileMenu()
        }
    }
}

@Composable
private fun Logo() {
    Link("/", variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)) {
        Image(
            src = "/logo.png",
            alt = "SMS, retour à l'accueil",
            modifier = NavLogoStyle.toModifier()
        )
    }
}

@Composable
private fun NavItem(link: NavLink) {
    Row(Modifier.gap(0.5.cssRem), verticalAlignment = Alignment.CenterVertically) {
        Link(
            path = link.href,
            text = link.label,
            modifier = NavLinkStyle.toModifier(),
            variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
        )
        if (link.hasMenu) {
            FaChevronDown(Modifier.color(SiteColors.Turquoise), size = IconSize.XS)        }
    }
}

@Composable
private fun MenuToggle(open: Boolean, onToggle: () -> Unit) {
    HtmlButton(
        attrs = NavToggleStyle.toAttrs {
            attr("type", "button")
            attr("aria-label", if (open) "Fermer le menu" else "Ouvrir le menu")
            attr("aria-expanded", open.toString())
            onClick { onToggle() }
        }
    ) {
        if (open) FaXmark() else FaBars()
    }
}

@Composable
private fun MobileMenu() {
    Div(attrs = NavMobileMenuStyle.toAttrs()) {
        navLinks.forEach { link ->
            Link(
                path = link.href,
                text = link.label,
                modifier = NavMobileLinkStyle.toModifier(),
                variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
            )
        }
        Div(attrs = NavMobileActionsStyle.toAttrs()) {
            Button("Nouveau message", "/nouveau-message", ButtonStyle.Gradient)
            Button("Connexion", "/connexion", ButtonStyle.Outline)
        }
    }
}