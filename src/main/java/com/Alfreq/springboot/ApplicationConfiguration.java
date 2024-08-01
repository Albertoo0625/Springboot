package com.Alfreq.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public Printablee myPrintable() {
        return new Printablee("printableee");
    }

    @Bean
    public Printablee mySecondPrintable() {
        return new Printablee("SecondPrintableee");
    }
}
