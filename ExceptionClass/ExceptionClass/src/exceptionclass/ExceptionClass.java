package exceptionclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionClass 
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int data [] ={1,2,3,4,5};
        
        try
        {
            for(int index=0; index < data.length; index++)
            {
                System.out.println(10/data[index]);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        
        try
        {
            File file = new File("somefile.txt");
            FileReader fileReader = new FileReader(file);
            
            char data2;
            data2 = (char)(fileReader.read());
            System.out.println(data2);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        boolean valid = false;
        
        while(!valid)
        {
            try
            {
                int value = GetInput();
                valid = true;
            }
            catch(EvenNumberException e)
            {
                
                System.out.println(e.getMessage());
                valid = false;
            }
        }
        System.out.println("Ending");
    }//end of main
    
    public static int GetInput() throws EvenNumberException
    {
        Scanner input = new Scanner(System.in);
        int value;
        
        System.out.print("Enter an even integer number");
        value = input.nextInt();
        
        if(value%2 != 0)
            throw new EvenNumberException("Hello World value is ", value);
        
        return value;
    }
}
