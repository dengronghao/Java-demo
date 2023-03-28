package 对象序列化;

import java.io.*;

public class test {
    public static void main(String[] args) throws Exception {
     //ObjectInputStream,ObjectOutputStream
        student s = new student("环境",19);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(""));
        //student需要继承
        os.writeObject(s);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(""));
        student s1 = (student) is.readObject();
        is.close();
    }


}
