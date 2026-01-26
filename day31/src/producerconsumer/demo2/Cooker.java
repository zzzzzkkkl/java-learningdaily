package producerconsumer.demo2;

public class Cooker {
    /*
    升级版
     */
    private Desk desk;

    public Cooker(Desk desk){
        this.desk=desk;
    }


    public void run() {
        while(true){
            synchronized (desk.getLock()){
                if(desk.getCount()==0){
                    break;
                }else{
                    if(!desk.isFlag()){
                        System.out.println("生产包子");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }else{
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
