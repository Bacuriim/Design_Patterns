package Creational_Patterns.abstract_factory.factories;

import Creational_Patterns.abstract_factory.buttons.Button;
import Creational_Patterns.abstract_factory.buttons.MacOSButton;
import Creational_Patterns.abstract_factory.checkboxes.CheckBox;
import Creational_Patterns.abstract_factory.checkboxes.MacOSCheckbox;
import Creational_Patterns.abstract_factory.factories.GUIFactory;

//Aqui criamos a fabrica concreta MacOSFactory que implementa os métodos abstratos da interface GUIFactory
//e retorna uma nova peça específica da fábrica mac.

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
