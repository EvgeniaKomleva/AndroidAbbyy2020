package tasks;

public class Task01 {

    /**
     * Возвращает минимальное значение из массива.
     * Не использовать стандартную библиотеку!
     */
    public static int min(int[] ints) {
        int minimum = ints[0];
        for(int i = 0; i< ints.length ; i++){
            if(ints[i] <minimum)
                minimum = ints[i];
        }
        return minimum;
    }

    public static float average(int[] ints) {
        float sum = 0;
        for(int i : ints){
            sum += i;
        }
        float average = sum / ints.length;
        return average;
    }

}
