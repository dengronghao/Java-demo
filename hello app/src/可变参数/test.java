package �ɱ����;

public class test {
    public static void main(String[] args) {
         sum(12,1,2,2,4,5,6);//ageΪ��numʵ�������飻
        //һ������������ֻ����һ���ɱ������������׷ǰ�棻
    }

    public static int sum(int age,int...num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum=+num[i];
        }
        return sum+age;
    }

}
