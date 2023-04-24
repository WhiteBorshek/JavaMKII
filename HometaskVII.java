package Hometasks;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class HometaskVII {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(HometaskVII.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setFormatter(sFormatter);

        int[] array = new int[]{4, 7, 6, 1, 29, 9, 18, 32, 41, 11, 24, 4};
        logger.log(Level.INFO, Arrays.toString(array));

        for (int out = array.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int tmp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = tmp;
                }
            }
            logger.log(Level.INFO, Arrays.toString(array));
        }
    }
}
