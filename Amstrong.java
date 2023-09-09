import java.util.Scanner;

class Amstrong{
    public static void main(String[] args){
        int num,temp ,res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        num=sc.nextInt();
        sc.close();
        
        temp=num;
        
        while (num!=0){
            res+=Math.pow(num%10,3);
            num/=10;
        }
        
        if(res==temp)System.out.println("amstrong");
        else System.out.println("not amstrong");
    }
}