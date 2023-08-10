package Creational_Patterns.abstract_factory.app;

import Creational_Patterns.abstract_factory.factories.GUIFactory;
import Creational_Patterns.abstract_factory.buttons.Button;
import Creational_Patterns.abstract_factory.checkboxes.CheckBox;

//Aqui ocorre o processo de abstração da ação de criação dos componentes das fábricas.

public class Application {
    private Button button;
    private CheckBox checkbox;
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
