fun main() {

    var total = 0.0

    do {
        print("Enter cost for item (0 to exit): ")
        var itemCost = readLine()!!.toDouble()
        total += itemCost
    } while(itemCost != 0.0)

    print("\n  --  Bill --  \n" +
            "Total:\t\t\t\t $${total.format(2)}\n" +
            "Taxes:\t\t\t\t $${(total * 0.025).format(2)}\n" +
            "Total +tax:\t\t\t $${(total * 0.025 + total).format(2)}\n" +
            "Would you like to add a tip\nof $${((total * 0.025 + total) * 0.175).format(2)}?")
}

fun Double.format(digits: Int) = "%.${digits}f".format(this)
