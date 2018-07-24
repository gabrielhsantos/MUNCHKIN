package cartas

class Cartas<I>(val id: I) {
    private val ids = ArrayList<I>()
    init {
        adicionar(id)
    }
    fun adicionar(novoId: I) {
        ids.add(novoId)
    }

    override fun toString(): String = ids.toString()
}


fun main(args: Array<String>) {
    val monstros = Cartas(1)
    monstros.adicionar(2)
    monstros.adicionar(3)
    println(monstros)
}