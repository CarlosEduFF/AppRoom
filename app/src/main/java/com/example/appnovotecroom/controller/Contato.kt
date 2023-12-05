package com.example.appnovotecroom.controller


import androidx.room.Entity
import androidx.room.PrimaryKey
//definição de entidade
@Entity(tableName = "contatos")
data class Contato(
    @PrimaryKey(autoGenerate = true) //definição de primary key e identity
    val id: Int? = 0,//Campos da entidade
    val nome: String,
    val sobrenome: String,
    val telefone: String,
)

