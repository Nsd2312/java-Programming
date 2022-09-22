package com.logicalprogram_CGI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_Words_Characters_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null; 
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
         
        try
        {
           
              reader = new BufferedReader(new FileReader("C:\\cgi.txt"));
             
               String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
                
                 lineCount++;
                 
                 String[] words = currentLine.split(" ");
                 
               
                  wordCount = wordCount + words.length;
                 
               
                 
                for (String word : words)
                {
                     
                    charCount = charCount + word.length();
                }
                 
             
                 
                currentLine = reader.readLine();
            }
             
        
             
            System.out.println("Number Of Chars In A String : "+charCount);
             
            System.out.println("Number Of Words In A String : "+wordCount);
             
            System.out.println("Number Of Lines In A String : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();          
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    } 

}
=============THANKYOU==========