package pl.java.solution.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.java.solution.api.IKucharz;
import pl.java.solution.api.IZapiekanka;
import pl.java.solution.aspects.AspectZapieknka;
import pl.java.solution.aspects.Komunikacja;
import pl.java.solution.aspects.KontrolaMagazynu;
import pl.java.solution.impl.Kucharz;
import pl.java.solution.impl.PomocnikKucharza;
import pl.java.solution.impl.Zapiekanka;


@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    @Qualifier("Kucharz")
    public IKucharz kucharz(){


        return new Kucharz("Władek");
    }

    @Bean
    public Komunikacja komunikacja(){
        return new Komunikacja();
    }

    @Bean
    public KontrolaMagazynu kontrolaMagazynu(){
        return new KontrolaMagazynu();
    }

    @Bean
    @Qualifier("pomocnik_kucharza")
    public IKucharz pomocnikKucharza(){
        return new PomocnikKucharza();
    }

    @Bean
    public IZapiekanka iZapiekanka(){
        return new Zapiekanka();

    }

    @Bean
    public AspectZapieknka aspectZapiekanka(){
        return new AspectZapieknka();
    }

}
