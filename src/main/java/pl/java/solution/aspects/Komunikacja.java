package pl.java.solution.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class Komunikacja {

    @After("execution(* pl.java.solution.api.IKucharz.pobierzSkładnikizMagazynu(..))")
    public void poinformujOPobraniuSkładników(){
        System.out.println("Pobrano składniki");
    }

    @Around("execution(* pl.java.solution.api.IKucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint joinPoint){

     try {
         System.out.println("Komunikujemy ze pizza jest gotowa");
         joinPoint.proceed();
         System.out.println("Komunikujemy ze wydano pizze");

     }

     catch(Throwable e) {

         e.printStackTrace();

     }


     }

}
