class Rectangulo(base: Int, altura: Int) {
    var base = base
    var altura = altura

    /*constructor(base:Int, altura:Int):this(){
        this.base=base
        this.altura=altura

        esto no es necesario si definimos el constructos en la propia clase
    }*/
    fun area(): Int {
        var area = 0
        area = base * altura
        return area
    }

    fun perimetro(): Int {
        var perimetro = 0
        perimetro = base + base + altura + altura
        return perimetro
    }
}

/*
* Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el área y el perímetro.
* Opcionalmente se puede crear el método toString para mostrar información sobre el rectángulo.
* En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
*/
fun ej1() {
    print("Introduce base: ")
    var baseInput = readln()
    print("Introduce altura: ")
    var alturaInput = readln()

    var a = Rectangulo(baseInput.toInt(), alturaInput.toInt())

    println(a.area())
    println(a.perimetro())
}

/*
* Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula.
* Crear el constructor del coche, así como los métodos estándar: ¿getters, setters? y toString.
* En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla.
*/

class Coche(color: String, marca: String, modelo: String, numeroCaballo: Int, numeroPuerta: Int, matricula: String) {
    var color = color
    var marca = marca
    var modelo = modelo
    var numeroCaballo = numeroCaballo
    var numeroPuerta = numeroPuerta
    var matricula = matricula
    override fun toString(): String {
        return "color $color, marca $marca, modelo $modelo, numero de caballos $numeroCaballo, numero de puertas $numeroPuerta, matrícula $matricula"
    }

}

fun ej2() {
    println("Introduce el color")
    var colorInput = readln()
    println("Introduce el marca")
    var marcaInput = readln()
    println("Introduce el modelo")
    var modeloInput = readln()
    println("Introduce el número de caballos")
    var numeroCaballoInput = readln()
    println("Introduce el número de puertas")
    var numeroPuertaInput = readln()
    println("Introduce el matrícula")
    var matriculaInput = readln()

    var a = Coche(
        colorInput,
        marcaInput,
        modeloInput,
        numeroCaballoInput.toInt(),
        numeroCaballoInput.toInt(),
        matriculaInput
    )
    println(a.toString())
}

/*
* Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos,
* sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0). Crear el método toString
* para mostrar el tiempo en formato: XXh XXm XXs En el programa principal, debe solicitar por teclado hora, minuto y
* segundo de forma que se puedan omitir los segundos o los minutos (y segundos, claro) e instancie la clase Tiempo
* mostrando su valor.
*/
class Tiempo(hora:Int=0, minuto:Int=0, segundo:Int=0){

    var hora = hora
    var minuto = minuto
    var segundo = segundo
    override fun toString(): String {
        return "Hora: hora $hora, minuto $minuto, segundo $segundo"
    }
}
fun ej3(){
    println("Introduzca la hora")
    var horaInput = readln()
    println("Introduzca los minutos")
    var minutoInput = readln()
    println("Introduza segundos")
    var segundoInput = readln()

    /* No sé como hacer que no te pida itroducir algo obligatoriamente
    when{
        horaInput.isEmpty() -> 0
        horaInput.isEmpty() -> 0
        horaInput.isEmpty() -> 0
    }*/
    var a = Tiempo(horaInput.toInt(), minutoInput.toInt(), segundoInput.toInt())
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
    var actividad = readln()
    var ejercicio = actividad.toInt()
    when {
        ejercicio == 1 -> ej1()
        ejercicio == 2 -> ej2()
        ejercicio == 3 -> ej3()
    }

}