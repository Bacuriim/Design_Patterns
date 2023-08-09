package abstract_factory.factories;

import abstract_factory.buttons.WindowsButton;
import abstract_factory.buttons.Button;
import abstract_factory.checkboxes.CheckBox;
import abstract_factory.checkboxes.WindowsCheckbox;

//Aqui criamos a fabrica concreta MacOSFactory que implementa os métodos abstratos da interface GUIFactory
//e retorna uma nova peça específica da fábrica windows.

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
