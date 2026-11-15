import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int i=1;
        int answer=0;
        while(i<=n){
            answer=answer+i;
            i++;
        }
        System.out.println(answer);
        
    }
}