
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortBasedOnWeight {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] weights = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            double x = Math.sqrt(a[i]);
            if(x==(int)x)
            {
                weights[i]+= 5;
            }
            if(a[i]%4==0 && a[i]%6==0)
            {
                weights[i]+= 4;
            }
            if(a[i]%2==0)
            {
                weights[i]+= 3;
            }

        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(weights[i] < weights[j])
                {
                    int temp = weights[i];
                    weights[i] = weights[j];
                    weights[j] = temp;
                    int temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
                if(weights[i] == weights[j])
                {
                    if(a[i] < a[j])
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
            System.out.print(weights[i]);
            System.out.println();
        }
    }
}
