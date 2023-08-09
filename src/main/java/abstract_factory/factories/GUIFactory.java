package abstract_factory.factories;

import abstract_factory.buttons.Button;
import abstract_factory.checkboxes.CheckBox;

//Criamos aqui uma interface de fábrica GUIFactory, essa tem os métodos abstratos createButton() e createCheckbox().

//Essa interface será responsável pela implementação das peças de montagem nas fábricas concretas.

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
