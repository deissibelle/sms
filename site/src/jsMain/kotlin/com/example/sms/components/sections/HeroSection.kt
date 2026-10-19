
package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun HeroSection() {
    Section(
        attrs = Modifier
            .fillMaxWidth()
            .backgroundColor(Color.rgb(0x00, 0x3B, 0x65))
            .color(Colors.White)
            .toAttrs()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(90.cssRem)
                .margin(leftRight = autoLength)
                .padding(
                    top = 3.5.cssRem,
                    bottom = 3.5.cssRem,
                    leftRight = 2.cssRem
                )
                .gap(2.cssRem)
                .flexWrap(FlexWrap.Wrap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .flex(1, 1, 22.cssRem)
                    .minWidth(18.cssRem)
                    .gap(1.5.cssRem)
                    .padding(topBottom = 1.cssRem),
                horizontalAlignment = Alignment.Start
            ) {
                H1(
                    attrs = Modifier
                        .margin(0.px)
                        .fontSize(2.5.cssRem)
                        .fontWeight(700)
                        .lineHeight(1.12)
                        .toAttrs()
                ) {
                    Text("Votre communication")
                    Br()
                    Text("SMS ")

                    Span(
                        attrs = Modifier
                            .color(Color.rgb(0x00, 0xD5, 0xDF))
                            .toAttrs()
                    ) {
                        Text("simplifiée")
                    }
                }

                P(
                    attrs = Modifier
                        .maxWidth(29.cssRem)
                        .margin(0.px)
                        .fontSize(1.1.cssRem)
                        .lineHeight(1.5)
                        .toAttrs()
                ) {
                    Text(
                        "Une plateforme puissante pour envoyer, " +
                                "automatiser et suivre vos SMS en toute simplicité."
                    )
                }

                A(
                    href = "/services/envoi",
                    attrs = Modifier
                        .display(DisplayStyle.InlineBlock)
                        .backgroundColor(SiteColors.Turquoise)
                        .color(Colors.White)
                        .padding(
                            topBottom = 0.95.cssRem,
                            leftRight = 2.cssRem
                        )
                        .borderRadius(50.px)
                        .fontSize(1.1.cssRem)
                        .fontWeight(700)
                        .textDecorationLine(TextDecorationLine.None)
                        .toAttrs()
                ) {
                    Text("Commencer à envoyer")
                }
            }

            Box(
                modifier = Modifier
                    .flex(1, 1, 22.cssRem)
                    .minWidth(18.cssRem)
                    .height(23.cssRem)
                    .position(Position.Relative)
            ) {
                HeroImage(
                    src = "/SMS1.jpg",
                    alt = "Interface de messagerie SMS",
                    modifier = Modifier
                        .position(Position.Absolute)
                        .top(0.px)
                        .left(0.px)
                        .width(58.percent)
                        .height(75.percent)
                )

                HeroImage(
                    src = "/SMS3.jpg",
                    alt = "Illustration de bulles de messages",
                    modifier = Modifier
                        .position(Position.Absolute)
                        .top(20.percent)
                        .right(0.px)
                        .width(64.percent)
                        .height(70.percent)
                )

                HeroImage(
                    src = "/SMS2.jpg",
                    alt = "Illustration de l'automatisation",
                    modifier = Modifier
                        .position(Position.Absolute)
                        .bottom(0.px)
                        .left(20.percent)
                        .width(42.percent)
                        .height(40.percent)
                )
            }
        }
    }
}

@Composable
private fun HeroImage(
    src: String,
    alt: String,
    modifier: Modifier = Modifier
) {
    Img(
        src = src,
        alt = alt,
        attrs = modifier
            .borderRadius(1.2.cssRem)
            .objectFit(ObjectFit.Cover)
            .toAttrs()
    )
}
