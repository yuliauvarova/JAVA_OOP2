import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();

        if (plate.getFood() >= cat.getAppetite() & !cat.isSatiety()) {
            cat.eat();
            plate.setFood(plate.getFood() - cat.getAppetite());
            cat.setSatiety(true);
        }
        plate.info();
        cat.catInfo();

        System.out.println("---------------");

        Cat cat1 = new Cat("Borsik", 5);
        Cat cat2 = new Cat("Murzik", 6);
        Cat cat3 = new Cat("Kisa", 7);
        Cat cat4 = new Cat("Kot", 5);
        Cat cat5 = new Cat("Myauli", 4);

        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        catList.add(cat);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Сколько еды будет в тарелке?  ");
        int plateSize = scanner.nextInt();

        Plate plateNew = new Plate(plateSize);
        for (Cat eachCat : catList) {
            if (plateNew.getFood() >= eachCat.getAppetite()) {
                eachCat.eat();
                plateNew.setFood(plateNew.getFood() - eachCat.getAppetite());
                eachCat.setSatiety(true);
            }
            eachCat.catInfo();
        }

        System.out.println("---------------");

        plateNew.info();
        System.out.printf("Сколько еды добавим в тарелку?  ");
        int newFood = scanner.nextInt();
        scanner.close();
        plateNew.addFood(newFood);
        plateNew.info();
    }
}
