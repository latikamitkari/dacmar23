import java.util.Scanner;
class Que33{

    public static void main(String[] args){

        int i=Integer.parseInt(args[0]);
        float f=Float.parseFloat(args[1]);
        double d=Double.parseDouble(args[2]);

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter: '\n' A for sum '\n' B for Differnce '\n' C for Multiplication '\n' D for Division '");
        String ch=sc.next();

        switch(ch)
        {
            case "A": System.out.println("Sum is "+(i+f+d); break;

            case "B": System.out.println("Difference is "+(i-f-d)); break;

            case "C": System.out.println("Multiplication is "+(i*f*d)); break;

            case "D": System.out.println("Division is "+((i/f)/d); break;

            default: System.out.println("Invalid Input");



        }




    }

}