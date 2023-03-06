package file;

import exceptions.main;

import java.io.File;

//非递归
//买啤酒
//两元一瓶，四个盖子一瓶，两个瓶子一瓶
public class search2 {
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;

    public static void main(String[] args) {
        buy(10);
        System.out.println("totalNumber"+totalNumber);
    }

    public static void buy(int money){
        int buyNumber = money/2;
        totalNumber = totalNumber + buyNumber;

        int bottleNumber = lastBottleNumber + buyNumber;
        int coverNumber = lastCoverNumber + buyNumber;

        int allMoney = 0;
        if(coverNumber>=4){
            allMoney = allMoney +coverNumber/4*2;
        }
        lastCoverNumber = lastCoverNumber %4;

        if(bottleNumber>=2){
            allMoney = allMoney +bottleNumber/2*2;
        }
        lastBottleNumber = lastBottleNumber%2;

        if(allMoney>=2){
            buy(allMoney);
        }

    }
}
