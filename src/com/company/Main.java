package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String line; // creates a string variable
//        BufferedReader reader = null; // creates the reader variable
//
//        try{//tries to access the file, if file exists it will run the while loop and read the text
//            reader = new BufferedReader(new FileReader("MyText"));
//            line = reader.readLine();
//            while(line != null){
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            try{
//                if(reader != null){
//                    reader.close();
//                }
//
//            }
//            catch (IOException e){
//                System.out.println(e.getMessage());
//            }
//        }


        //This code runs the same as above just smaller and easier to read, it only uses bufferedreader if the file exist.
        //this eliminates having to use the reader.close();
        try (BufferedReader reader = new BufferedReader(new FileReader("MyText"))){
            line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
