package API_object;
//toString;
//equal
//相当于c++的重载；
public class test {
    public static void main(String[] args) {

        student s=new student("独户","男",20);

        student s1=new student("独户","男",20);

        System.out.println(s.equals(s1));//比较地址和“=”相同 ；重写和比较内容；

        System.out.println(s);

    }
}
