package abstrac_template;

public abstract class student {
    public void write(){
        System.out.println("\t\t\t<<real madrid>>");
        System.out.println("\t\t\tstriker:       cr7    bz9     gb11");
        System.out.println("\t\t\tmidfielder:    lm10   c14     tk8");
        System.out.println(show_defender());
    }
    abstract String show_defender();
}
