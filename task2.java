import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many subjects do you have?: ");
        int sub=sc.nextInt();
        float marks[]=new float[sub];
        float total=0;
        for(int i=0;i<sub;i++)
        {
        	System.out.print("Enter the marks (out of 100) for subject("+(i+1)+"): ");
        	marks[i]=sc.nextFloat();
        	while(marks[i]>100 || marks[i]<0) {
        		//System.exit(0);
        		System.out.println("Invalid marks!");
        		System.out.print("Enter valid marks again: ");
        		marks[i]=sc.nextFloat();
        	}
        	total+=marks[i];
        	//System.out.println();
        }
        System.out.println("Total marks: "+total);
        float avg=total/sub;
        System.out.println("Average percentage: "+avg);
        char grade;
        switch((int)(avg/10))
        {
           case 10 :grade='O';break;
           case 9 :grade='A';break;
           case 8 :grade='B';break;
           case 7 :grade='C';break;
           case 6 :grade='D';break;
           default :grade='F';break;
        }
        System.out.println("Grade: "+grade);
	}

}
