package moreclasses

class Car(val maxSpeed: Int) {
    private var field: Int = 0
    var currentSpeed: Int = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Velocidade maior do que a permitida!")
            } else {
                this.field = value
            }
            field = value
        }
}

fun main() {

    val c1 = Car(220)
    c1.currentSpeed = 0

}