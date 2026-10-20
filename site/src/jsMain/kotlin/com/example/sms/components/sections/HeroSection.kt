package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.GeneralKind
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.*

@Composable
fun HeroSection() {
    Section(attrs = HeroSectionStyle.toAttrs()) {
        Div(attrs = HeroContentStyle.toAttrs()) {
            Div(attrs = HeroTextColumnStyle.toAttrs()) {
                H1(attrs = HeroTitleStyle.toAttrs()) {
                    Text("Votre communication")
                    Br()
                    Text("sms ")
                    Span(attrs = HeroAccentStyle.toAttrs()) { Text("simplifiée") }
                }
                P(attrs = HeroSubtitleStyle.toAttrs()) {
                    Text("Une plateforme puissante pour envoyer, automatiser et suivre vos SMS en toute simplicité.")
                }
                A(href = "/services/envoi", attrs = HeroCtaStyle.toAttrs()) {
                    Text("Commencer à envoyer")
                }
            }

            Div(attrs = HeroVisualsStyle.toAttrs()) {
                HeroImage("/SMS1.jpg", "Interface de messagerie SMS", HeroImageTopLeftStyle)
                HeroImage("/SMS3.jpg", "Illustration de bulles de messages", HeroImageRightStyle)
                HeroImage("/SMS2.jpg", "Illustration de l'automatisation", HeroImageBottomStyle)
            }
        }
    }
}

@Composable
private fun HeroImage(src: String, alt: String, style: CssStyle<GeneralKind>) {
    Img(src = src, alt = alt, attrs = style.toAttrs())
}