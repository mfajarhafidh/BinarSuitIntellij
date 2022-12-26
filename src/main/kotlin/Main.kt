import gamesuit.GameSuit

fun main(args: Array<String>){
    var suit = GameSuit()
    println("=================")
    println("GAME SUIT")
    println("=================")
    println("Silahkan ikuti seperti berikut : ")
    println("Gunting, Kertas, dan Batu")
    println("Masukkan pemain 1 : ")
    val player1 = readLine()!!.toString()
    println("Masukkan pemain 2 : ")
    val player2 = readLine()!!.toString()

    suit.suitGunting(player1, player2)
}