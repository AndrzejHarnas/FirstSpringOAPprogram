package pl.java.solution.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class Komunikacja {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt) {
    }

    @Pointcut("target(pl.java.solution.api.IKucharz)")
    public void pointcutTarget() {
    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation) {
    }

    @Pointcut("within(pl.java.solution.impl.Kucharz)")
    public void pointcutWithin() {
    }

//    @Before("pointcutInt(arg)")
//public void porada(int arg) {
//    System.out.println("PORADA " + arg);
//}

//    @Before("pointcutTarget()")
//    public void porada() {
//        System.out.println("PORADA ");
//    }

//    @Before("pointcutTargetAnnotation(anno)")
//    public void porada(Deprecated anno) {
//        System.out.println("PORADA " + anno);
//}

//    @Before("pointcutWithin()")
//    public void porada() {
//        System.out.println("PORADA ");
//}

    @Before("pointcutWithin() && pointcutInt(arg)")
    public void porada(int arg) {
        System.out.println("PORADA "+ arg);
    }


    /*   @After("execution(* pl.java.solution.api.IKucharz.pobierzSkładnikizMagazynu(..))")
       public void poinformujOPobraniuSkładników(){
           System.out.println("Pobrano składniki");
       }


    @Around("execution(* pl.java.solution.api.IKucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint joinPoint) {

        try {
            System.out.println("Komunikujemy ze pizza jest gotowa");
            joinPoint.proceed();
            System.out.println("Komunikujemy ze wydano pizze");

        } catch (Throwable e) {

            e.printStackTrace();

        }


    }
*/
}