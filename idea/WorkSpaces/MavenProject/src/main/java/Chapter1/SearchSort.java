package Chapter1;

/**
 * @author benqi
 * @date 2020/1/5 10:53
 * @Description  直接排序
 */
public class SearchSort {
    public static void main(String[] args) {
        int [] array = {63,23,1,3,15};
        SearchSort sorter = new SearchSort();
        sorter.sort(array);
    }

    private void sort(int[] array) {
        int index;
        for (int i =1;i<array.length;i++){
            index = 0;
            for (int j = 1;j<=array.length-i;j++){
                if (array[j]>array[index]){
                    index = j;
                }
            }
            int temp = array[array.length -i];
            array[array.length -i] = array[index];
            array[index] = temp;
        }
        showArray(array);
    }

    private void showArray(int[] array) {
        for (int i : array){
            System.out.print(">"+i);
        }
        System.out.println();
    }
}
