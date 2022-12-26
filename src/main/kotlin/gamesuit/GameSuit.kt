package gamesuit

class GameSuit (
    private val gunting: String = "Gunting",
    private val batu: String = "Batu",
    private val kertas: String = "Kertas"
) {
    fun suitGunting(player1:String, player2:String){
        if(player1==this.gunting && player2==this.gunting){
            return println("Draw")
        }
        else if(player1==this.gunting && player2==this.kertas){
            return println("Player 1 Menang")
        }
        else if(player1==this.gunting && player2==this.batu){
            return println("Player 2 Menang")
        }
        else if(player1 == this.kertas && player2 == this.gunting){
            return println("Player 2 Menang")
        }
        else if(player1 == this.kertas && player2 == this.batu){
            return println("Player 1 Menang")
        }
        else if(player1 == this.kertas && player2 == this.kertas){
            return println("Draw")
        }
        else if(player1 == this.batu && player2 == this.gunting){
            return println("Player 1 Menang")
        }
        else if(player1 == this.batu && player2 == this.kertas){
            return println("Player 2 Menang")
        }
        else if(player1 == this.batu && player2 == this.batu){
            return println("Draw")
        }
        else{
            return println("Tolong masukkan Gunting, Kertas atau Batu")
        }
    }
}