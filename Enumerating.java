package Pro.Lesson2_new;
import java.util.Random;

public class Enumerating {
    public static void main(String[] args) {
        int[][] gameBoard = new int[10][10]; // Инициализация игрового поля размером 10x10
        Random random = new Random(); // Создание объекта Random для генерации случайных чисел

        // Подсчет количества кораблей
        int count = 0; // Счетчик кораблей

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (gameBoard[i][j] == 1 && !ship(gameBoard, i, j)) {
                    // Если текущая клетка содержит корабль и нет соседних клеток с кораблем, увеличиваем счетчик
                    count++;
                }
            }
        }

        System.out.println("Количество кораблей на поле: " + count);
    }

    // Метод для проверки соседних клеток на наличие корабля
    private static boolean ship(int[][] gameBoard, int row, int col) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        // Массив смещений для проверки соседних клеток (вверх, вниз, влево, вправо)

        for (int[] dir : directions) {
            int newRow = row + dir[0]; // Координата новой строки
            int newCol = col + dir[1]; // Координата нового столбца

            // Проверяем, находится ли новая клетка в пределах игрового поля и содержит ли она корабль
            if (newRow >= 0 && newRow < 10 && newCol >= 0 && newCol < 10 && gameBoard[newRow][newCol] == 1) {
                return true; // Обнаружена соседняя клетка с кораблем
            }
        }

        return false; // Нет соседних клеток с кораблем
    }
}
