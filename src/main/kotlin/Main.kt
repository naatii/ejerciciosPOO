class Rectangulo(var base: Int, var altura: Int) {
    /*constructor(base:Int, altura:Int):this(){
        this.base=base
        this.altura=altura
        esto no es necesario si definimos el constructos en la propia clase
    }*/
    fun area(): Int {
        return base * altura
    }
    fun perimetro(): Int {
        return base + base + altura + altura
    }
}
/*
* Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para
* calcular el área y el perímetro. Opcionalmente, se puede crear el método toString para mostrar información sobre el
* rectángulo. En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
*/
fun ej1() {
    print("Introduce base: ")
    val baseInput = readln()
    print("Introduce altura: ")
    val alturaInput = readln()
    val a = Rectangulo(baseInput.toInt(), alturaInput.toInt())
    println(a.area())
    println(a.perimetro())
}
/*
* Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
* caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como los métodos estándar:
* ¿getters, setters? y toString. En el programa principal, instancia varios coches, muestra su información, cambia el
* color a algunos de ellos y vuelve a mostrarlos por pantalla.
*/
class Coche(
    var color: String,
    var marca: String,
    var modelo: String,
    var numeroCaballo: Int,
    var numeroPuerta: Int,
    var matricula: String
) {
    override fun toString(): String {
        return "color $color, marca $marca, modelo $modelo, numero de caballos $numeroCaballo, numero de puertas $numeroPuerta, matrícula $matricula"
    }
}
fun ej2() {
    println("Introduce el color")
    val colorInput = readln()
    println("Introduce el marca")
    val marcaInput = readln()
    println("Introduce el modelo")
    val modeloInput = readln()
    println("Introduce el número de caballos")
    val numeroCaballoInput = readln()
    println("Introduce el número de puertas")
    val numeroPuertaInput = readln()
    println("Introduce el matrícula")
    val matriculaInput = readln()
    val a = Coche(
        colorInput,
        marcaInput,
        modeloInput,
        numeroCaballoInput.toInt(),
        numeroPuertaInput.toInt(),
        matriculaInput
    )
    println(a.toString())
}
/*
* Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos,
* solo hora y minuto o solo la hora (si no se indica, el valor de minuto o segundo será 0). Crear el método toString
* para mostrar el tiempo en formato: XXh XXm XXs En el programa principal, debe solicitar por teclado hora, minuto y
* segundo de forma que se puedan omitir los segundos o los minutos (y segundos, claro) e instancie la clase Tiempo
* mostrando su valor.
*/
class Tiempo(var hora: Int = 0, var minuto: Int = 0, var segundo: Int = 0) {
    override fun toString(): String {
        return "Hora: hora $hora, minuto $minuto, segundo $segundo"
    }
}
fun ej3() {
    println("Introduzca la hora")
    val horaInput = readln()
    println("Introduzca los minutos")
    val minutoInput = readln()
    println("Introduza segundos")
    val segundoInput = readln()
    /* No sé como hacer que no te pida introducir algo obligatoriamente
    when{
        horaInput.isEmpty() -> 0
        horaInput.isEmpty() -> 0
        horaInput.isEmpty() -> 0
    }*/
    val a = Tiempo(horaInput.toInt(), minutoInput.toInt(), segundoInput.toInt())
    println(a.toString())
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
    val actividad = readln()
    when (actividad.toInt()) {
        1 -> ej1()
        2 -> ej2()
        3 -> ej3()
    }
}