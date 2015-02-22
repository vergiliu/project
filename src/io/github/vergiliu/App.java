package io.github.vergiliu;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Project
 *
 */

public class App 
{
    static Logger theLogger = LoggerFactory.getLogger(App.class.getName());
    
    public static void main( String[] args )
    {
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
