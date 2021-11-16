open class Vehicle(var driver: Driver? = null) {


    open fun drive() {

    }


}

class Car() : Vehicle() {

    var distance: Int = 100

    override fun drive() {
        if (driver == null) {
            println("Car didn’t drive - there’s no driver!")
        } else if (driver != null && driver!!.age < 18) {
            println("Car didn't drive - ${driver!!.name} is ${driver!!.age}, but must be 18 or older to drive")
        } else if (driver != null && driver!!.age > 18) {

            distance -= 10
            println("Car drove 10 miles - $distance miles to go")

        }
    }
}

class MilitaryTank() : Vehicle() {

    var distance: Int = 2000

    override fun drive() {
        if (driver == null) {
            println("MilitaryTank didn’t drive - there’s no driver!")
        } else if (driver != null && driver!!.age < 25) {
            println("MilitaryTank didn't drive - ${driver!!.name} is ${driver!!.age}, but must be 25 or older to drive")
        } else if (driver != null && driver!!.age > 25) {


            distance -= 5
            println("MilitaryTank drove 5 miles - $distance miles to go")

        }

    }
}

class Driver(var name: String,var age: Int) {


}

