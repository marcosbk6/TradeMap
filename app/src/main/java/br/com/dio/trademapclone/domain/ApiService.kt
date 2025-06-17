package br.com.dio.trademapclone.domain

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("/usuarios/login")
    suspend fun login(
        @Query("usuario") usuario: String,
        @Query("senha") senha: String
    ): Usuario

    @POST("/acoes/favorita")
    suspend fun adicionarFavorito(@Body acaoFavorita: AcaoFavorita): Acao

}