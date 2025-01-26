interface Dimensionable{
    fun printDimensions()
}
abstract class Shape(_name : String) : Dimensionable{
    var name = _name

    open fun getArea(): Double {
        return 0.0
    }
}
fun main(args: Array<String>) {
    val square: Shape = Square()
    val circle: Shape = Circle()
    val triangle: Shape = Triangle()
    val equilateralTriangle: Shape = EquilateralTriangle()

    //For Square and it's functions
    println("Square")
    print("Enter Square Height: ")
    val height = readln().toInt()
    print("Enter Square Length: ")
    val length = readln().toInt()
    (square as Square).setDimensions(length, height)

    //For Circle and it's functions
    println("Circle")
    print("Enter circle Radius: ")
    val radius = readln().toInt()
    (circle as Circle).setDimensions(radius)

    //For triangle and it's functions
    println("Triangle")
    print("Enter Side1 length: ")
    val side1 = readln().toInt()
    print("Enter Side2 length: ")
    val side2 = readln().toInt()
    print("Enter Side3 length: ")
    val side3 = readln().toInt()
    (triangle as Triangle).setDimensions(side1, side2, side3)

    //For Equilateral Triangle
    println("Equilateral Triangle")
    print("Enter ETSide1 length: ")
    val ETSide1 = readln().toInt()
    (equilateralTriangle as EquilateralTriangle).setDimensions(ETSide1)

    println("-----------------------------------")
    println("Square")

    println("Shape Name: ${square.name}")
    square.printDimensions()
    println("Area: ${square.getArea()}")
    println(" ")

    println("Circle")

    println("Shape Name: ${circle.name}")
    circle.printDimensions()
    println("Area: ${circle.getArea()}")
    println(" ")

    println("Triangle")

    println("Shape Name: ${triangle.name}")
    triangle.printDimensions()
    println("Area: ${triangle.getArea()}")
    println(" ")

    println("Equilateral Triangle")

    println("Shape Name: ${equilateralTriangle.name}")
    equilateralTriangle.printDimensions()
    println("Area: ${equilateralTriangle.getArea()}")
    println(" ")
    println("---------------------------")

}