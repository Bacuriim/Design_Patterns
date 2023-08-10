package Creational_Patterns.abstract_factory.factories;

import Creational_Patterns.abstract_factory.checkboxes.CheckBox;
import Creational_Patterns.abstract_factory.checkboxes.WindowsCheckbox;
import Creational_Patterns.abstract_factory.buttons.WindowsButton;
import Creational_Patterns.abstract_factory.buttons.Button;
import Creational_Patterns.abstract_factory.factories.GUIFactory;

//Aqui criamos a fabrica concreta MacOSFactory que implementa os métodos abstratos da interface GUIFactory
//e retorna uma nova peça específica da fábrica windows.

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
