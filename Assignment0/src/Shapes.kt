import kotlin.math.sqrt

class Square : Shape("Square") {
    private var length: Int = 0
    private var height: Int = 0

    override fun printDimensions() {
        println("Dimensions: length=$length, height=$height")
    }

    fun setDimensions(length: Int, height: Int) {
        this.length = length
        this.height = height
    }

    override fun getArea(): Double {
        return (length * height).toDouble()
    }
}

class Circle : Shape("Circle") {
    private var PI = Math.PI
    private var radius: Int = 0

    override fun printDimensions() {
        println("Dimensions: radius=$radius")
    }

    fun setDimensions(radius: Int) {
        this.radius = radius
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}

open class Triangle(_name: String = "Triangle") : Shape(_name) {
    private var side1: Int = 0
    private var side2: Int = 0
    private var side3: Int = 0

    override fun printDimensions() {
        println("Dimensions: side1=$side1, side2=$side2, side3=$side3")
    }

    fun setDimensions(side1: Int, side2: Int, side3: Int) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3).toDouble() / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
}

class EquilateralTriangle : Triangle() {
    fun setDimensions(sideLength: Int) {
        super.setDimensions(sideLength, sideLength, sideLength)
    }
}