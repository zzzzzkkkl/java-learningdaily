package realizemultithread.threaddemo3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("买彩票"+i);
        }
        //返回值就表示线程运行完毕之后的结果
        return "中奖了";
    }
}
