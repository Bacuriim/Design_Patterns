package Behavioral_Patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new Observer1();
        subject.attach(observer1);

        Observer observer2 = new Observer2();
        subject.attach(observer2);

        subject.setState("New State 1");
        subject.setState("New State 2");
    }
}
//Aqui é criado o observer e seu metodo update que irá atualizar o estado dos observers
interface Observer {
    void update(String state);
}

class Observer1 implements Observer {
//Criação do observer 1
    @Override
    public void update(String state) {
        System.out.println("Observer 1 updated to state: " + state);
    }
}

class Observer2 implements Observer {
//Criação do observer 2
    @Override
    public void update(String state) {
        System.out.println("Observer 2 updated to state: " + state);
    }
}

//Essa é a classe observada
class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }
    //Aqui occore a atualização dos estados
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    private String state;

//Aqui ocorre notificação de atualização de estados aos observers
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

