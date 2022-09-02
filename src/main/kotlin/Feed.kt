fun myFeed(myPet: MyPet):String{

    return when(myPet){
        is Meowsi->"Hello m"
        is Rabbit->"Hello R"
    }
}