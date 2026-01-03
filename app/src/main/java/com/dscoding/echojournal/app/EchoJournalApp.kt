package com.dscoding.echojournal.app

import android.app.Application
import com.dscoding.echojournal.BuildConfig
import com.dscoding.echojournal.app.di.appModule
import com.dscoding.echojournal.core.database.di.databaseModule
import com.dscoding.echojournal.echos.di.echoModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class EchoJournalApp: Application() {

    val applicationScope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidContext(this@EchoJournalApp)
            modules(
                appModule,
                echoModule,
                databaseModule
            )
        }
    }
}