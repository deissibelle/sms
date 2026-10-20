package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Footer as HtmlFooter

private data class FooterLink(val label: String, val href: String)
private data class FooterSection(val title: String, val links: List<FooterLink>)

private val footerSections = listOf(
    FooterSection(
        title = "Services",
        links = listOf(
            FooterLink("Envoi de SMS", "/services/envoi"),
            FooterLink("Automatisation", "/services/automatisation"),
            FooterLink("Suivi en temps réel", "/services/suivi"),
            FooterLink("Gestion de contacts", "/services/contacts")
        )
    ),
    FooterSection(
        title = "Contact",
        links = listOf(
            FooterLink("Contact", "/contact"),
            FooterLink("Conditions générales", "/cgu"),
            FooterLink("Politique de confidentialité", "/politique-confidentialite")
        )
    ),
    FooterSection(
        title = "À propos",
        links = listOf(
            FooterLink("Avis", "/avis"),
            FooterLink("FAQ", "/faq")
        )
    )
)

@Composable
fun Footer() {
    HtmlFooter(attrs = FooterStyle.toAttrs()) {
        Div(attrs = FooterContainerStyle.toAttrs()) {
            Div(attrs = FooterTopStyle.toAttrs()) {
                Div(attrs = FooterBrandStyle.toAttrs()) {
                    FooterLogo()
                    P(attrs = FooterTextStyle.toAttrs()) {
                        Text("Une plateforme puissante pour envoyer, automatiser et suivre vos SMS en toute simplicité.")
                    }
                }

                Div(attrs = FooterGroupsStyle.toAttrs()) {
                    footerSections.forEach { FooterColumn(it) }
                }
            }

            Div(attrs = FooterDividerStyle.toAttrs())

            P(attrs = FooterCopyrightStyle.toAttrs()) {
                Text("© 2026 Orion. Tous droits réservés")
            }
        }
    }
}

@Composable
private fun FooterColumn(section: FooterSection) {
    Div(attrs = FooterColumnStyle.toAttrs()) {
        H3(attrs = FooterTitleStyle.toAttrs()) { Text(section.title) }
        Div(attrs = FooterLinkListStyle.toAttrs()) {
            section.links.forEach { link ->
                Link(
                    path = link.href,
                    text = link.label,
                    modifier = FooterLinkStyle.toModifier(),
                    variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
                )
            }
        }
    }
}

@Composable
private fun FooterLogo() {
    Link("/", variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)) {
        Image(
            src = "/logo_white.png",
            alt = "SMS, retour à l'accueil",
            modifier = FooterLogoStyle.toModifier()
        )
    }
}