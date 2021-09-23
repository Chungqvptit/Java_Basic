/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class TryCatchFinally {
    // throw & throws
    public static void message() throws ArithmeticException 
    {  
        throw new ArithmeticException("sorry");  
    }  
    public static void main(String[] args) 
    {
        
        
        //try & catch & finally & Checked exception  
        BufferedReader br = null;
        try 
        {
            String sCurrentLine;
            // read file student.txt
            br = new BufferedReader(new FileReader("student.txt"));

            while ((sCurrentLine = br.readLine()) != null) 
            {
                System.out.println(sCurrentLine);
            }

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } finally 
        {
            try 
            {
                if (br != null)
                    // close stream br
                    br.close();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }
        
        //try & catch & finally & Unchecked exception 
        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        // throw & throws
        message();
    }
}
