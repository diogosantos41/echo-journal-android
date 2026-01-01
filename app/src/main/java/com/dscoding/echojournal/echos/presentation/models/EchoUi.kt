package com.dscoding.echojournal.echos.presentation.models

import com.dscoding.echojournal.echos.presentation.echos.models.PlaybackState
import com.dscoding.echojournal.echos.presentation.util.toReadableTime
import java.time.Instant as JavaInstant
import kotlin.time.Duration

data class EchoUi(
    val id: Int,
    val title: String,
    val mood: MoodUi,
    val recordedAt: JavaInstant,
    val note: String?,
    val topics: List<String>,
    val amplitudes: List<Float>,
    val playbackTotalDuration: Duration,
    val playbackCurrentDuration: Duration = Duration.ZERO,
    val playbackState: PlaybackState = PlaybackState.STOPPED
) {
    val formattedRecordedAt = recordedAt.toReadableTime()
    val playbackRatio = (playbackCurrentDuration / playbackTotalDuration).toFloat()
}