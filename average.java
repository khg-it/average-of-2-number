import java.util.*;
public class average {
    public static void av(int a,int b){
        int aver=a+b/2;
        System.out.println(aver);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int q=s.nextInt();

        av(p,q);

    }
}
