import kotlin.math.roundToInt

data class IntTranslation2D(var x: Int, var y: Int) {
    operator fun plus(other: IntTranslation2D) = IntTranslation2D(x + other.x, y + other.y)
    operator fun minus(other: IntTranslation2D) = IntTranslation2D(x - other.x, y - other.y)
    operator fun unaryMinus() = IntTranslation2D(-x, -y)
    operator fun times(scalar: Int) = IntTranslation2D(x * scalar, y * scalar)
    operator fun div(scalar: Int) = IntTranslation2D(x / scalar, y / scalar)
}

data class Translation2D(var x: Double, var y: Double) {
    operator fun plus(other: Translation2D) = Translation2D(x + other.x, y + other.y)
    operator fun minus(other: Translation2D) = Translation2D(x - other.x, y - other.y)
    operator fun unaryMinus() = Translation2D(-x, -y)
    operator fun times(scalar: Double) = Translation2D(x * scalar, y * scalar)
    operator fun div(scalar: Double) = Translation2D(x / scalar, y / scalar)

    fun toInt() = IntTranslation2D(x.roundToInt(), y.roundToInt())
}

data class Translation3D(var x: Double, var y: Double, var z: Double) {
    operator fun plus(other: Translation3D) = Translation3D(x + other.x, y + other.y, z + other.z)
    operator fun minus(other: Translation3D) = Translation3D(x - other.x, y - other.y, z + other.z)
    operator fun unaryMinus() = Translation3D(-x, -y, -z)
    operator fun times(scalar: Double) = Translation3D(x * scalar, y * scalar, z * scalar)
    operator fun div(scalar: Double) = Translation3D(x / scalar, y / scalar, z / scalar)
}