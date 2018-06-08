package pl.java.solution.Kurs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.java.solution.api.IKucharz;
import pl.java.solution.api.IZapiekanka;
import pl.java.solution.config.AppConfig;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IKucharz k = (IKucharz) context.getBean("kucharz");
        k.pobierzSkladnikizMagazynu(1);
        k.przygotujPizze(2);
        k.wydajPizze();
        IKucharz pomocnik = (IKucharz) context.getBean("pomocnikKucharza");
        pomocnik.pobierzSkladnikizMagazynu();
        IKucharz n = (IKucharz) context.getBean("kucharz");
        ((IZapiekanka)n).przygotujZapiekanke();
    }
}
