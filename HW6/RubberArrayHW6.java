package HW6;

import java.util.Arrays;
/**
 * Java. Homework #5
 * @author user Yauheni Bakhar
 * @version 18 May 2023
 */
public class RubberArrayHW6 {

        private int[] array;

        public RubberArrayHW6() {
            array = new int[0];
        }

        public void add(int value) {
            int[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[array.length] = value;
            array = newArray;
        }

        // Добавляем элемент value на указанную позицию index в коллекцию
        public void add(int index, int value) {
            if (index < 0 || index > array.length) {
                throw new IndexOutOfBoundsException();
            }
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            System.arraycopy(array, index, newArray, index + 1, array.length - index);
            array = newArray;
        }

        // Добавляем все переданные значения values в конец коллекции
        public void addAll(int... values) {
            int[] newArray = Arrays.copyOf(array, array.length + values.length);
            System.arraycopy(values, 0, newArray, array.length, values.length);
            array = newArray;
        }

        public int get(int index) {
            return array[index];
        }

        public void remove(int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException();
            }
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
        }

        // Проверяем, содержит ли коллекция элемент value
        public boolean contains(int value) {
            for (int element : array) {
                if (element == value) {
                    return true;
                }
            }
            return false;
        }

        // Возвращаем индекс первого вхождения элемента value в коллекцию,
        // или -1, если элемент не найден
        public int indexOf(int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -1;
        }

        // Проверяет, является ли коллекция пустой (не содержит элементов)
        public boolean isEmpty() {
            return array.length == 0;
        }

        // Очищает коллекцию, удаляя все элементы
        public void clear() {
            array = new int[0];
        }

        // Возвращает текущий размер коллекции (количество элементов)
        public int size() {
            return array.length;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i < array.length - 1) {
                    sb.append(", ");
                }
            }
            return sb.append("]").toString();
        }
    }

