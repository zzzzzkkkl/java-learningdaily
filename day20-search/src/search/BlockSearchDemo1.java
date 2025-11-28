package search;

public class BlockSearchDemo1 {
    public static void main(String[] args) {
        /*分块查找
        核心逻辑：块内无序，块间有序
        实现步骤：创建数组blockArr存放每一个块对象的信息，先查找blockArr确定要查找的数据属于哪一块，再单独遍历这一块的数据
         */
        int[] arr={16,5,9,12, 21,18,
                32,23, 37,26,45,34,
                50,48,61,52,73,66};

        //1.要把数据分块
        //创建三个块的对象
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,17);
        //2.定义数组 即索引表 管理对象
        Block[] blockArr={b1,b2,b3};
        //3.定义一个变量用来记录要查找的元素
        int number=30;
        //4.调用方法，传递索引表，数组，要查找的对象
        int index=getIndex(blockArr,arr,number);
        System.out.println(index);
    }

    //知道在哪一块，遍历这一块找元素
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.确定number在哪一块
        int indexBlock=findIndexBlock(blockArr,number);
        if(indexBlock==-1){
            //表示number不在数组当中
            return -1;
        }
        //2.获取这个块的起始索引和结束索引
        int startIndex=blockArr[indexBlock].getStartIndex();
        int endIndex=blockArr[indexBlock].getEndIndex();
        //3.遍历起始和结束之间的元素
        for(int i=startIndex;i<endIndex;i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    //定义一个方法 确定number在哪一块中
    public static int findIndexBlock(Block[] blockArr,int number){
//        Block b1=new Block(21,0,5);
//        Block b2=new Block(45,6,11);
//        Block b3=new Block(73,12,17);

        //从0索引遍历blockArr，如果number<max,那么就表示number在这一块
        for (int i = 0; i < blockArr.length; i++) {
            if(number<=blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}
class Block{
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
