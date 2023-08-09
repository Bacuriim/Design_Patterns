package abstract_factory.factories;

import abstract_factory.buttons.Button;
import abstract_factory.buttons.MacOSButton;
import abstract_factory.checkboxes.CheckBox;
import abstract_factory.checkboxes.MacOSCheckbox;

//Aqui criamos a fabrica concreta MacOSFactory que implementa os métodos abstratos da interface GUIFactory
//e retorna uma nova peça específica da fábrica mac.

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
