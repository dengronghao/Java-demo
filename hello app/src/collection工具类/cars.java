package collectionπ§æﬂ¿‡;

public class cars {
    String size;
    String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public cars(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public cars() {
    }

    @Override
    public String toString() {
        return "cars{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
