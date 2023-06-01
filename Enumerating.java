package Pro.Lesson2_new;
public class Enumerating {
            public static void main(String[] args) {
            int[][] gameBoard = {
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 0, 1, 1, 0, 0, 0, 0, 0, 0}
            };

            int count = countBattleships(gameBoard);
            System.out.println("Количество кораблей: " + count);
        }

        public static int countBattleships(int[][] gameBoard) {
            int rows = gameBoard.length;
            int cols = gameBoard[0].length;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (gameBoard[i][j] == 1) {
                        // Проверяем, является ли текущая клетка началом корабля
                        // Клетка считается началом корабля, если у нее нет соседних клеток со значением 1 по вертикали и горизонтали
                        if ((i == 0 || gameBoard[i - 1][j] == 0) && (j == 0 || gameBoard[i][j - 1] == 0)) {
                            count++;
                        }
                    }
                }
            }

            return count;
        }
    }
