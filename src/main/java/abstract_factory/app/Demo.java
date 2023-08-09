package abstract_factory.app;

import abstract_factory.factories.GUIFactory;
import abstract_factory.factories.MacOSFactory;
import abstract_factory.factories.WindowsFactory;

//Por fim, criamos o construtor configureApplication e este verifica qual o sistema operacional utilizado
//assim criando o objeto relacionado a esse sistema e por fim printando a mensagem que valida a construção desejada!

public class Demo {
    private static Application configureApplication(){
        Application app;
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
