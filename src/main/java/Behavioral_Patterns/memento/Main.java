package Behavioral_Patterns.memento;

import java.util.ArrayList;
import java.util.List;

class MementoPattern {

    private final List<State> stateHistory = new ArrayList<>();

    public void setState(State state) {
        this.stateHistory.add(state);
    }

    public State getState() {
        if (!stateHistory.isEmpty()) {
            return stateHistory.get(stateHistory.size() - 1);
        }
        return null;
    }

    public State restoreState(int index) {
        if (index >= 0 && index < stateHistory.size()) {
            return stateHistory.get(index);
        }
        return null;
    }

    public void clearStateHistory() {
        stateHistory.clear();
    }
}

class State {

    private final int value;

    public State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
        MementoPattern memento = new MementoPattern();
        memento.setState(new State(10));
        memento.setState(new State(20));
        memento.setState(new State(30));

        System.out.println(memento.getState().getValue()); // 30

        State restoredState = memento.restoreState(1); // Restaurar o estado

        if (restoredState != null) {
            memento.setState(restoredState); // Atribuir o estado restaurado de volta
        } else {
            System.out.println("No state to restore.");
        }
        System.out.println(memento.getState().getValue()); // 20

        memento.clearStateHistory();

        System.out.println(memento.getState()); // null
    }
}