package homework.day15.question2;

public class newPhone extends Phone implements Play{
    public newPhone() {
    }

    @Override
    public void play() {
        System.out.println("新手机可以玩游戏");
    }
}
