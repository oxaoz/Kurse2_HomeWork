package Flowers;

public class Flowers {
    String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flowers(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;

        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "Цветок";
        } else this.flowerName = flowerName;

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else this.flowerColor = flowerColor;

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else this.country = country;

        if (cost <= 0.0) {
            this.cost = 1.0;
        } else this.cost = cost;

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else this.lifeSpan = lifeSpan;
    }
    public Flowers(String flowerName, String flowerColor, String country, double cost) {
        this(flowerName, flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0.0) {
            this.cost = 1.0;
        } else this.cost = cost;
    }

    @Override
    public String toString() {
        return flowerName + ", цвет " + flowerColor + ", из страны: " + country + ", стоимость штуки - " + cost +
                " рублей, срок стояния - " + lifeSpan + " дня/дней";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
