var A: Int = 5

fun incrementA() {
    A += 1
}

fun main(){
    //val name = readLine()
    val B = 2
    val C: Int = 5
    val D: Int
    D = 5
    var E = 9

    fun incrementE() {
        E += 1
    }

    incrementA()
    println("A="+A)
    incrementE()
    println("E="+E)

    println("Adding "+C+" and "+B+" results in "+soucet(C,B))
    println(""+C+" powered by "+B+" is "+mocnina(C,B))
    println("Factorial of "+C+" is "+factorial(C))

    val block1 = shape_Block(3,4,4)
    val block2 = shape_Block(3,4,4, 600)
    println(block1.getVolume())
    block1.printVolume()
    println(block1.getWeight())
    println(block2.getWeight())
    block1.printWeight()
    block2.printWeight()
}


fun soucet (a: Int, b: Int): Int {
    return a+b
}

fun mocnina (a: Int, b: Int): Int {
    var result = 1
    for (i in 1..b){
        result = result*a
    }
    return result
}

fun factorial (a: Int): Int{
    var result = 1
    var x = 1
    while (x<=a){
        result = result*x
        x++
    }
    return result
}

class shape_Block (var Ameters: Int, var Bmeters: Int, var Cmeters: Int, var DensityKGpM3: Int? = null){

    fun getVolume(): Int{
        return Ameters*Bmeters*Cmeters
    }
    fun printVolume(){
        println("Volume of this block is "+Ameters*Bmeters*Cmeters+ " m^3")
    }
    fun getWeight(): Int?{
        if (DensityKGpM3!=null){
            return Ameters*Bmeters*Cmeters* DensityKGpM3!!
        }
        else return null
    }
    fun printWeight(){
        if (DensityKGpM3!=null){
            println("Weight of this block is "+Ameters*Bmeters*Cmeters* DensityKGpM3!!+" kg")
        }
        else println("Density [parameter 4] not entered")
    }
}