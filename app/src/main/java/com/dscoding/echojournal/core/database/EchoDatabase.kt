package com.dscoding.echojournal.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dscoding.echojournal.core.database.echo.EchoDao
import com.dscoding.echojournal.core.database.echo.EchoEntity
import com.dscoding.echojournal.core.database.echo.FloatListTypeConverter
import com.dscoding.echojournal.core.database.echo.MoodTypeConverter
import com.dscoding.echojournal.core.database.echo_topic_relation.EchoTopicCrossRef
import com.dscoding.echojournal.core.database.topic.TopicEntity

@Database(
    entities = [EchoEntity::class, TopicEntity::class, EchoTopicCrossRef::class],
    version = 1,
)
@TypeConverters(
    MoodTypeConverter::class,
    FloatListTypeConverter::class
)
abstract class EchoDatabase : RoomDatabase() {
    abstract val echoDao: EchoDao
}