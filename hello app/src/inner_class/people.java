package inner_class;

public class people {

    public static int number=100;
    private String name1="人";

    //静态内部类
        /*public static class heart {
        String name = "心脏";

        public void show() {
            System.out.println(name);
            System.out.println(number);//可以使用外部静态成员
            //System.out.println(people.name);不能访问外部的私有成员
        }*/

        //成员内部类
        public class hand {
            String name2 = "hand";

            public void show() {
                System.out.println(name1);
                System.out.println(people.number);
                System.out.println(name2);//成员内部类可以访问外部类的私有成员
                System.out.println(people.this.name1);//两种方法输出外部类的私有成员
            }
        }
    }



