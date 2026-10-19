package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.autoLength
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

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
fun Footer(modifier: Modifier = Modifier) {
    Footer(
        attrs = modifier
            .fillMaxWidth()
            .backgroundColor(SiteColors.DeepBlue)
            .color(Color.white)
            .toAttrs()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(75.cssRem)
                .margin(leftRight = autoLength)
                .padding(top = 1.cssRem, bottom = 1.cssRem, leftRight = 1.5.cssRem),
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .flexWrap(FlexWrap.Wrap)
                    .gap(8.cssRem),
                horizontalArrangement = Arrangement.Start
            ) {
                Column(
                    modifier = Modifier
                        .minWidth(200.px)
                        .flex(1, 1, 0.px)
                        .gap(1.cssRem)
                ) {
                    FooterLogo()

                        P(attrs = Modifier.margin(0.px).color(Color.white).lineHeight(1.4).fontSize(0.95.cssRem).toAttrs()) {
                            Text("Une plateforme puissante")
                        }
                        P(attrs = Modifier.margin(0.px).color(Color.white).lineHeight(1.4).fontSize(0.95.cssRem).toAttrs()) {
                            Text("pour envoyer, automatiser et")
                        }
                        P(attrs = Modifier.margin(0.px).color(Color.white).lineHeight(1.4).fontSize(0.95.cssRem).toAttrs()) {
                            Text("suivre vos SMS en toute")
                        }
                        P(attrs = Modifier.margin(0.px).color(Color.white).lineHeight(1.4).fontSize(0.95.cssRem).toAttrs()) {
                            Text("simplicité.")
                        }

                }

                footerSections.forEach { section ->
                    Column(
                        modifier = Modifier
                            .minWidth(150.px)
                            .gap(1.cssRem)
                    ) {
                        H3(attrs = Modifier.margin(0.px).color(Color.white).fontSize(1.1.cssRem).fontWeight(600).toAttrs()) {
                            Text(section.title)
                        }

                        Column(modifier = Modifier.gap(0.75.cssRem)) {
                            section.links.forEach { link ->
                                Link(
                                    path = link.href,
                                    text = link.label,
                                    modifier = Modifier
                                        .color(Color.white)
                                        .fontSize(0.95.cssRem),
                                    variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)
                                )
                            }
                        }
                    }
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.px)
                    .backgroundColor(SiteColors.Turquoise)
                    .opacity(0.1)
                    .margin(topBottom = 1.cssRem)
            )

            P(
                attrs = Modifier
                    .margin(0.px)
                    .fillMaxWidth()
                    .textAlign(TextAlign.Center)
                    .color(Color.white)
                    .fontSize(0.9.cssRem)
                    .toAttrs()
            ) {
                Text("© 2026 Orion. Tous droits réservés")
            }
        }
    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
private fun FooterLogo() {
    Link("/", variant = UndecoratedLinkVariant.then(UncoloredLinkVariant)) {
        Image(
            src = "/logo_white.png",
            alt = "SMS, retour à l'accueil",
            modifier = Modifier
                .height(3.cssRem)
        )
    }
}