class Robot(private val nombre: String) {

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.POSITIVEY


    fun mover(movimientos: IntArray){
        for(pasos in movimientos){
            if (pasos == 0) continue
            when(direccion){
                Direccion.POSITIVEY ->{
                    posY += pasos
                    //direccion = Direccion.NEGATIVEX
                }
                Direccion.NEGATIVEX ->{
                    posX -= pasos
                    //direccion = Direccion.NEGATIVEY
                }
                Direccion.NEGATIVEY ->{
                    posY += pasos
                    //direccion = Direccion.POSITIVEX
                }
                Direccion.POSITIVEX ->{
                    posX += pasos
                    //direccion = Direccion.POSITIVEY
                }
            }
            direccion = Direccion.nuevaDir(direccion.ordinal)
        }
    }

    fun obtenerPosicion(): String {

        return "($posX, $posY)"
    }

    fun obtenerDireccion(): String {
        return direccion.toString()
        /*
        val direccion = arrayOf("PositiveX", "NegativeX", "PositiveY", "NegativeY")
        val direccionTemporal = ""
        for (paso in direccion){
            direccion[+1]
            return direccionTemporal
        }

         */

    }

    override fun toString(): String {
        return "$nombre está en ${obtenerPosicion()} ${obtenerDireccion()}"
    }
}