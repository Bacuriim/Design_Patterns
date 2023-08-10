package Creational_Patterns.abstract_factory.checkboxes;
//Criamos a classe MacOSCheckbox que implementa checkbox e passa seu método paint e dentro dele
//tem a específicidade do sistema windows.
public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created a WindowsCheckbox");
    }
}
