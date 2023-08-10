package Creational_Patterns.abstract_factory.buttons;

//Criamos uma classe MacOSButton que implementa a interface Button e utiliza seu método paint
// de modo específico para o sistema mac.

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacOSButton.");
    }
}
