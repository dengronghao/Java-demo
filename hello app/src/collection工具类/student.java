package collectionπ§æﬂ¿‡;

public class student implements Comparable<student> {

    private int goal;

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public student(int goal) {
        this.goal = goal;
    }

    public student() {
    }


    @Override
    public int compareTo(student o) {
        return this.getGoal()-o.goal;
    }


}
