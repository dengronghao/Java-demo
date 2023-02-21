package Map;

public class apple {
    int kilo;
    String address;

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public apple(int kilo, String address) {
        this.kilo = kilo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "apple{" +
                "kilo=" + kilo +
                ", address='" + address + '\'' +
                '}';
    }
}
