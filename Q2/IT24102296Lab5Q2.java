import java.util.Scanner;
public class IT24102296Lab5Q2
{
   public static void main(String[] args)
   {
   Scanner input=new Scanner(System.in);
   int noOfmembers;
   System.out.println("Enter the number of new members introduced:");
   noOfmembers=input.nextInt();
   
   if(noOfmembers>=0)
   {
   switch(noOfmembers)
	{
	case 0:System.out.println("No prize");
	        break;
	case 1:System.out.println("Prize is a:Pen");
  	        break;
	case 2:System.out.println("Prize is a:Umbrella");
  	        break;
	case 3:System.out.println("Prize is a:Bag");
		break;
	case 4:System.out.println("Prize is a:Travelling Chair");
  	        break;
	default:System.out.println("Prize is a:Headphone");
        }
   }
   else
   {
   System.out.println("Input must be a number 0 or geater");
   }
   }
}
	

      
	

	
