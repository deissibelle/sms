
package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.SendSmsContainerStyle
import com.example.sms.components.styles.SendSmsContentStyle
import com.example.sms.components.styles.SendSmsDescriptionStyle
import com.example.sms.components.styles.SendSmsIllustrationStyle
import com.example.sms.components.styles.SendSmsImageColumnStyle
import com.example.sms.components.styles.SendSmsPhotoStyle
import com.example.sms.components.styles.SendSmsSectionStyle
import com.example.sms.components.styles.SendSmsTitleStyle
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
fun SendSmsSection() {
    Section(
        attrs = SendSmsSectionStyle.toAttrs()
    ) {
        Row(
            modifier = SendSmsContainerStyle
                .toModifier()
                .flexWrap(FlexWrap.Wrap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = SendSmsImageColumnStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    src = "/envoi.jpeg",
                    alt = "Professionnel utilisant une plateforme de messagerie SMS",
                    modifier = SendSmsPhotoStyle.toModifier()
                )
            }
            Column(
                modifier = SendSmsContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H2(
                    attrs = SendSmsTitleStyle.toAttrs()
                ) {
                    Text("Send de SMS")
                }

                SmsBubblesIllustration()

                P(
                    attrs = SendSmsDescriptionStyle.toAttrs()
                ) {
                    Text("en masse ou individuels")
                }
            }
        }
    }
}
