/*
 * SPDX-FileCopyrightText: The uwuAOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package platform.test.motion.compose.values

import androidx.compose.ui.Modifier

/** A key used by motion tests to identify an exported value. */
data class MotionTestValueKey<T>(val name: String)

/** Common motion-test values used by framework UI code. */
object MotionTestValues {
    val alpha = MotionTestValueKey<Float>("alpha")
}

/** No-op receiver that preserves the production call-site DSL without test instrumentation. */
class MotionTestValueScope {
    infix fun <T> T.exportAs(key: MotionTestValueKey<T>) = Unit
}

fun Modifier.motionTestValues(block: MotionTestValueScope.() -> Unit): Modifier {
    MotionTestValueScope().block()
    return this
}

fun motionTestValues(block: MotionTestValueScope.() -> Unit): Modifier =
    Modifier.motionTestValues(block)

/** Motion-test instrumentation is intentionally unavailable in this build. */
val isRunningMotionTest: Boolean = false
