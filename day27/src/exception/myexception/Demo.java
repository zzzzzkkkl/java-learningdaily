package exception.myexception;

public class Demo {
    private static String[] names={"bill","hill","jill"};
    public static void main(String[] args) {
        try{
            checkUsername("nill");
            System.out.println("注册成功");
        }catch(LoginException e){
            //处理异常 打印异常详细信息
            e.printStackTrace();
        }
    }
    public static boolean checkUsername(String uname)
        throws LoginException{
        for(String name:names){
            if(name.equals(uname)){
               throw new LoginException(name+"已经被注册了");
            }
        }
        return true;
    }
}
