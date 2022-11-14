package practice3;

/**
 * @author 89189
 */
public class NumIndexEx {
    public void sort(int[] nums) {
        try {
            for (int i = 0;i<=11;i++){
                System.out.println(nums[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("越界");
            e.printStackTrace();
        }
    }
}

