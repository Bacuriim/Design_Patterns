package Structural_Patterns.adapter;

// Interface alvo que o cliente espera usar
interface Target {
    void operation();
}

// Classe que o cliente quer usar (classe existente)
class ExistingClass {
    void existingMethod() {
        System.out.println("Método existente sendo chamado.");
    }
}

// Adaptador que faz a ClasseExistente funcionar como um Alvo
class Adapter implements Target {
    private ExistingClass existingClass;

    public Adapter(ExistingClass existingClass) {
        this.existingClass = existingClass;
    }

    @Override
    public void operation() {
        existingClass.existingMethod();

    }
}

// Cliente que usa o Alvo para realizar operações
class Client {
    public void executeOperation(Target target) {
        target.operation();
    }
}

// Classe principal que demonstra o uso do padrão Adapter
public class Main {
    public static void main(String[] args) {
        ExistingClass existingClass = new ExistingClass();
        Adapter adapter = new Adapter(existingClass);

        Client client = new Client();
        client.executeOperation(adapter);
    }
}
