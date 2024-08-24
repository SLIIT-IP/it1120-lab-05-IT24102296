import java.util.Scanner;
public class IT24102296Lab5Q3
{
  public static void main(String[] args)
  {
	final double ROOM_CHARGE_PER_DAY=48000.00;
	final double DISCOUNT_3_TO_4_DAYS=0.1;
	final double DISCOUNT_5_OR_MORE_DAYS=0.2;
	
	  int startDate, endDate, numberOfDaysReserved;
	  double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;
	  double discountRate=0;

	Scanner input=new Scanner(System.in);

	System.out.println("Enter Start Date (1-31):");
	startDate=input.nextInt();

	System.out.println("Enter End Date (1-31):");
	endDate=input.nextInt();

	if(startDate>endDate)
	{
	System.out.println("Error:Start Date must be less than End Date");
	return;
	}
            
	if(0>startDate && 31<startDate && 0>endDate && 31<endDate) 
	{
	System.out.println("Error: Days must be between 1 and 31");
	return;
	}
          
      numberOfDaysReserved= (endDate-startDate);

     System.out.println("Room Charge Per Day: Rs."+ ROOM_CHARGE_PER_DAY+"/=");
     System.out.println("Numbers of Days Reserved:"+ numberOfDaysReserved);
     if( numberOfDaysReserved<3)
     {
     totalAmountBeforeDiscount=(ROOM_CHARGE_PER_DAY*numberOfDaysReserved);
     totalAmountToBePaid=totalAmountBeforeDiscount;
     
      System.out.println("Total Amount to be Paid:"+totalAmountToBePaid);
     }
     else if(3<= numberOfDaysReserved && numberOfDaysReserved <=4)
     {
     totalAmountBeforeDiscount=(ROOM_CHARGE_PER_DAY*numberOfDaysReserved);
     discountAmount=(totalAmountBeforeDiscount*  DISCOUNT_3_TO_4_DAYS);
     totalAmountToBePaid=(totalAmountBeforeDiscount- discountAmount);

      System.out.println("Total Amount to be Paid:"+totalAmountToBePaid);
     }
     else
     {
     totalAmountBeforeDiscount=(ROOM_CHARGE_PER_DAY*numberOfDaysReserved);
     discountAmount=(totalAmountBeforeDiscount* DISCOUNT_5_OR_MORE_DAYS);
     totalAmountToBePaid=(totalAmountBeforeDiscount- discountAmount);

      System.out.println("Total Amount to be Paid:"+totalAmountToBePaid);
     }
  }
}
   



      
     

    


	



	  
		
