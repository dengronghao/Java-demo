package list;

import java.util.Iterator;
import java.util.LinkedList;

public class stack {
    public static void main(String[] args) {

        //linkedList��˫������

        //ջ
        LinkedList<String> stack = new LinkedList();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        stack.pop();

        //����
        LinkedList<String> list = new LinkedList<>();
        list.addLast("��β");
        list.removeFirst();

        //������ɾ��Ԫ��
        Iterator<String> I = list.iterator();
        while(I.hasNext())
        {
            String temp=I.next();
            //������list.remove()ɾ����������for��foreachɾ��
            if("��β".equals(temp))
            {
                I.remove();
            }
        }
    }
}
