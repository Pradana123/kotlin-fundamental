fun main() {
    val user = setUser("Pradana", "playing football", 15)
    println(user)

}

fun setUser(name: String,hobby: String, age: Int) = "my name is $name, my $hobby and I'm $age years old"