import java.util.*;
public class PrintShape {

	public static void printX(int n, String ch)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==i || j==n-1-i)
					System.out.print(ch);
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void printStar(int n, String ch)
	{
		int i=0;
		while(i<n)
		{
			if(i!=(n/2))
			{
				int j=0;
				while(j<n)
				{
					if(j==i || j==n-1-i)
						System.out.print(ch);
					else
						System.out.print(" ");
					j++;
				}
			}
			else
			{	
				int k=0;
				while(k<n) 
				{
					System.out.print(ch);
					k++;
				}
			}
			System.out.print("\n");
			i++;
		}
	}
	
	public static void printV(int n, String ch)
	{
		int i=1, j;
		do {
			j=1;
			do {
				if(j==i || j==2*n-i)
					System.out.print(ch);
				else
					System.out.print(" ");
				j++;	
			}while(j<=((2*n)-1));
			
			System.out.print("\n");
			i++;
		}while(i<=n);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String shape, ch;
		int n, f=1;
		
		while(f==1)
		{
			System.out.print("1.印出形狀 2.離開: ");
			f=sc.nextInt();
			if(f==2)
			{
				System.out.print("Bye!");
				break;
			}
			System.out.print("選擇形狀(X、*、V): ");
			shape=sc.next();
			while(shape.compareTo("X")!=0 && shape.compareTo("*")!=0 && shape.compareTo("V")!=0)
			{
				System.out.print("輸入錯誤!選擇形狀(X、*、V): ");
				shape=sc.next();
			}
			
			System.out.print("輸入n層(n為奇數): ");
			n=sc.nextInt();
			while(n<=0 || n%2==0)
			{
				System.out.print("輸入錯誤!輸入n層(n為奇數): ");
				n=sc.nextInt();
			}
			
			System.out.print("輸入字元: ");
			ch=sc.next();
			
			if(shape.compareTo("X")==0)
			{
				printX(n, ch);
			}
			
			if(shape.compareTo("*")==0)
			{
				printStar(n, ch);
			}
			
			if(shape.compareTo("V")==0)
			{
				printV(n, ch);
			}
		}
		sc.close();
	}
}
