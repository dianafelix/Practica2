package com.test.clase.demo.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @RequestController  indica que esta clase sera un controlador de servicio Rest
 */

@RestController
public class HelloController {


    /**
     * Traza la ruta raiz "/" y envia saludo
     */

    @RequestMapping("/")
    public String index() {
        return "Saludos!!! desde Spring Boot!";
    }


    /**
     *
     * @CommandLineRunner, sirve para crear una acción mientras al inicio de la aplicación
     *
     */

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Inspeccionar los beans que provee Spring Boot:");

            /**
             * Le pide al contexto (ctx) los bean definidos
             */
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.err.println(beanName);
            }

        };
    }

}
