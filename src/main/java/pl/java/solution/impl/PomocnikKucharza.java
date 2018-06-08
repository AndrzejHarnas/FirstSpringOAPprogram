package pl.java.solution.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.java.solution.api.IKucharz;

@Deprecated
public class PomocnikKucharza implements IKucharz {

    @Autowired
    @Qualifier("pomocnik_kucharza")
    private IKucharz kucharz;



    public void pobierzSkladnikizMagazynu(int liczbaSkladnikow) {
        System.out.println("Pomocnik pobiera "+ liczbaSkladnikow +" skladnikow z magazynu");
    }

    public void pobierzSkladnikizMagazynu() {
        System.out.println("Pomocnik pobiera składniki z magazynu");
        //      throw new IllegalAccessError();
    }

    public void przygotujPizze(int idPizzy) {
        System.out.println("Pomocnik odelegowuje przygotowanie pizzy o id = " + idPizzy + " do kucharza");
    kucharz.przygotujPizze(idPizzy);
    }

    public void przygotujPizze() {
        System.out.println("Pomocnik oddelegowuje pizze do kucharza");
        kucharz.przygotujPizze();
    }

    public void wydajPizze() {
        System.out.println("Pomocnik wydaje pizze");
    }


}
