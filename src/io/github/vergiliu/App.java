package io.github.vergiliu;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Project
 *
 */

@Configuration
@SpringBootApplication
public class App 
{
    static Logger theLogger = LoggerFactory.getLogger(App.class.getName());
    
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        // restful sample service Spring Boot

        // get http client from Apache
        GetHTTPData myObject = new GetHTTPData();
        try {
            myObject.asyncHttpRequest();
            myObject.httpRequest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        theLogger.info("end of file {}", "here");
    }
}
