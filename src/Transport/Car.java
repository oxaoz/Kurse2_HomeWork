package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    String zero = "«Информация не указана»";

    private String transmission;
    private final String carBodyType;
    private String carNumber;
    private final int seatsNumber;
    private boolean tireSummer = true;


    public Car(String brand, String model, int year, String country, String color, double engineVolume,
               String transmission, String carBodyType, int seatsNumber, String carNumber, boolean tireSummer) {

        if (brand == null || brand.isEmpty()) {
            this.brand = zero;
        } else this.brand = brand;

        if (model == null || model.isEmpty()) {
            this.model = zero;
        } else this.model = model;

        if (country == null || country.isEmpty()) {
            this.country = zero;
        } else this.country = country;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else this.color = color;

        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;


        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "MECHANIC";
        } else {
            this.transmission = transmission;
        }

        if (carBodyType == null || carBodyType.isEmpty() || carBodyType.isBlank()) {
            this.carBodyType = "SEDAN";
        } else {
            this.carBodyType = carBodyType;
        }

        if (seatsNumber <= 0 || seatsNumber > 7) {
            this.seatsNumber = 5;
        } else {
            this.seatsNumber = seatsNumber;

            this.tireSummer = tireSummer;


            if (carNumber == null || carNumber.isEmpty() || carNumber.isBlank()) {
                this.carNumber = "х000хх000";
            } else this.carNumber = carNumber;
        }
    }
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public double getEngineVolume() {return engineVolume;}
    public String getColor() {return color;}
    public int getYear() {return year;}
    public String getCountry() {return country;}

    public String getZero() {return zero;}

    public String getTransmission() {return transmission;}

    public String getCarBodyType() {return carBodyType;}

    public String getCarNumber() {return carNumber;}

    public int getSeatsNumber() {return seatsNumber;}

    public boolean getTireSummer() {return tireSummer;}

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else this.color = color;
    }

    public String setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "MECHANIC";
        } else {
            this.transmission = transmission;
        }
        return transmission;
    }

    public void setCarNumber(String carNumber){
        if (carNumber == null || carNumber.isEmpty() || carNumber.isBlank()) {
            this.carNumber = "х000хх000";
        } else this.carNumber = carNumber;
        }

        public void setTireSummer(boolean tireSummer){
            this.tireSummer = tireSummer;
        }
        public void changeTyres(){
        tireSummer =! tireSummer;
        }

    public boolean isCorrectRegCarNumber() {
        //"х000хх000"
        if (carNumber.length() != 9) {
            return false;
        }
        char[] chars = carNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[0])){
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }

        @Override
        public String toString() {
            return getBrand() + " " + getModel() + ", " +
                    getYear() + " год выпуска, сборка в " + getCountry() +
                    ", " + getColor() + " цвета кузова, объем двигателя - " + getEngineVolume() +
                    " л, коробка передач " + getTransmission() + ", тип кузова " + getCarBodyType() +
                    ", количество мест " + getSeatsNumber() + ", регистрационный номер "+ getCarNumber() +
                    ", " + (getTireSummer()?"летняя":"зимняя") + " резина.";
        }
        @Override
        public boolean equals(Object obj){
            return super.equals(obj);
        }
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }


/*Соответственно, для них них нужно настроить модификатор доступа и создать геттеры.

Остальные поля изменяться могут, доступ к ним должен осуществляться через геттеры и сеттеры.
Не забудьте про модификаторы доступа каждого параметра класса, а также конструкторов.

Пропишите проверку данных для новых полей класса и значения по умолчанию, если параметры пустые,
равны null или имеют некорректное значение.
 */

