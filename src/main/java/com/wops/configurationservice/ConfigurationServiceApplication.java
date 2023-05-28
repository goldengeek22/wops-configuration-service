package com.wops.configurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Alexandre AMEVOR
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigurationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServiceApplication.class, args);
    }
}
