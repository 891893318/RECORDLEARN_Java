import org.testng.annotations.Test;

public class Insertion<T> {
    public boolean compare(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    public void insert(T[] a){
        for (int i = 1;i<a.length;i++){
            for (int j = i; compare((Comparable) a[j], (Comparable) a[j-1]); j--) {
                T temp ;
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
    }

    @Test
    public void test1(){
        Insertion<Integer> ins1 = new Insertion();
        Integer[] num = new Integer[]{1,6,5,4,3,33};
        ins1.insert(num);
        for (Integer member: num) {
            System.out.println(member);
        }
    }

    @Test
    public void test2(){
        Insertion<String> ins2 = new Insertion<>();
        String[] num = new String[]{"a","e","r","b","a"};
        ins2.insert(num);
        for (String member: num) {
            System.out.println(member);
        }
    }

}