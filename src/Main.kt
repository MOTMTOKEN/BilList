fun main(args: Array<String>) {


    val d1 =  Driver("Emilia",17)
    val d2 =  Driver("Niklas", 21)

    val v1 : Vehicle =  Car()
    val v2 : Vehicle  = MilitaryTank()

    v1.drive() // Prints “Car didn’t drive - there’s no driver!”
    v2.drive() // Prints “MilitaryTank didn’t drive - there’s no driver!”

    v1.driver = d1

    v1.drive() // Prints "Car didn't drive - Emilia is 17, but must be 18
    // or older to drive"

    v1.driver = d2
    v2.driver = d2

    v2.drive() // Prints "MilitaryTank didn't drive - Niklas is 21, but
    // must be 25 or older to drive"

    v2.driver = Driver("TankMan", 300)

    v1.drive() // Prints “Car drove 10 miles - 90 miles to go”
    v2.drive() // Prints “MilitaryTank drove 5 miles - 1995 miles to go”
    v1.drive() // Prints “Car drove 10 miles - 80 miles to go”
    v2.drive() // Prints “MilitaryTank drove 5 miles - 1990 miles to go”




}