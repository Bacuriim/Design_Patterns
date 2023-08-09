package abstract_factory.checkboxes;
//Criamos a classe MacOSCheckbox que implementa checkbox e passa seu método paint e dentro dele
//tem a específicidade do sistema mac.
public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created a MacOSCheckbox");
    }
}
