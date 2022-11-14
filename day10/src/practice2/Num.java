package practice2;

public class Num {

    //冒泡排序
    public void orderNum(int[] num){
        for(int j = 0;j<num.length;j++){
            for (int i = 0;i<num.length;i++){
                int value = 0;
                if(num[i] > num[j]){
                    value = num[i];
                    num[i] = num[j];
                    num[j] = value;
                }
            }
        }
    }
}
