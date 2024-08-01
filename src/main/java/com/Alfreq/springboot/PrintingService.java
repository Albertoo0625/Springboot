package com.Alfreq.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintingService {

    public Printablee myPrintable;

    public PrintingService(@Autowired Printablee myPrintable) {
        this.myPrintable = myPrintable;
    }
}
