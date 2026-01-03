package com.dscoding.echojournal.echos.di

import com.dscoding.echojournal.echos.data.audio.AndroidAudioPlayer
import com.dscoding.echojournal.echos.data.echo.RoomEchoDataSource
import com.dscoding.echojournal.echos.data.recording.AndroidVoiceRecorder
import com.dscoding.echojournal.echos.data.recording.InternalRecordingStorage
import com.dscoding.echojournal.echos.data.settings.DataStoreSettings
import com.dscoding.echojournal.echos.domain.audio.AudioPlayer
import com.dscoding.echojournal.echos.domain.echo.EchoDataSource
import com.dscoding.echojournal.echos.domain.recording.RecordingStorage
import com.dscoding.echojournal.echos.domain.recording.VoiceRecorder
import com.dscoding.echojournal.echos.domain.settings.SettingsPreferences
import com.dscoding.echojournal.echos.presentation.create_echo.CreateEchoViewModel
import com.dscoding.echojournal.echos.presentation.echos.EchosViewModel
import com.dscoding.echojournal.echos.presentation.settings.SettingsViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val echoModule = module {
    singleOf(::AndroidVoiceRecorder) bind VoiceRecorder::class
    singleOf(::InternalRecordingStorage) bind RecordingStorage::class
    singleOf(::AndroidAudioPlayer) bind AudioPlayer::class
    singleOf(::RoomEchoDataSource) bind EchoDataSource::class
    singleOf(::DataStoreSettings) bind SettingsPreferences::class

    viewModelOf(::EchosViewModel)
    viewModelOf(::CreateEchoViewModel)
    viewModelOf(::SettingsViewModel)
}