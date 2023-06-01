package Pro.Lesson2_new;

import java.util.Random;

public class Enumerating {
    public static void main(String[] args) {
        int[][] gameBoard = new int[10][10];
        Random random = new Random();

        // Заполнение игрового поля
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameBoard[i][j] = random.nextInt(2); // 0 или 1
            }
        }

        // Подсчет количества кораблей
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (gameBoard[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println("Количество кораблей на поле: " + count);
    }
}
