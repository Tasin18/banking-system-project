/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author mdtas
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    static int accNumber;
    public static void main(String[] args){
        // TODO code application logic here
       try{
           FileReader Read = new FileReader("accNumber.txt");
           Scanner sc = new Scanner(Read);
           String acc = sc.nextLine();
           accNumber = Integer.parseInt(acc);
           Read.close();
       } catch(IOException e)
       {
           e.printStackTrace();
       }
       Project obj = new Project();
       obj.setVisible(true);
    }
}
