import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            boolean flag=true;
            for(int j=i+1;j<size;j++)
            {
                if(array[i]<=array[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(array[i]+" ");
            }
        }

    }

}
