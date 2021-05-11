import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		
		int i,num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		num=s.nextInt();
		for(i=1;i<=num;i++)
			fact*=i;
		System.out.println("Factorial of "+num+" is "+fact);
		
		

}
}
