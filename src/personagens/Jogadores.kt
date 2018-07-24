package personagens

import java.security.SecureRandom

open class Jogadores(

        val nomeDoJogador: String,
        var sexo: Boolean = true,
        var raca: String = "Humano",
        var classe: String = "",
        var saldo: Int = 0,
        var nivel: Int = 1,
        var vivo: Boolean = true)




    fun listaDeJogadores(jogadores: MutableList<Jogadores>){}

    fun fugir(dado: Int, sucesso: Boolean) {
        var dado = SecureRandom()
        var resultado = dado.nextInt(6) + 1
        println(resultado)
        if (resultado < 5) {
            var sucesso = false
            println("Não conseguiu fugir, veja a COISA RUIM!!!")
        } else {
            println("Ufa, foi por pouco!!!")
        }

    }





