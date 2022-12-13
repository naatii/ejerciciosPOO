class Rectangulo(base:Int, altura:Int){
    var base=base
    var altura=altura
    /*constructor(base:Int, altura:Int):this(){
        this.base=base
        this.altura=altura
    }*/
    fun area(): Int {
        var area=0
        area = base*altura
        return area
    }

    fun perimetro(): Int {
        var perimetro=0
        perimetro=base+base+altura+altura
        return perimetro

    }
}
fun ej1(){
    print("Introduce base: ")
    var baseInput = readLine()!!
    print("Introduce altura: ")
    var alturaInput = readLine()!!

    var a = Rectangulo(baseInput.toInt(),alturaInput.toInt())

    println(a.area())
    println(a.perimetro())
}
fun main() {

    println("--------------------")
    println("--- Ejercicio 1. ---")
    println("--- Ejercicio 2. ---")
    println("--- Ejercicio 3. ---")
    println("--- Ejercicio 4. ---")
    println("--- Ejercicio 5. ---")
    println("--------------------")
    print("Elige actividad con un número del 1-5\n> ")
    var actividad = read()!!
    var ejercicio=actividad.toInt()
    when{
        ejercicio==1 -> ej1()
    }

}