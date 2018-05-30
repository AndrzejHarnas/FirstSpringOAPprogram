package pl.java.solution.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.java.solution.api.IKucharz;
import pl.java.solution.aspects.Komunikacja;
import pl.java.solution.aspects.KontrolaMagazynu;
import pl.java.solution.impl.Kucharz;


@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
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

}
