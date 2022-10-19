public class Task_02_02 {
public static void insertSort(int[] sortArray) {
    int j;
    //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
    for (int i = 1; i < sortArray.length; i++) {
        //сохраняем ссылку на индекс предыдущего элемента
        int swap = sortArray[i];
        for (j = i; j > 0 && swap < sortArray[j - 1]; j--) {
            //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
            sortArray[j] = sortArray[j - 1];
        }
        sortArray[j] = swap;
    }
}

public static void main(String args[]) {
    int[] sortArr = {1, 16, 42, 14, 2, 77, 12, 4};
    insertSort(sortArr);
    for(int i = 0; i < sortArr.length; i++){
        System.out.print(sortArr[i] + " ");
    }
}
}