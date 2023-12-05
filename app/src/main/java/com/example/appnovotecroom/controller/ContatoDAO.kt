package com.example.appnovotecroom.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


//forma alternativa para conectar a classe de instancias com essas import com.example.appnovotecromm.model.Contato  "fun Ex:update"contato: Contato
//classe intermediaria entre back e front

@Dao
interface ContatoDAO {
    //definição de métodos do SQL no Room

    @Insert
    fun insertContato(contato: com.example.appnovotecromm.model.Contato)
    fun selectContato()
    @Update
    fun updateContato(contato: com.example.appnovotecromm.model.Contato)
    @Delete
    fun deleteContato(contato: com.example.appnovotecromm.model.Contato)

    //Métodos especificos para o select com cada campo da base de dados

    @Query("SELECT * FROM contatos ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome(): Flow<List<Contato>>

    @Query("SELECT * FROM contatos ORDER BY sobrenome ASC")
    fun getContatoOrdenadoPeloSobrenome(): Flow<List<Contato>>

    @Query("SELECT * FROM contatos ORDER BY telefone ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>
}