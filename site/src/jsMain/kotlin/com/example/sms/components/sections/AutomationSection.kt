
package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.AutomationContainerStyle
import com.example.sms.components.styles.AutomationContentStyle
import com.example.sms.components.styles.AutomationDescriptionStyle
import com.example.sms.components.styles.AutomationIconStyle
import com.example.sms.components.styles.AutomationImageColumnStyle
import com.example.sms.components.styles.AutomationPhotoStyle
import com.example.sms.components.styles.AutomationSectionStyle
import com.example.sms.components.styles.AutomationTitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaRoute
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text
@Composable
fun AutomationSection() {
    Section(
        attrs = AutomationSectionStyle.toAttrs()
    ) {
        Row(
            modifier = AutomationContainerStyle
                .toModifier()
                .flexWrap(FlexWrap.Wrap),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = AutomationContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H2(
                    attrs = AutomationTitleStyle.toAttrs()
                ) {
                    Text("Automation")
                }

                P(
                    attrs = AutomationDescriptionStyle.toAttrs()
                ) {
                    Text(
                        "Déclenchement automatique " + "de messages selon différents événements"
                    )
                }
                FaRoute(
                    modifier = AutomationIconStyle.toModifier()

                )
            }

            Column(
                modifier = AutomationImageColumnStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    src = "/automation.jpg",
                    alt = "Ordinateur portable utilisé pour automatiser les messages",
                    modifier = AutomationPhotoStyle.toModifier()
                )
            }
        }
    }
}
