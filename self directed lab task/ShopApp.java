import java.util.*;
import java.io.*;

public class ShopApp
{
	static class Product
	{
		String name;
		int stocklevel;
		double price;

		Product(String name ,int stocklevel,double price)
		{
			this.name =name;
			this.stocklevel =stocklevel;
			this.price = price;

		}
		public String getname()
		{
			return name;
		}
		public int getstocklevel()
		{
			return stocklevel;
		}
		public double getprice()
		{
			return price;
		}
	}

	
	public static void print1(Product itemData[] , int n)
	{
           System.out.println("Product Name : "+itemData[n].getname());
           System.out.println("stocklevel : "+itemData[n].getstocklevel());
           System.out.println("Product Price : "+itemData[n].getprice());
	}

	public static void child_menu(Product itemData[] )
	{               boolean check =true;
		            while(check){     

		                        System.out.println("Enter Item Name : ");

		                        Scanner sc = new Scanner(System.in);
		                        System.out.println("...................");
                                           String value =sc.next();int temp=0;
                                           for(int i=0;i<itemData.length;i++)
                                           {
                                           	  if(itemData[i].getname().equals(value))
                                           	  {
                                                     print1(itemData ,i);
                                                     temp=i;
                                           	  }
                                           }
                                           System.out.println("...................");
                                           System.out.println("Bye:1 /Sell:2 /Set-Price:3 /Back Main Menu:4 ");
                                           int data =sc.nextInt();
                                           switch(data)
                                           {
                                           	    case 1: 
                                           	           System.out.println("Enter (Buy) Amount: ");
                                           	           int buy =sc.nextInt();
                                           	        int store1= itemData[temp].getstocklevel()+buy; 
                                           	        itemData[temp].stocklevel =store1;
                                           	         System.out.println(" Update done");
                                           	         break;

                                           	      case 2:
                                           	              System.out.println("Enter (Sell) Amount: ");
                                           	           int sell =sc.nextInt();
                                           	           if(sell>itemData[temp].getstocklevel())
                                           	           {
                                           	             System.out.println("Out of Stock Item");
                                           	           }else
                                           	           {   int store2= itemData[temp].getstocklevel()-sell; 
                                           	               itemData[temp].stocklevel =store2;
                                           	               System.out.println(" Update done");
                                           	           }
                                           	         break; 

                                           	         case 3:

                                           	               System.out.println("Enter (Set-price) Amount: ");
                                           	           int data1 =sc.nextInt();
                                           	        // int store= itemData[temp].getprice()+data; 
                                           	        itemData[temp].price =data1;
                                           	         System.out.println(" Update done");
                                           	         break; 

                                           	         case 4:
                                           	                check =false;
                                           	                break;
                                           	        default:
                                           	            System.out.println("Invalid Input");


                                           	        }

  
                                           }
	}


	public static void Print2(Product itemData[])
	{
          for(int i=0;i<itemData.length;i++)
          {
          	  System.out.println((i+1)+") "+ itemData[i].getname());
          }	
	}
	public static void main(String arge[])
	{
		Product item1 = new Product("oil", 5 ,170);
		Product item2 = new Product("coke",20,10);
		Product item3 = new Product("egg", 100 ,6);
		Product item4 = new Product("maggi", 20 ,5);
		Product item5 = new Product("biscuit", 10 ,20);
		Product itemData[]={item1 ,item2, item3, item4, item5};

               while(true)
               {
               	         System.out.print("(Press 1) Product Menu , (Press 2) Exit");
               	         Scanner sc = new Scanner(System.in);
               	         int data =sc.nextInt();

               	         switch(data)
               	         {
               	         	 case 1:
               	         	           Print2(itemData);
               	         	        child_menu(itemData);
               	         	        break;
               	         	 case 2:
               	         	       System.exit(0);
               	         	       break;
               	         	       default:
               	         	       System.out.print("Invalid Input");       
               	         }


               }

	}


	


}