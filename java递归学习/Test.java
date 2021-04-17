public class Test {
public static int fac(int n)
{
    if(n==1)
    {
        return 1;
    }
    return n*fac(n-1);
}

public static void main (String[] args) {
        int n = 3;
        int ret = fac(n);
        System.out.println(ret);
    }
}