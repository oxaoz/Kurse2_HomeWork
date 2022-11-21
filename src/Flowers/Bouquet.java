package Flowers;

public class Bouquet {
    public static void main(String[] args) {
        Flowers roseFlower = new Flowers("Роза обыкновенная", "", "Голандия", 35.59);
        Flowers chrysanthemum = new Flowers("Хризантема", "", "", 15, 5);
        Flowers peony = new Flowers("Пион", "", "Англия", 69.9, 1);
        Flowers gypsophila = new Flowers("Гипсофила", "", "Турция", 19.5, 10);
        System.out.println(roseFlower);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);
        printInfo(roseFlower);
        printInfo(chrysanthemum);
        printInfo(peony);
        printInfo(gypsophila);

        System.out.println();
        printPriceBouquet(roseFlower, roseFlower, roseFlower,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);
    }
    private static void printInfo(Flowers Flowers) {
        System.out.println("Цветок: " + Flowers.flowerName + ", цвет: " + Flowers.getFlowerColor() +
                ", страна происхождения: " + Flowers.getCountry() + ", стоимость за штуку: " + Flowers.getCost() +
                " рублей, срок стояния цветка: " + Flowers.lifeSpan + " дней.");

    }

    private static void printPriceBouquet(Flowers... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flowers flower : flowers) {
            if (flower.lifeSpan < minLifeSpan){
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
       totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Ссрок стояния букета: " + minLifeSpan);

    }
}

