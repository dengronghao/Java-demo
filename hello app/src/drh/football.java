package drh;

public class football {
    private int number;
    private String club;
    private String position;

    public football(){};

    public football(int number, String club, String position) {
        this.number = number;
        this.club = club;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
