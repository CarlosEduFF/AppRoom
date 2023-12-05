package com.example.appnovotecroom.controller

import androidx.room.Database
import androidx.room.RoomDatabase

//classe abstrata para chamar o banco de dados
@Database(
    entities = [Contato::class],
    version = 1
)

abstract class ContatoDataBase(): RoomDatabase() {
    abstract val dao: ContatoDAO
}