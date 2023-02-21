package ·ºÐÍ;

public class toString {
    public static void main(String[] args) {
        String[] names={"david","ronaldo","messi"};
        int[]  nums={1,2,3,4,5};

    }

    public static <T> void print(T[] arr){
        if(arr!=null){
            StringBuilder sb=new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i== arr.length?"":",");
            }
            sb.append("]");
            System.out.println(sb);
        }

        else{
            System.out.println("arr==null");
        }
    }
}
