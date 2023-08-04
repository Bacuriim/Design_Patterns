package factory_method;
//Aqui criamos o objeto de PeopleFactory e printamos o resultado na classe de gender escolhida
public class Main {
    public static void main(String[] args) {
        PeopleFactory people = new PeopleFactory();
        String name = "Robson";
        String gender = "M";
        people.getPeople(name , gender);
    }
}