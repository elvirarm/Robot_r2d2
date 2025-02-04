class Robot(nombre: String, posX: Int, posY: Int, direccion: String) {

    val nombre = ""
    var posX = 0
    var posY = 0



    init {
        this.posX = 0
        this.posY = 0
        var dirección = "PositiveY"

        require(nombre.isNotEmpty()){"El nombre no puede estar vacío."}
    }

    fun mover(movimientos: Array<Int>){

    }

    fun obtenerPosicion(): Array<Int>{
        var posicion = arrayOf(posX, posY)

        return posicion
    }

    fun obtenerDireccion(): String{

        val direccion = arrayOf("PositiveX", "NegativeX", "PositiveY", "NegativeY")
        val direccionTemporal = ""
        for (paso in direccion){
            direccion[+1]
            return direccionTemporal
        }

    }

    override fun toString(): String {
        return "R2D2 está en ${obtenerPosicion()} ${obtenerDireccion()}"
    }
}