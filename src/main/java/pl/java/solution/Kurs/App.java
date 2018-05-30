package pl.java.solution.Kurs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.java.solution.api.IKucharz;
import pl.java.solution.config.AppConfig;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IKucharz k = context.getBean(IKucharz.class);
        k.pobierzSkładnikizMagazynu();
        k.przygotujPizze();
        k.wydajPizze();
    }
}
