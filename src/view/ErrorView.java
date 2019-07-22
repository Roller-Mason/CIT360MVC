/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.PrintWriter;
import cit360mvc.CIT360MVC;

/**
 *
 * @author Roller
 */
public class ErrorView {
    
    private static PrintWriter console = CIT360MVC.getOutFile();
    private static PrintWriter log = CIT360MVC.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println(
                "\n--- ERROR ---------------------------------------------------------"
               +"\n" + errorMessage
               +"\n-------------------------------------------------------------------"
        );
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
    
}
