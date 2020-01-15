package Chapter1;

/**
 * @author benqi
 * @date 2020/1/5 11:26
 * @Description 反转排序
 */
public class ReverseSort {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array);
    }

    private void sort(int[] array) {
        System.out.println("数组原有内容：");
        showArray(array);
        int temp;
        int len = array.length;
        for (int i =0;i<len/2;i++){
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i]=temp;
        }
        System.out.println("反转后的内容：");
        showArray(array);
    }

    private void showArray(int[] array) {
        for (int i : array){
            System.out.print("\t"+i);
        }
        System.out.println();
    }

}
