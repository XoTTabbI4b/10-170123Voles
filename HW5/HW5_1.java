package HW5;
import java.util.*;
/**
 * Java. Homework #5
 * @author user Yauheni Bakhar
 * @version 18 May 2023
 * !!!ВЫПОЛНЕНА НА ПРОДЛЕНКЕ!!!
 */
public class HW5_1 {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consecrate adipiscing elit." +
                " Sed lobortis, velit sed vehicula maximus, enim erat euismod dolor," +
                " nec eleifend diam justo eu lacus. Interdum et malesuada fames ac ante " +
                "ipsum primis in faucets. Sed eu viverra tellus. Proin consequat sapien" +
                " non convallis hendrerit. Nunc nisi tellus, tristique quis lacus vel," +
                "fermentum convallis nisi. Donec semper, nibh vel molestie consectetur," +
                " neque tortor interdum nisi, sit amet facilisis diam lacus ut lorem. " +
                "Morbi aliquam odio sem, dignissim convallis nisl " +
                "imperdiet vitae. Phasellus ut mauris dictum, pharetra nisi non, suscipit " +
                "arcu. Pellentesque id sapien vulputate, porta odio in, scelerisque mi. In " +
                "tellus dolor, maximus id ultricies nec, fringilla in tellus. In et nunc ut " +
                "leo semper mattis. Sed nec tortor turpis. Cras dignissim porta venenatis. " +
                "Nullam sit amet hendrerit tellus. Morbi mattis ligula at nisi cursus vulputate." +
                " Proin aliquet placerat neque, non interdum velit finibus sed. Morbi blandit, " +
                "ipsum eu placerat vestibulum, tortor arcu sodales est, at pellentesque urna odio" +
                " quis augue. Mauris eu mauris vitae est viverra consectetur non faucibus est. " +
                "Sed quis interdum lacus, at tempus mauris. Nam molestie orci sed lacus lobortis," +
                " sed viverra lorem iaculis.";

        // Приведение текста к нижнему регистру и удаление пробелов и знаков препинания
        text = text.toLowerCase().replaceAll("[^а-яёa-z]+", " ");

        // Разделение текста на отдельные слова
        String[] words = text.split(" ");

        // Создание списка уникальных слов
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        // Подсчет количества появления каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

//         Вывод списка уникальных слов
        System.out.println("Список уникальных слов:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Вывод количества появлений каждого слова
        System.out.println("Количество появлений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}
