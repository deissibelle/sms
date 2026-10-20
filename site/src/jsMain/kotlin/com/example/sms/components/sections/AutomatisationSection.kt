
package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.AutomatisationContainerStyle
import com.example.sms.components.styles.AutomatisationContentStyle
import com.example.sms.components.styles.AutomatisationDescriptionStyle
import com.example.sms.components.styles.AutomatisationIconStyle
import com.example.sms.components.styles.AutomatisationImageColumnStyle
import com.example.sms.components.styles.AutomatisationPhotoStyle
import com.example.sms.components.styles.AutomatisationSectionStyle
import com.example.sms.components.styles.AutomatisationTitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AutomatisationSection() {
    Section(
        attrs = AutomatisationSectionStyle.toAttrs()
    ) {
        Row(
            modifier = AutomatisationContainerStyle
                .toModifier()
                .flexWrap(FlexWrap.Wrap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = AutomatisationContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H2(
                    attrs = AutomatisationTitleStyle.toAttrs()
                ) {
                    Text("Automatisation")
                }

                P(
                    attrs = AutomatisationDescriptionStyle.toAttrs()
                ) {
                    Text(
                        "Déclenchement automatique " +
                                "de messages selon différents événements"
                    )
                }

                Image(
                    src = "/automation-icon.png",
                    alt = "Icône d'automatisation des messages",
                    modifier = AutomatisationIconStyle.toModifier()
                )
            }

            Column(
                modifier = AutomatisationImageColumnStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    src = "/automatisation.jpg",
                    alt = "Ordinateur portable utilisé pour automatiser les messages",
                    modifier = AutomatisationPhotoStyle.toModifier()
                )
            }
        }
    }
}
