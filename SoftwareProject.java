// this is many project 
import javax.swing.*;
class SoftwareProject
{
	public static void main(String[] args) 
	{
		
			char ch='Y';
			outer:
			while(ch=='y' || ch=='Y')
		{	
	
	JOptionPane.showMessageDialog(null,"\n========================\nWELCOME TO MINI PROJECT\n========================");

	/*JOptionPane.showMessageDialog(null,"1.Calculator")
	JOptionPan .showMessageDialog(null,"2. Marksheet");
	JOptionPane.showMessageDialog(null,"3. TrollyLoad System");
	JOptionPane.showMessageDialog(null,"4. Hesco Billing System");
	JOptionPane.showMessageDialog(null,"5. Even and odd Number");
	JOptionPane.showMessageDialog(null,"6. Converters");
	JOptionPane.showMessageDialog(null,"7. Positive / Negative Numbers");
	JOptionPane.showMessageDialog(null,"8. About us");
	JOptionPane.showMessageDialog(null,"9. Exit");*/

	 String num=JOptionPane.showInputDialog(null,"                     MINI PROJECT\n______________________________\n 1.Calculator" + "\n______________________________\n2. Marksheet" + "\n______________________________\n3. TrollyLoad System"  + "\n______________________________\n4. Hesco Billing System" + "\n______________________________\n5. Even and odd Number" + "\n______________________________\n6. Converters" + "\n______________________________\n7. About us" + "\n______________________________\n8. Exit"+"\n______________________________\n * Enter any number from above menu");
	int number=Integer.parseInt(num);

		if(number==1)
		{
				char ch1='Y';
				outer1:
				while(ch1=='y' || ch1=='Y')
			{
				String a=JOptionPane.showInputDialog(null,"                   CALCULATOR\n_________________________\n1. Addition" + "\n_________________________\n2. Subtraction" + "\n_________________________\n3. Multiplication" + "\n_________________________\n4. Division" + "\n_________________________\n5. Module" + "\n_________________________\n6. Back" +"\n_________________________\n * select any number from Above");

				Integer number1=Integer.parseInt(a);
        
		if(number1==1)
		{
			char ch2='y';
			while(ch2=='y'  || ch2=='Y')
				{
				

					JOptionPane.showMessageDialog(null,"\n====================\nWELCOME TO ADDITION\n====================");

					String a1=JOptionPane.showInputDialog(null,"Enter 1st Number");
					double num1=Double.parseDouble(a1);

					String b1=JOptionPane.showInputDialog(null,"Enter 2nd Number");
					double num2=Double.parseDouble(b1);

					double add=num1+num2; 
					JOptionPane.showMessageDialog(null,"Addition is:"+add);

					JOptionPane.showMessageDialog(null,"\n========================\nThank You For Using Addition\n========================");
				
					String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in calculator or want to Exit exit[Y/N]");
				    ch2=u.charAt(0);	
				}
					continue outer1;
			}

				if(number1==2)
					{
						char ch3='y';
						while(ch3=='Y' || ch3=='y')
						{
							JOptionPane.showMessageDialog(null,"\n======================\nWELCOME TO SUBTRACTION\n======================");

							String a2=JOptionPane.showInputDialog(null,"Enter 1st Number");
							double num3=Double.parseDouble(a2);

							String b2=JOptionPane.showInputDialog(null,"Enter Second Number");
							double num4=Double.parseDouble(b2);

							double subtract=num3-num4;
							JOptionPane.showMessageDialog(null,"Subtraction is:"+subtract);
				
							JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Subtraction\n===========================");
							
							String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				    		ch3=u.charAt(0);	
						}
							continue outer1;
					}	

				if(number1==3)
				{
					char ch4='Y';
					while(ch4=='y' || ch4=='Y')
					{
						JOptionPane.showMessageDialog(null,"\n========================\nWELCOME TO MULTIPLICATION\n========================");

						String a3=JOptionPane.showInputDialog(null,"Enter 1st Number");
						double num5=Double.parseDouble(a3);

						String a4=JOptionPane.showInputDialog(null,"Enter 2nd Number");
						double num6=Double.parseDouble(a4);

						double multiplication=num5*num6;
						JOptionPane.showMessageDialog(null,"Multiplication is:"+multiplication);

						JOptionPane.showMessageDialog(null,"\n============================\nThank You For Using Multiplication\n============================");
						String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				    	ch4=u.charAt(0);		
					}
							continue outer1;
				}	

				if(number1==4)
				{
					char ch5='Y';
					while(ch5=='Y' || ch5=='y')
					{
						JOptionPane.showMessageDialog(null,"\n===================\nWELCOME TO DIVISION\n===================");

						String a5=JOptionPane.showInputDialog(null,"Enter 1st Number");
						double num7=Double.parseDouble(a5);

						String a6=JOptionPane.showInputDialog(null,"Enter 2nd Number");
						double num8=Double.parseDouble(a6);

						double division=num7/num8;
						JOptionPane.showMessageDialog(null,"Division is:"+division);

		 				JOptionPane.showMessageDialog(null,"\n========================\nThank You For Using Division\n========================");
							
						String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				    	ch5=u.charAt(0);		
			
					}
							continue outer1;
				}

					if(number1==5)
					{
						char ch6='Y';
						while(ch6=='Y' || ch6=='y')
						{
							JOptionPane.showMessageDialog(null,"\n====================\nWELCOME TO MODULES\n====================");

							String a7=JOptionPane.showInputDialog(null,"Enter 1st Number");
							int num9=Integer.parseInt(a7);

							String a8=JOptionPane.showInputDialog(null,"Enter 2nd Number");
							double num10=Double.parseDouble(a8);

							double module=num9%num10;
							JOptionPane.showMessageDialog(null,"Module is:"+module);

							JOptionPane.showMessageDialog(null,"\n========================\nThank You For Using Modules\n========================");

							String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				    		ch6=u.charAt(0);		
						}
							continue outer1;
					}
						if(number1==6)
							continue outer;
				}	
			}

			if(number==2)
			{
				char ch3='Y';
				while(ch3=='y' || ch3=='Y')
				{
					JOptionPane.showMessageDialog(null,"\n=========================\nWELCOME TO THE MARKSHEET\n=========================");

					String name=JOptionPane.showInputDialog(null,"Enter Your Name");
					JOptionPane.showMessageDialog(null,"My Name is:"+name);

					String uni=JOptionPane.showInputDialog(null,"Enter University Name");
					JOptionPane.showMessageDialog(null,"University Name is:"+uni);

					String department=JOptionPane.showInputDialog(null,"Enter Your DepartMent Name");
					JOptionPane.showMessageDialog(null,"My Department Name is:"+department);

					String year=JOptionPane.showInputDialog(null,"Enter Year");
					JOptionPane.showMessageDialog(null,"year is:"+year);

					String roll=JOptionPane.showInputDialog(null,"Enter Roll no");
					JOptionPane.showMessageDialog(null,"My Roll No is:"+roll);

					String java=JOptionPane.showInputDialog(null,"Enter Java Marks");
					int java1=Integer.parseInt(java);
					JOptionPane.showMessageDialog(null,"Java Marks are:"+java1);

					String math=JOptionPane.showInputDialog(null,"Enter Math Marks");
					int math1=Integer.parseInt(math);
					JOptionPane.showMessageDialog(null,"Math Marks are:"+math1);

					String discrete=JOptionPane.showInputDialog(null,"Enter Descrete Marks");
					int discrete1=Integer.parseInt(discrete);
					JOptionPane.showMessageDialog(null,"Descrete Marks are:"+discrete1);

					String english=JOptionPane.showInputDialog(null,"Enter English Marks");
					int english1=Integer.parseInt(english);

					String dld=JOptionPane.showInputDialog(null,"Enter Dld Marks");
					int dld1=Integer.parseInt(dld);

					String islymiyat=JOptionPane.showInputDialog(null,"Enter Islymiyat Marks");
					int islymiyat1=Integer.parseInt(islymiyat);

					int totalmarks1=600;
					JOptionPane.showMessageDialog(null,"Total Marks are:"+totalmarks1);

					int obtainmarks=java1+math1+discrete1+english1+dld1+islymiyat1;
					JOptionPane.showMessageDialog(null,"Obtained Marks are:"+obtainmarks);

					double per=obtainmarks*100/totalmarks1;
					JOptionPane.showMessageDialog(null,"Percentage will be:"+per);


					JOptionPane.showMessageDialog(null,"                    MARKSHEET\n______________________________\nMy Name is:" + name + "\n______________________________\nUniversity Name is:" + uni + "\n______________________________\nMy Department Name is:" + department + "\n______________________________\nyear is:" + year + "\n______________________________\nMy Roll No is:" + roll + "\n______________________________\nJava Marks are:" + java1 + "\n______________________________\nMath Marks are:" + math1 + "\n______________________________\nDiscrete Marks are:" + discrete1 + "\n______________________________\nEnglish  Marks are:" + english1 + "\n______________________________\nDld Marks are:" + dld1 + "\n______________________________\nIslymiyat Marks are:" + islymiyat1 + "\n______________________________\nTotal Marks are:" + totalmarks1 + "\n______________________________\nObtained Marks are:" + obtainmarks + "\n______________________________\nPercentage will be:"+per);
					JOptionPane.showMessageDialog(null,"\n=========================\nThank You For Using Marksheet\n=========================");
					
					String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				    ch3=u.charAt(0);				
				}
						continue outer;
			}

			if(number==3)
			{
				char ch4='y';
				while(ch4=='y' || ch4=='Y')
				{
					JOptionPane.showMessageDialog(null,"\n========================\nWELCOME INTO TROLLY LOAD\n========================");

					String load=JOptionPane.showInputDialog(null,"Enter Items");
					int trollyload=Integer.parseInt(load);

					String per=JOptionPane.showInputDialog(null,"Enter Price of Per Load");
					double perload=Double.parseDouble(per);

					double totalincome=trollyload*perload;
					JOptionPane.showMessageDialog(null,"Total Income will be:"+totalincome);

					double driverpay=totalincome*35/100;
					JOptionPane.showMessageDialog(null,"35 Percentage Driver Pay will be:"+driverpay);

					double diesel=totalincome*25/100;
					JOptionPane.showMessageDialog(null,"25 Percentage Diesel:"+diesel);

					double tooltax=totalincome*12/100;
					JOptionPane.showMessageDialog(null,"12 Percentage Tooltaxs will be:"+tooltax);

					double profit=totalincome-driverpay-diesel-tooltax;
					JOptionPane.showMessageDialog(null,"Profit:"+profit);

					JOptionPane.showMessageDialog(null,"Trolly Load\n______________________________\nTotal Income will be:" + totalincome + "\n______________________________\nDriver Pay will be:" + driverpay + "\n______________________________\nDiesel:" + diesel + "\n______________________________\nTooltaxs will be:" + tooltax + "\n______________________________\nProfit:"+profit);
					JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Trolly Load\n===========================");
					
					String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				    ch4=u.charAt(0);
				}

			}	

			if(number==4)
			{
					char ch5='y';
					while(ch5=='y' || ch5=='Y')
				{
					
						JOptionPane.showMessageDialog(null,"\n==============================\nWELCOME TO HESCOBILLING SYSTEM\n==============================");

						String unit=JOptionPane.showInputDialog(null,"Enter Units from (1-400)");
						double unit1=Double.parseDouble(unit);

						if (unit1>0 && unit1<100) 
					{

						double temp0=unit1*2;
						JOptionPane.showMessageDialog(null,"Your Total Bill is"+temp0);
					}
 			
 					if (unit1>=100 && unit1<=200) 
 						{
 							double temp1=unit1-100;
 							double total1=temp1*4;

 							double temp2=unit1-temp1;
 							double total2=temp2*2;

 							double result=total1+total2;
 							JOptionPane.showMessageDialog(null,"Your Total Bill is:"+result);
 						}

 						if(unit1>=200 && unit1<=300)
 						{
 							double temp3=unit1-200;
 							double total3=temp3*6;

 							double temp4=unit1-temp3-100;
 							double total4=temp4*4;

 							double temp5=unit1-temp3-temp4;
 							double total5=temp5*2;

 							double result1=total3+total4+total5;

 							
 							JOptionPane.showMessageDialog(null,"\nYour Total Bill is:"+result1);
 						}

 						if (unit1>=300 && unit1<=400) 
 						{
 							double temp6=unit1-300;
 							double total6=temp6*8;

 							double temp7=unit1-temp6-200;
 							double total7=temp7*6;

 							double temp8=unit1-temp6-temp7-100;
 							double total8=temp8*4;

 							double temp9=unit1-temp6-temp7-temp8;
 							double total9=temp9*2;

 							double result=total6+total7+total8+total9;
 							JOptionPane.showMessageDialog(null,"Your Total Bill is:"+result);

 							JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Hesco Billing\n===========================");
 						}
 					
							String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				   			 ch5=u.charAt(0);
				}
						continue outer;
			}			

				if(number==5)
				{
					char ch6='Y';
					while(ch6=='Y' || ch6=='y')
					{
								JOptionPane.showMessageDialog(null,"\n===========================\nWelcome to Even Odd Numbers\n===========================");

 								String num1=JOptionPane.showInputDialog(null,"Enter a Number:");
 								int num2=Integer.parseInt(num1);

 								if(num2%2==0){

 									JOptionPane.showMessageDialog(null,"It is Even Number");
 								}

 								else{
 									JOptionPane.showMessageDialog(null,"It is odd Number");
 									}
 									JOptionPane.showMessageDialog(null,"\n=====================================\nThank You For Using Even and Odd Numbers\n=====================================");
 									
 									String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				   					ch6=u.charAt(0);		
								}
									continue outer;
							}	
					if(number==6)
					{
						char ch7='Y';
						while(ch7=='Y' || ch7=='y')
						{

							JOptionPane.showMessageDialog(null,"\n===================\nWelcome to converters\n===================");

 									/*JOptionPane.showMessageDialog(null,"1. Kilo to Gram");
 									JOptionPane.showMessageDialog(null,"2. Gram to Kilo");
 									JOptionPane.showMessageDialog(null,"3. Feet to Inch");
 									JOptionPane.showMessageDialog(null,"4. Inch to Feet");
 									JOptionPane.showMessageDialog(null,"5. Dollar to Rupees");
 									JOptionPane.showMessageDialog(null,"6. Rupees to Dollar");
 									JOptionPane.showMessageDialog(null,"7. Hour to Mintue");
 									JOptionPane.showMessageDialog(null,"8. Mintues to Hour");
 									JOptionPane.showMessageDialog(null,"9. Mintues to Seconds");
 									JOptionPane.showMessageDialog(null,"10. Seconds to Mintue");
 									JOptionPane.showMessageDialog(null,"11. Exit");*/

 								String number2=JOptionPane.showInputDialog(null,"                     CONVERTERS\n______________________________\n1.Kilo to Gram" + "\n______________________________\n2.Gram to Kilo" + "\n______________________________\n3.Feet to Inch" + "\n______________________________\n4.Inch to Feet" + "\n______________________________\n5.Dollar to Rupees" + "\n______________________________\n6.Rupees to Dollar" + "\n______________________________\n7.Hour to Mintue" + "\n______________________________\n8.Mintues to Hour" + "\n______________________________\n9.Mintues to Seconds" + "\n______________________________\n10.Seconds to Mintue" + "\n______________________________\n11.Back" + "\n______________________________\n * Enter a Number From Above");
 								int number3=Integer.parseInt(number2);

 									if (number3==1) {

 										JOptionPane.showMessageDialog(null,"\n==========\nKilo To Gram\n==========");

 										String kilo=JOptionPane.showInputDialog(null,"Enter a Kilo");
 										double kilo1=Double.parseDouble(kilo);

 										double gram=kilo1*1000;
 										JOptionPane.showMessageDialog(null,"Gram will be:"+gram);
 										JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Kilo to Gram\n===========================");
 										}
 									if (number3==2) {
 										
 										JOptionPane.showMessageDialog(null,"\n==========\nGram To Kilo\n==========");

 										String gram=JOptionPane.showInputDialog(null,"Enter a Gram");
 										double gram1=Double.parseDouble(gram);

 										double kilo=gram1/1000;
 										JOptionPane.showMessageDialog(null,"Kilo will be:"+kilo);
 										JOptionPane.showMessageDialog(null,"\n============================\nThank You For Using Gram to Kilo\n============================");
 									}

 									if (number3==3) {

 										JOptionPane.showMessageDialog(null,"\n==========\nFeet to Inch\n==========");

 										String feet=JOptionPane.showInputDialog(null,"Enter a Feet");
 										double feet1=Double.parseDouble(feet);

 										double inch=feet1*12;
 										JOptionPane.showMessageDialog(null,"Inch will be:"+inch);
 										JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Feet to Inch\n===========================");	
 										}	

 									if (number3==4) {
 										
 										JOptionPane.showMessageDialog(null,"\n==========\nInch to Feet\n==========");

 										String inch=JOptionPane.showInputDialog(null,"Enter a Inch");
 										double inch1=Double.parseDouble(inch);

 										double feet=inch1/12;
 										JOptionPane.showMessageDialog(null,"Feet will be:"+feet);
 										JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Inch to Feet\n===========================");	
 										}
 									if (number3==5) {
 										
 										JOptionPane.showMessageDialog(null,"\n===============\nDollar to Rupees\n===============");

 										String dollar=JOptionPane.showInputDialog(null,"Enter Dollar");
 										double dollar1=Double.parseDouble(dollar);

 										double rupees=dollar1*225;
 										JOptionPane.showMessageDialog(null,"Rupees will be:"+rupees);
 										JOptionPane.showMessageDialog(null,"\n==============================\nThank You For Using Dollar to Rupees\n==============================");	
 											}
 									if (number3==6) {
 										
 										JOptionPane.showMessageDialog(null,"\n===============\nRupees to Dollar\n===============");

 										String rupees=JOptionPane.showInputDialog(null,"Enter Rupees:");
 										double rupees1=Double.parseDouble(rupees);

 										double dollar=rupees1/225;
 										JOptionPane.showMessageDialog(null,"Dollar will be:"+dollar);
 										JOptionPane.showMessageDialog(null,"\n==============================\nThank You For Using Rupees to Dollar\n==============================");			
 														}	

 									if (number3==7) {

 										JOptionPane.showMessageDialog(null,"\n===============\nHours to Mintues\n===============");

 										String hours=JOptionPane.showInputDialog(null,"Enter Hours");
 										double hour1=Double.parseDouble(hours);

 										double mintues=hour1*60;
 										JOptionPane.showMessageDialog(null,"Mintues will:"+mintues);
 										JOptionPane.showMessageDialog(null,"\n==============================\nThank You For Using Hours to Mintues\n==============================");
 																		}	
 									if (number3==8) {
 										
 										JOptionPane.showMessageDialog(null,"\n===============\nMintues To Hours\n===============");

 										String mintues=JOptionPane.showInputDialog(null,"Enter Mintues");
 										double mintues1=Double.parseDouble(mintues);

 										double hours=mintues1/60;
 										JOptionPane.showMessageDialog(null,"Hours will be:"+hours);
 										JOptionPane.showMessageDialog(null,"\n===============================\nThank You For Using Mintues to Hours\n===============================");
 																											
 																										}	
 									if (number3==9) {
 										
 										JOptionPane.showMessageDialog(null,"\n===============\nMintues to Second\n===============");

 										String mintues=JOptionPane.showInputDialog(null,"Enter Mintues");
 										double mintues1=Double.parseDouble(mintues);

 										double second=mintues1*60;
 										JOptionPane.showMessageDialog(null,"Seconds will be:"+second);
 										JOptionPane.showMessageDialog(null,"\n================================\nThank You For Using Mintue to Second\n================================");																																	
 																								}
 									if (number3==10)
 									 {
 										
 										JOptionPane.showMessageDialog(null,"\n=================\nSeconds To Mintues\n=================");

 										String second=JOptionPane.showInputDialog(null,"Enter Seconds");
 										double seconds1=Double.parseDouble(second);

 										double mintues=seconds1/60;
 										JOptionPane.showMessageDialog(null,"Mintues will be"+mintues);
 										JOptionPane.showMessageDialog(null,"\n===============================\nThank You For Using Second to Mintue\n===============================");
 									}

 									if (number3==11)
 									{	
 										JOptionPane.showMessageDialog(null,"\n===========================\nThank You For Using Converters\n===========================");
 										continue outer;
 									}

 									String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				   					ch7=u.charAt(0);				
								}
							}

						if(number==7)
						{
						 char ch8='Y';
						 	while(ch8=='Y' || ch8=='y')
						 	{
						 		JOptionPane.showMessageDialog(null,"Iam Faraz Ali Mengal Student of Computer Science"+"\nin Sindh University"+"Roll No:34");

						 		String u=JOptionPane.showInputDialog(null,"Do You Want To Stay in Project or want to Exit exit[Y/N]");
				   				ch8=u.charAt(0);
						 	}
						 	continue outer;
						}	

					if(number==8)
					{
						System.exit(0);
					}	
		}
	}
}
