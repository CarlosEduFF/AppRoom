package com.example.appnovotecromm.model

import com.example.appnovotecroom.controller.Tipos

//Classe para instanciar cada atributo
data class Contato(
    val contato: List<Contato> = emptyList(),
    val nome: String = "",
    val sobrenome: String = "",
    val telefone: String = "",
    val adicionarContato: Boolean = false,
    val tipos: Tipos = Tipos.nome
)
