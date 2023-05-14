package HW4;

public class CatEat {
    public static void main(String[] args){
        Cat[] cats = {
                new Cat(5),
                new Cat(10),
                new Cat(7)
        };

        Plate plate = new Plate(20);
        System.out.println("Plate: " + plate);

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(plate);
                System.out.println("Cat ate: " + cat);
            }
        }

        System.out.println("Plate after feeding: " + plate);
    }
}