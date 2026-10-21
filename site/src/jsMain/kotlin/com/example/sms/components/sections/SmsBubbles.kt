package com.example.sms.components.sections

import androidx.compose.runtime.Composable
import com.example.sms.theme.SiteColors
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.*
import com.varabyte.kobweb.compose.css.AlignItems
import com.varabyte.kobweb.compose.css.JustifyContent

private val BubbleNavy = SiteColors.DeepBlue
private val BubbleBlue = SiteColors.Azure
private val BubbleCyan = SiteColors.Turquoise
private val BubbleDark = SiteColors.Navy

private val BubbleSize = 5.cssRem
private val Spread = 1.6.cssRem

val BubbleTopLeftKeyframes = Keyframes {
    from { Modifier.translate((-Spread), (-Spread)) }
    to { Modifier.translate(0.px, 0.px) }
}
val BubbleTopRightKeyframes = Keyframes {
    from { Modifier.translate(Spread, (-Spread)) }
    to { Modifier.translate(0.px, 0.px) }
}
val BubbleBottomLeftKeyframes = Keyframes {
    from { Modifier.translate((-Spread), Spread) }
    to { Modifier.translate(0.px, 0.px) }
}
val BubbleBottomRightKeyframes = Keyframes {
    from { Modifier.translate(Spread, Spread) }
    to { Modifier.translate(0.px, 0.px) }
}

private fun Modifier.bubbleBase(color: Color, radius: String) = this
    .position(Position.Absolute)
    .size(BubbleSize)
    .backgroundColor(color)
    .styleModifier { property("border-radius", radius) }
    .display(DisplayStyle.Flex)
    .alignItems(AlignItems.Center)
    .justifyContent(JustifyContent.Center)

val BubbleTopLeftStyle = CssStyle.base {
    Modifier.bubbleBase(BubbleNavy, "50% 50% 0 50%")
        .top(0.px).left(0.px)
        .animation(
            BubbleTopLeftKeyframes.toAnimation(
                duration = 2.5.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                iterationCount = AnimationIterationCount.Infinite,
                direction = AnimationDirection.Alternate
            )
        )
}
val BubbleTopRightStyle = CssStyle.base {
    Modifier.bubbleBase(BubbleBlue, "50% 50% 50% 0")
        .top(0.8.cssRem).right(0.px)
        .animation(
            BubbleTopRightKeyframes.toAnimation(
                duration = 2.5.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                iterationCount = AnimationIterationCount.Infinite,
                direction = AnimationDirection.Alternate
            )
        )
}
val BubbleBottomLeftStyle = CssStyle.base {
    Modifier.bubbleBase(BubbleCyan, "50% 0 50% 50%")
        .bottom(0.px).left(0.4.cssRem)
        .animation(
            BubbleBottomLeftKeyframes.toAnimation(
                duration = 2.5.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                iterationCount = AnimationIterationCount.Infinite,
                direction = AnimationDirection.Alternate
            )
        )
}
val BubbleBottomRightStyle = CssStyle.base {
    Modifier.bubbleBase(BubbleDark, "0 50% 50% 50%")
        .bottom(0.px).right(0.8.cssRem)
        .animation(
            BubbleBottomRightKeyframes.toAnimation(
                duration = 2.5.s,
                timingFunction = AnimationTimingFunction.EaseInOut,
                iterationCount = AnimationIterationCount.Infinite,
                direction = AnimationDirection.Alternate
            )
        )
}

@Composable
private fun Dots() {
    Row(horizontalArrangement = Arrangement.spacedBy(0.25.cssRem), verticalAlignment = Alignment.CenterVertically) {
        repeat(3) {
            Box(Modifier.size(0.28.cssRem).borderRadius(50.percent).backgroundColor(Colors.White))
        }
    }
}

@Composable
fun SmsBubblesIllustration() {
    Box(Modifier.size(11.cssRem).position(Position.Relative)) {
        Box(BubbleTopLeftStyle.toModifier()) { Dots() }
        Box(BubbleTopRightStyle.toModifier()) { Dots() }
        Box(BubbleBottomLeftStyle.toModifier()) { Dots() }
        Box(BubbleBottomRightStyle.toModifier()) { Dots() }
    }
}