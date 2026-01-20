package exception.myexception;

public class LoginException extends Exception{
    //空参构造
    public LoginException(){

    }

    //带参构造
    //异常提示
    public LoginException(String message){
        //把异常信息传给父类Exception
        super(message);
    }
}
