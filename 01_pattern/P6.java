package pattern;

public class P6 {

    public static void nNumberTriangle(int n) {
        // Write your code here

        for(int i =0;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
    public static void main (String [] args){
        nNumberTriangle(5);
    }

}