/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import view.StartProgramView;

/**
 *
 * @author Mason
 */
public class CIT360MVC {
    
    private static PrintWriter outFile = null;
    private static PrintWriter logFile = null;
    private static BufferedReader inFile = null;
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CIT360MVC.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CIT360MVC.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CIT360MVC.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           
       inFile = new BufferedReader(new InputStreamReader(System.in));
       
       outFile = new PrintWriter(System.out, true);
       
       logFile = new PrintWriter("logFile.txt");
           
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.display();
       }
       catch (Throwable e){
           System.out.println("Oops, something went wrong, if persistent contact the developer: " + e.getMessage());
           e.printStackTrace();
           return;
       }
       
       finally {
            try{
                if (inFile != null)
                    inFile.close();
                
                if (outFile != null)
                    outFile.close();
                
                if (logFile != null)
                    logFile.close();
            } 
            catch (IOException ex) {
                System.out.println("Error closing the files!");
                return;
            }
        }
    }
    
}
