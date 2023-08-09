package abstract_factory.app;

import abstract_factory.buttons.Button;
import abstract_factory.checkboxes.CheckBox;
import abstract_factory.factories.GUIFactory;

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
