package AutoCars;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 2015, "", "",1.7d);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "чёрный", 3.0d);
        Car bmw = new Car("BMW", "Z8", 2020, "Германии", "чёрный", 3.0d);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4d);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6d);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}


