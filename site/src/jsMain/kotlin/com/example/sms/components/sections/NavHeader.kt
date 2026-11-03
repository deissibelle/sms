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
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaAddressBook
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.FaBell
import com.varabyte.kobweb.silk.components.icons.fa.FaCalendarCheck
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronDown
import com.varabyte.kobweb.silk.components.icons.fa.FaCircleExclamation
import com.varabyte.kobweb.silk.components.icons.fa.FaEye
import com.varabyte.kobweb.silk.components.icons.fa.FaEyeSlash
import com.varabyte.kobweb.silk.components.icons.fa.FaFile
import com.varabyte.kobweb.silk.components.icons.fa.FaFileImport
import com.varabyte.kobweb.silk.components.icons.fa.FaPaperPlane
import com.varabyte.kobweb.silk.components.icons.fa.FaPerson
import com.varabyte.kobweb.silk.components.icons.fa.FaUser
import com.varabyte.kobweb.silk.components.icons.fa.FaUserGroup
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Button as HtmlButton

private data class SubLink(
    val label: String,
    val href: String,
    val icon: @Composable (Modifier) -> Unit
)

private data class NavLink(
    val label: String,
    val href: String,
    val subLinks: List<SubLink> = emptyList()
)

private val navLinks = listOf(
    NavLink(
        label = "Messagerie",
        href = "/messagerie",
        subLinks = listOf(
            SubLink("Envoyés", "/messagerie/envoyes") { FaPaperPlane(it) },
            SubLink("Programmés", "/messagerie/programmes") { FaCalendarCheck(it) },
            SubLink("Brouillon", "/messagerie/brouillons") { FaFile(it) },
            SubLink("Echoués", "/messagerie/echoues") { FaCircleExclamation(it) },
            SubLink("Notifications", "/messagerie/notifications") { FaBell(it) }
        )
    ),
    NavLink(
        label = "Contacts",
        href = "/contacts",
        subLinks = listOf(
            SubLink("Nouveau", "/contacts/liste") { FaUser(it) },
            SubLink("Voir Mes Contact", "/contacts/groupes") { FaEye(it) },
            SubLink("Importer", "/contacts/importer") { FaFileImport(it) }
        )
    ),
    NavLink("Prix", "/prix")
)
@Composable
fun NavHeader() {
    var menuOpen by remember { mutableStateOf(false) }
    var hovered by remember { mutableStateOf(false) }

    Header(
        attrs = NavHeaderStyle.toAttrs {
            onMouseEnter { hovered = true }
            onMouseLeave { hovered = false }
        }
    ) {
        Nav(
            attrs = Modifier
                .attrsModifier { attr("aria-label", "Navigation principale") }
                .toAttrs()
        ) {
            Row(
                modifier = NavBarStyle.toModifier().styleModifier {
                    property("transform", if (hovered) "scale(1.13)" else "scale(1)")
                    property("transition", "transform 400ms cubic-bezier(0.22, 1, 0.36, 1)")
                    property("will-change", "transform")
                },
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
    if (link.subLinks.isEmpty()) {
        Link(
            path = link.href,
            text = link.label,
            modifier = NavLinkStyle.toModifier(),
            variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
        )
    } else {
        NavDropdown(link)
    }
}

@Composable
private fun NavDropdown(link: NavLink) {
    var open by remember { mutableStateOf(false) }

    Div(
        attrs = NavDropdownStyle.toAttrs {
            onMouseEnter { open = true }
            onMouseLeave { open = false }
            onKeyDown { if (it.key == "Escape") open = false }
        }
    ) {
        Link(
            path = link.href,
            text = link.label,
            modifier = NavLinkStyle.toModifier(),
            variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
        )

        HtmlButton(
            attrs = NavDropdownToggleStyle.toAttrs {
                attr("type", "button")
                attr("aria-label", "Sous-menu ${link.label}")
                attr("aria-haspopup", "true")
                attr("aria-expanded", open.toString())
                onClick { open = !open }
            }
        ) {
            val chevron = Modifier.color(SiteColors.Turquoise)
            FaChevronDown(if (open) chevron.rotate(180.deg) else chevron, size = IconSize.XS)
        }

        if (open) DropdownPanel(link)
    }
}

@Composable
private fun DropdownPanel(link: NavLink) {
    Div(attrs = NavDropdownPanelStyle.toAttrs()) {
        link.subLinks.forEachIndexed { index, item ->
            if (index > 0) Div(attrs = NavDropdownDividerStyle.toAttrs())

            Link(
                path = item.href,
                modifier = NavDropdownItemStyle.toModifier(),
                variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
            ) {
                item.icon(NavDropdownIconStyle.toModifier())
                Text(item.label)
            }
        }
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