package day4.task2;

/**
 * todo Document type BurgerException
 */
public class BurgerException extends Exception{
    private String message;
    public BurgerException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
