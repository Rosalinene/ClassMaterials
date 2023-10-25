
package exceptionclass;


public class EvenNumberException extends Exception
{
    private String msg;
    private int value;
    public EvenNumberException(String message, int value) {
        msg = message + "the invalid value is " + value + " please enter a even value";
        this.value = value;
        //super(message);
    }

    public EvenNumberException() 
    {
        //super ("Input must be an even integer value, please try again!");

        msg = "Input must be an even integer value, please try again!";
    }
        
    @Override
    public String getMessage()
    {
        return msg;
    }
    
}
