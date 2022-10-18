package krypton.dev.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ConfigApp implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigApp.class);

    @Value("${test.myvar}")
    private String myVar;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("\uD83D\uDE80 Iniciando app");
        System.out.println("::::::::INICIANDO PLAIN TEXT");
        System.out.printf("%s %s %d --- %s   : %s", LocalDateTime.now(), "INFO", 234523,"Test App", "Este es un mensaje de prueba");
        System.out.println(myVar);
    }

}
