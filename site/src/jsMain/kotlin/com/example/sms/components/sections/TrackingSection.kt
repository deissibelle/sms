package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.components.styles.TrackingBandStyle
import com.example.sms.components.styles.TrackingCaptionStyle
import com.example.sms.components.styles.TrackingPhotoStyle
import com.example.sms.components.styles.TrackingPhotosStyle
import com.example.sms.components.styles.TrackingTitleStyle
import com.varabyte.kobweb.silk.style.toAttrs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text


private val trackingPhotos = listOf(
    "/bulle.jpg" to "Bulle de message lumineuse entourée de petites bulles",
    "/SMS2.jpg" to "Téléphone portable affichant un nuage et des messages",
    "/SMS.jpg" to "Réseau de bulles de messages bleues et orange"
)

@Composable
 fun TrackingBand() {
    Section(attrs = TrackingBandStyle.toAttrs()) {
        H2(attrs = TrackingTitleStyle.toAttrs()) { Text("Suivi en temps réel") }

        Div(attrs = TrackingPhotosStyle.toAttrs()) {
            trackingPhotos.forEach { (src, alt) ->
                Img(src = src, alt = alt, attrs = TrackingPhotoStyle.toAttrs())
            }
        }

        P(attrs = TrackingCaptionStyle.toAttrs()) {
            Text("Suivi des messages envoyés, délivrés, en attente ou échoués")
        }
    }
}