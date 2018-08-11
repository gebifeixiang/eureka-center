package com.eureka.EurekaCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaCenter 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaCenter.class, args);
        System.out.println( "Hello EurekaCenter!" );
    }
}
