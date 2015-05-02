/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package berkeley;
import java.util.*;
/**
 *
 * @author tanveer
 */
public class Berkeley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int hours[]=new int[10];
       int minutes[]=new int[10];
       int seconds[]=new int[10];
       int calc[]=new int[10];
       int diff[]=new int[10];
       int avg[]=new int[10];
        System.out.println("Enter the time at the server in hours and minutes ");
        hours[0]=sc.nextInt();
        minutes[0]=sc.nextInt();
        System.out.println("enter the number of clients you want");
        int clients=sc.nextInt();
        int n=clients+1;
        System.out.println("Enter the time for clients in hours and minutes");
        for(int i=1;i<=clients;i++)
        {
            hours[i]=sc.nextInt();
            minutes[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            calc[i]=hours[i]*3600+minutes[i]*60;
            seconds[i]=calc[i];
        }
        for(int i=1;i<=clients;i++)
        {
            diff[i]=seconds[0]-calc[i];
            avg[i]=diff[i]/60;
        }
        
        
        System.out.println("The difference in minutes for the clients are as follows:");
        int temp=0;
        for(int i=1;i<=clients;i++)
        {
            System.out.println(avg[i]);
            temp=avg[i]+temp;
        }
        temp=Math.abs(temp);
        temp/=n;
        System.out.println(temp);
        
        if(temp>=0 && temp<=9)
            temp=temp%10;
        minutes[0]+=temp;
        for(int i=1;i<=clients;i++)
        {
            hours[i]=hours[0];
            minutes[i]=minutes[0];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("hours:"+hours[i]+"\t minutes:"+minutes[i]);
        }
    }
}
