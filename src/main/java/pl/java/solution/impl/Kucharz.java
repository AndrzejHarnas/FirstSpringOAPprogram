package pl.java.solution.impl;

import pl.java.solution.api.IKucharz;

public class Kucharz implements IKucharz {

    private String imie;

    public Kucharz(String imie){
        this.imie = imie;
    }

    public void pobierzSkładnikizMagazynu() {
        System.out.println("Kucharz "+ imie + " pobiera składniki");
  //      throw new IllegalAccessError();
    }

    public void przygotujPizze() {
        System.out.println("Kucharz "+ imie + " przygotowuje pizze");
    }

    public void wydajPizze() {
        System.out.println("Kucharz "+ imie + " wydaje pizze");
    }
}
