package pattern;

public class P2 {

    public static void nForest(int n) {
        // Write your code here

        for(int i =0;i<n;i++){

                for(int j =0;j<i+1;j++){
                    System.out.print("* ");
                }
                System.out.println("");

        }
    }
        public static void main(String args[]){
            nForest(8);
        }
}