package list;

import java.util.Iterator;
import java.util.LinkedList;

public class stack {
    public static void main(String[] args) {

        //linkedList是双向链表

        //栈
        LinkedList<String> stack = new LinkedList();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        stack.pop();

        //队列
        LinkedList<String> list = new LinkedList<>();
        list.addLast("队尾");
        list.removeFirst();

        //迭代器删除元素
        Iterator<String> I = list.iterator();
        while(I.hasNext())
        {
            String temp=I.next();
            //不能用list.remove()删除；不能用for和foreach删除
            if("队尾".equals(temp))
            {
                I.remove();
            }
        }
    }
}
