package main

import personagens.Jogadores

fun main(args: Array<String>) {

    println("\n------------- VAMOS JOGAR MUNCHKIN ------------- ")


    print("Número de Jogadores: ")

        val aux = 0
        val numeroJ = readLine()!!.toInt()
        for (aux in 1..numeroJ) {
            println("Digite o nome do seu Munchkin..: ")
            var nomeDoJogador = Jogadores(nomeDoJogador = readLine().toString())


        }

}