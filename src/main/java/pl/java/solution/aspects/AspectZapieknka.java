package pl.java.solution.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import pl.java.solution.api.IZapiekanka;
import pl.java.solution.impl.Zapiekanka;
import sun.awt.SunHints;

@Aspect
public class AspectZapieknka {


    @DeclareParents(value="pl.java.solution.api.IKucharz+" , defaultImpl = Zapiekanka.class)
public static IZapiekanka izapikeanka;

}
