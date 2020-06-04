package Day45Exception;


class BreaktimeException extends RuntimeException{//custom unchecked exception

    public BreaktimeException(){
        super("It's break time, we should take break");
    }
    public BreaktimeException(String str){
        super(str);
    }
}


public class CustomException {


    public static void main(String[] args) {
        boolean breakTime = true;
        if (breakTime) {
            throw new BreaktimeException("Let's have a break please");
        } else {
            System.out.println("Continue the class");
        }
        // throw new RuntimeException("It's break time, we should take break") ;}

    }
}
