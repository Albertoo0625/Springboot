package com.Alfreq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.print.Printable;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		var context=SpringApplication.run(SpringbootApplication.class, args);
		PrintingService printer=context.getBean(PrintingService.class);
		System.out.println(printer.myPrintable.greeting());
	}
}
