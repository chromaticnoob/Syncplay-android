package com.yuroyami.syncplay.utils

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

object CommonUtils {


    /** Generates the current clock timestamp */
    fun generateClockstamp(): String {
        val c = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).time
        val actualHour = if (c.hour < 10) "0${c.hour}" else "${c.hour}"
        return "${actualHour}:${c.minute}:${c.second}"
    }

    /** prints the string to the platform-specific logcat output */
    var nap = false
    fun loggy(string: String) {
        if (!nap) {
            Napier.base(DebugAntilog())
            nap = true
        }
        Napier.e { string }
    }
}