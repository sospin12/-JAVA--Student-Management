import java.util.ArrayList;

public class bubbleSort {

    public static void organiceBubbleSort(ArrayList<Students> array) {
        Students temp;

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                if (array.get(j).grade > array.get(j + 1).grade) {
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }

}
