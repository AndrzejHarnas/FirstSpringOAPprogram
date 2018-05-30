package pl.java.solution.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KontrolaMagazynu {

    @Pointcut("execution(* pl.java.solution.api.IKucharz.pobierzSkładnikizMagazynu(..))")
    public void path(){

    }

    @Before("path()")
    public void sprawdzSkladnikiMagazynu(){
        System.out.println("Sprawdzam stan magazynu");
    }

    @AfterThrowing("path()")
    public void zasygnalizujBrakiWMagazynie(){
        System.out.println("Braki w magazynie !!!");
    }




}
