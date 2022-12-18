import java.io.*;
class Primeforloop
{
    public static void main(String args[])throws IOException
    {
        int num,i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the no:");
        num=Integer.parseInt(br.readLine());
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+":no. not prime");
                break;
            }
        }   
        if(num/2<i)    
                System.out.println(num+":no. is prime"); 
    }
}
