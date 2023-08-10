package Creational_Patterns.factory_method;
//Criamos a classe Woman que estende People e recebe o nome da pessoa caso for selecionado seu gender na classe PeopleFactory
public class Woman extends People {

    public Woman(String name) {
        this.name = name;
        System.out.println("Good Morning Miss " + name);;
    }
}
