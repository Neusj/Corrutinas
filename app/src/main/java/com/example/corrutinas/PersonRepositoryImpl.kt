package com.example.corrutinas

class PersonRepositoryImpl : PersonRepository {

    private val listPerson = ArrayList<Person>()

    init {
        listPerson.add(Person("Martin Alonso", "Pinzon", 53, "Ñuñoa"))
        listPerson.add(Person("Juan Sebastian", "Elcano", 40, "Peñalolen"))
        listPerson.add(Person("Americo", "Vespucio", 58, "Qulicura"))
        listPerson.add(Person("José", "López", 22, "Macul"))
        listPerson.add(Person("Antonio", "Vera", 33, "Estación Central"))
    }

    override fun getPersons(): ArrayList<Person> {
        return listPerson
    }


}