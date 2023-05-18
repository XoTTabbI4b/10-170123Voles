package HW5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Java. Homework #5
 * @author user Yauheni Bakhar
 * @version 18 May 2023
 * !!!ВЫПОЛНЕНА НА ПРОДЛЕНКЕ!!!
 */
public class HW5_2 {
    public static void main(String[] args) {
        // Создание экземпляра класса PhoneDirectory
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        // Добавление записей в телефонный справочник
        phoneDirectory.add("Иванов", "+7 123 456-7890");
        phoneDirectory.add("Петров", "+7 987 654-3210");
        phoneDirectory.add("Сидоров", "+7 555 123-4567");
        phoneDirectory.add("Иванов", "+7 111 222-3333");
        phoneDirectory.add("Петров", "+7 999 888-7777");
        phoneDirectory.add("Смит", "+7 987 765-3210");
        phoneDirectory.add("Федоров", "+7 555 123-3219");
        phoneDirectory.add("Иванов", "+7 111 987-3214");

        // Поиск номеров по фамилии
        List<String> ivanovPhones = phoneDirectory.get("Иванов");
        System.out.println("Номера телефонов Ивановых: " + ivanovPhones);

        List<String> petrovPhones = phoneDirectory.get("Петров");
        System.out.println("Номера телефонов Петровых: " + petrovPhones);

        List<String> smithPhones = phoneDirectory.get("Смит");
        System.out.println("Номера телефонов Смитов: " + smithPhones);

        List<String> putiloPhones = phoneDirectory.get("Путило");
        System.out.println("Номера телефонов Путило: " + putiloPhones);
    }
    /**
     * Класс PhoneDirectory представляет собой телефонный справочник,
     * который хранит список телефонных номеров по фамилиям.
     */
    static class PhoneDirectory {
        private Map<String, List<String>> directory;
        /**
         * Конструктор класса PhoneDirectory инициализирует пустой телефонный справочник.
         */
        public PhoneDirectory() {
            directory = new HashMap<>();
        }
        /**
         * Метод add добавляет телефонный номер для заданной фамилии.
         * surname     фамилия
         * phoneNumber телефонный номер
         */
        public void add(String surname, String phoneNumber) {
            List<String> phoneNumbers = directory.computeIfAbsent(surname, k -> new ArrayList<>());
            phoneNumbers.add(phoneNumber);
        }
        /**
         * Метод get возвращает список телефонных номеров для заданной фамилии.
         * Если фамилия отсутствует в справочнике, возвращается пустой список.
         * surname фамилия
         * список телефонных номеров
         */
        public List<String> get(String surname) {
            return directory.getOrDefault(surname, new ArrayList<>());
        }
    }
}