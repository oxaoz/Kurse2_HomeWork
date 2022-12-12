package Transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "", "",1.7d,
                "МКПП","седан",5,"о315аи",true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "чёрный", 3.0d,
                "автомат", "седан", 5,"k987ck",false);
        Car bmw = new Car("BMW", "Z8", 2020, "Германии", "чёрный", 3.0d,
                "автомат", " ",5,"e213yo",true);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4d,
                "робот","хечбек",5,"c911py",true);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6d,
                "МКПП", "", 5,"y828yx",false);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}


