import java.util.*;
public class perfectnumber {
    static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i = 1;i<=n/2;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        if(isPerfect(n))
        System.out.println(n+" is a perfect number ");
        else
        System.out.println(n+" is not a perfect number ");
    }
}
