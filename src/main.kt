fun main(){
    var person = Humans("Winnie",23, 50)
    person.eat(20)
    println(person.weight)
    person.speak("My name is Winnie Mwangi")
    person.birthday(23)
    println(person.age)
    var someone = User("Winnie","Mwangi", "Winniewameremwangi@gmail.com", 2547382682, "kachy231")
    println(someone.FirstName)
    println(someone.email)


}
class Humans(var name:String, var age: Int, var weight:Int)

{
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight+=foodweight


    }

    fun speak(speech:String){
        println(speech)

    }

    fun birthday(Bday:Int){
        age++
    }

}

data class User(var FirstName:String, var LastName:String, var email:String, var phonenumber:Long, var passwords:String){

}