package factory_method;
//Criamos a opção Men que estende People e recebe o nome da pessoa caso for selecionado seu gender na classe PeopleFactory
public class Men extends People {

    public Men(String name) {
        this.name = name;
        System.out.println("Good Morning Sir " + name);
    }
}
