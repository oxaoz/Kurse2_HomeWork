package AutoCars;

public class Car {
        private String brand;
        private String model;
        double engineVolume;
        String color;
        private int year;
        private String country;
        String zero = "«Информация не указана»";








        public Car(String brand, String model, int year, String country, String color, double engineVolume) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.country = country;
            this.color = color;
            this.engineVolume = engineVolume;

            if(brand == null || brand.isEmpty()){
                this.brand = zero;
            }else this.brand = brand;

            if (model == null || model.isEmpty()) {
                this.model = zero;
            }else this.model = model;

            if (country == null || country.isEmpty()) {
                this.country = zero;
            }else this.country = country;

            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            }else this.engineVolume = engineVolume;

            if (color == null || color.isEmpty()) {
                this.color = "белый";
            }else this.color = color;

            if (year <= 0) {
                this.year = 2000;
            }else this.year = year;
        }
        @Override
        public String toString() {
            return brand + " " + model + ", " +
                    year + " год выпуска, сборка в " + country +
                    ", " + color + " цвета кузова, объем двигателя - " + engineVolume + " л.";
        }
}
/*«Коробка передач»,
«Тип кузова»,
«Регистрационный номер»,
«Количество мест»,
признак «Летняя» или «Зимняя резина».
 */

