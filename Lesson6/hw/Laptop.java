package Lesson6.hw;

public class Laptop {
    public Brand brand;
    public Color color;

    public Laptop(Brand brand, Color color){
        this.brand = brand;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Laptop {brand = %s, color = %s}", brand , color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return laptop.brand.equals(this.brand) && laptop.color.equals(this.color);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}

