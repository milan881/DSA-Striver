package basicMaths;

public class IsAmstrong {

	public static void main(String[] args) {

		int n = 15;
        int org = n;
        int count = 0;
        int temp = n;

        while(temp > 0) {
            temp = temp / 10;
            count++;
        }
        
        int sum = 0;
        temp = n;
        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }
        if(sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
