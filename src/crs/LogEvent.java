/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author abdal
 */
public class LogEvent {
    
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
    private static LogEvent instance;
    private static Object lock = new Object();
    
    public static LogEvent getInstance()
    {
        if (instance ==null){
            synchronized(lock){
                if(instance==null){
                    instance = new LogEvent();
                }
            }
        }
        return instance;
    }
    
     public  void addLog(String msg)
    {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
            String dt=dtf.format(LocalDateTime.now());
            
            FileWriter fw = new FileWriter("log.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dt+" "+msg);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            //Logger.getLogger(WriteToFile.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
