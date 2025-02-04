//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val rd2d = Robot("RD2D")

    val listaMov = listOf(
        intArrayOf(10,5,-2),
        intArrayOf(0,0,0),
        intArrayOf(),
        intArrayOf(-10,-5,-2),
        intArrayOf(-10,-5,2,4,8)

    )
    for (mov in listaMov) {
        rd2d.mover(mov)
    }
}