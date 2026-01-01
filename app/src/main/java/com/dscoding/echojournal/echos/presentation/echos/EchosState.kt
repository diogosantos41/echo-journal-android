package com.dscoding.echojournal.echos.presentation.echos

import com.dscoding.echojournal.R
import com.dscoding.echojournal.core.presentation.designsystem.dropdowns.Selectable
import com.dscoding.echojournal.core.presentation.designsystem.dropdowns.Selectable.Companion.asUnselectedItems
import com.dscoding.echojournal.core.presentation.util.UiText
import com.dscoding.echojournal.echos.presentation.echos.models.EchoDaySection
import com.dscoding.echojournal.echos.presentation.echos.models.EchoFilterChip
import com.dscoding.echojournal.echos.presentation.echos.models.MoodChipContent
import com.dscoding.echojournal.echos.presentation.models.EchoUi
import com.dscoding.echojournal.echos.presentation.models.MoodUi

data class EchosState(
    val echos: Map<UiText, List<EchoUi>> = emptyMap(),
    val hasEchosRecorded: Boolean = false,
    val hasActiveTopicFilters: Boolean = false,
    val hasActiveMoodFilters: Boolean = false,
    val isLoadingData: Boolean = false,
    val moods: List<Selectable<MoodUi>> = emptyList(),
    val topics: List<Selectable<String>> = listOf("Love", "Happy", "Work").asUnselectedItems(),
    val moodChipContent: MoodChipContent = MoodChipContent(),
    val selectedEchoFilterChip: EchoFilterChip? = null,
    val topicChipTitle: UiText = UiText.StringResource(R.string.all_topics)
) {
    val echoDaySections = echos
        .toList()
        .map { (dateHeader, echos) ->
            EchoDaySection(dateHeader, echos)
        }
}