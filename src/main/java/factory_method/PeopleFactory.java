package factory_method;
//Criamos aqui uma classe cliente para a decisão de qual frase ele vai printar dependendo do gênero
public class PeopleFactory {
//Aqui usamos uma estrutura if-else para decisão pois é só um exemplo de Factory method
    public People getPeople(String name, String gender) {
        if (gender.equals("M")) {
            return new Men(name);
        } else if (gender.equals("F")) {
            return new Woman(name);
        } else {
            System.out.println("Select a valid gender!");
        }
        return null;
    }

}
