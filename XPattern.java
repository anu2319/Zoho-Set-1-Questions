import java.util.Scanner;

public class XPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int j = 0;
        for(int i=0; i<len; i++)
        {
            j = len-i-1;
            for(int k=0; k<len; k++)
            {
                if(k==i)
                {
                    System.out.print(s.charAt(i));
                }
                else if(k==j)
                {
                    System.out.print(s.charAt(j));
                }

                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
