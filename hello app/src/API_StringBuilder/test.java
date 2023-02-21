package API_StringBuilder;

public class test {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("皇家");
        s.append("马德里");
        s.append("世界").append("第一俱乐部");

        StringBuilder s1=s.reverse();

        System.out.println(s);
        System.out.println(s1);

        //操作完后要转化成string；
        s.toString();
        s1.toString();
    }
}
