package set;
// 获取对象的哈希值；
public class hash {
    public static void main(String[] args) {

        //同一对象的哈希值是一致的；
        String name="david beckham";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1="benzema";
        System.out.println(name1.hashCode());

    }
}
