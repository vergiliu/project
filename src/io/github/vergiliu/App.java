package io.github.vergiliu;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project
 *
 */

public class App 
{
    static Logger theLogger = LoggerFactory.getLogger("App");
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        theLogger.info("end of file {}", "here");
    }
}
