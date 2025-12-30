package com.dscoding.echojournal.echos.presentation.echos.models

import com.dscoding.echojournal.R
import com.dscoding.echojournal.core.presentation.util.UiText

data class MoodChipContent(
    val iconsRes: List<Int> = emptyList(),
    val title: UiText = UiText.StringResource(R.string.all_moods)
)