import java.util.Scanner;

public class WelcomeToZohoCorporation {
   /* public static void display(int sI,int eI,int sJ,int eJ){
        System.out.print("Start index.:");
        System.out.print(sI+",");
        System.out.println(sJ);
        System.out.print("End index  .:");
        System.out.print(eI+",");
        System.out.println(eJ);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s1 = sc.nextLine();

        int n = (int)Math.sqrt(s.length()) + 1;
        int m = s1.length();
        char[][] arr = new char[n][n];
        int a = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a<s.length()) {
                    arr[i][j]= s.charAt(a);
                    a++;
                }
            }
        }

        int count,sI,eI,sJ,eJ,found=0;


        for(int i=0;i<n;i++){
            for(int j=0;j<=n-m;j++){
                count = 1;
                if(s1.charAt(0)==arr[i][j]) {
                    for(int k=1;k<m;k++) {
                        if(s1.charAt(k)==arr[i][j+k]) {
                            count++;
                        }
                        else {
                            break;
                        }
                    }
                    if(count == m) {
                        sI=i;
                        eI=i;
                        sJ=j;
                        eJ=j+m;
                        found = 1;
                        System.out.print("Start index.:");
                        System.out.print(sI+",");
                        System.out.println(sJ);
                        System.out.print("End index  .:");
                        System.out.print(eI+",");
                        System.out.println(eJ);
                    }
                }
            }
        }

        if(found==0) {

            for(int j=0;j<n;j++){
                for(int i=0;i<=n-m;i++){
                    count = 1;
                    if(s1.charAt(0)==arr[i][j]) {
                        for(int k=1;k<m;k++) {
                            if(s1.charAt(k)==arr[i+k][j]) {
                                count++;
                            }
                            else {
                                break;
                            }
                        }
                        if(count == m) {
                            sI=i;
                            eI=i+m-1;
                            sJ=j;
                            eJ=j;
                            //found = 1;
                            System.out.print("Start index.:");
                            System.out.print(sI+",");
                            System.out.println(sJ);
                            System.out.print("End index  .:");
                            System.out.print(eI+",");
                            System.out.println(eJ);
                        }
                    }
                }
            }
        }
    }
}