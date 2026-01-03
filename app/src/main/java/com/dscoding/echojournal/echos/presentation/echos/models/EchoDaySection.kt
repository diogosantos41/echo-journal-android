package com.dscoding.echojournal.echos.presentation.echos.models

import com.dscoding.echojournal.core.presentation.util.UiText
import com.dscoding.echojournal.echos.presentation.models.EchoUi

data class EchoDaySection(
    val dateHeader: UiText,
    val echos: List<EchoUi>
)
