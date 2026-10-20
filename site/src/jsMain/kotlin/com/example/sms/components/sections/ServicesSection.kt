
package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.EnvoiSmsContainerStyle
import com.example.sms.components.styles.EnvoiSmsContentStyle
import com.example.sms.components.styles.EnvoiSmsDescriptionStyle
import com.example.sms.components.styles.EnvoiSmsIllustrationStyle
import com.example.sms.components.styles.EnvoiSmsImageColumnStyle
import com.example.sms.components.styles.EnvoiSmsPhotoStyle
import com.example.sms.components.styles.EnvoiSmsSectionStyle
import com.example.sms.components.styles.EnvoiSmsTitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun EnvoiSmsSection() {
    Section(
        attrs = EnvoiSmsSectionStyle.toAttrs()
    ) {
        Row(
            modifier = EnvoiSmsContainerStyle
                .toModifier()
                .flexWrap(FlexWrap.Wrap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = EnvoiSmsImageColumnStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    src = "/envoi.jpeg",
                    alt = "Professionnel utilisant une plateforme de messagerie SMS",
                    modifier = EnvoiSmsPhotoStyle.toModifier()
                )
            }

            Column(
                modifier = EnvoiSmsContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H2(
                    attrs = EnvoiSmsTitleStyle.toAttrs()
                ) {
                    Text("Envoi de SMS")
                }

                Image(
                    src = "/images/sms-bubbles.png",
                    alt = "Bulles illustrant les échanges de SMS",
                    modifier = EnvoiSmsIllustrationStyle.toModifier()
                )

                P(
                    attrs = EnvoiSmsDescriptionStyle.toAttrs()
                ) {
                    Text("en masse ou individuels")
                }
            }
        }
    }
}
