import java.util.*;
import java.io.*;
import java.text.*;
class menu{
	void pizzamenu(){
		System.out.println("\n\n \t\t Our Delecious Menu ");
		System.out.println("\t\t ==================");
		System.out.println("\n\nS.No \t\t\t Small \t  Regular \tLarge");
		System.out.println("");
		System.out.println("1.  Chicken Tikka \t 500 \t   700 \t\t 900");
		System.out.println("2.  Chicken Fajita \t 500 \t   700 \t\t 900");
		System.out.println("3.  Chicken Malai \t 500 \t   700 \t\t 900");
		System.out.println("4.  Chicken Cheese \t 500 \t   700 \t\t 900");
		System.out.println("5.  Chicken Achari \t 500 \t   700 \t\t 900");
	}
	void sizechoice(){
		System.out.print("\n1. Small   =  500/-");
		System.out.print("\n2. Regular =  700/-");
		System.out.print("\n3. Large   =  900/-\n");
	}
}
class order{
	void addinfo() throws IOException{
		menu m = new menu();
		Scanner in = new Scanner(System.in);
		FileWriter f = new FileWriter("Records.txt",true);
		ArrayList<String> items = new ArrayList<String>();
        ArrayList<Integer> price = new ArrayList<Integer>();
		ArrayList<String> size = new ArrayList<String>();
		ArrayList<String> crust = new ArrayList<String>();
		ArrayList<String> topping = new ArrayList<String>();
		ArrayList<Integer> toppingprize = new ArrayList<Integer>();
		ArrayList<String> beverage = new ArrayList<String>();
		ArrayList<Integer> beverageprize = new ArrayList<Integer>();
		ArrayList<String> appetizer = new ArrayList<String>();
		ArrayList<Integer> appetizerprize = new ArrayList<Integer>();
		Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		// appetizer integar
		int app = 150;
		// beverage integars
		int soft = 200, mineral = 70;
		// Topping integar
		int topp = 199;
		// Flavour Integar
		int small = 500, reg = 700, large = 900;
		System.out.print("\nEnter Your Name: ");
		String name = in.nextLine();
		System.out.println("\n\t\t **********************");
		System.out.println("\n\t\t Welcome to Pizza House \n");
		System.out.println("\t\t **********************");
		System.out.print("\nEnter the amount of Pizza: ");
		int amount = in.nextInt();
		for(int i=1;i<=amount;i++)
		{
			m.pizzamenu();
			System.out.println("\n\tOrder Item no: "+i);
			System.out.print("\nPlease Select your desired Flavours:");
			int choice = in.nextInt();
			switch(choice){
				case 1:
				{
					System.out.println("Chicken Tikka\n ");
					items.add("Chicken Tikka");
				    m.sizechoice();
					System.out.print("Enter your desired Size: ");
					int size1 = in.nextInt();
						if(size1==1){
						size.add("Small");
						price.add(small);
						}
						else if(size1==2){
							size.add("Regular");
							price.add(reg);
						}
						else if(size1==3){
							size.add("Large");
							price.add(large);
						}
						break;
				}
					case 2:
				{
					System.out.println("Chicken Fajita\n ");
					items.add("Chicken Fajita");
					m.sizechoice();
					System.out.print("Enter your desired Size: ");
					int size1 = in.nextInt();
						if(size1==1){
						size.add("Small");
						price.add(small);
						}
						else if(size1==2){
							size.add("Regular");
							price.add(reg);
						}
						else if(size1==3){
							size.add("Large");
							price.add(large);
						}
						break;
				}
					case 3:
				{
					System.out.println("Chicken Malai\n ");
					items.add("Chicken Malai");
					m.sizechoice();
					System.out.print("Enter your desired Size: ");
					int size1 = in.nextInt();
						if(size1==1){
						size.add("Small");
						price.add(small);
						}
						else if(size1==2){
							size.add("Regular");
							price.add(reg);
						}
						
				
						else if(size1==3){
							size.add("Large");
							price.add(large);
						}
						else if(size1!=1 && size1!=2 && size1!=3){
							System.out.println("Please Enter valid Option");
						}
							
						break;
				}
					case 4:
				{
					System.out.println("Chicken Cheese\n ");
					items.add("Chicken Cheese");
					m.sizechoice();
					System.out.print("Enter your desired Size: ");
					int size1 = in.nextInt();
						if(size1==1){
						size.add("Small");
						price.add(small);
						}
						else if(size1==2){
							size.add("Regular");
							price.add(reg);
						}
						else if(size1==3){
							size.add("Large");
							price.add(large);
						}
						break;
				}
					case 5:
				{
					System.out.println("Chicken Achari\n ");
					items.add("Chicken Achari");
					m.sizechoice();
					System.out.print("Enter your desired Size: ");
					int size1 = in.nextInt();
						if(size1==1){
						size.add("Small");
						price.add(small);
						}
						else if(size1==2){
							size.add("Regular");
							price.add(reg);
						}
						else if(size1==3){
							size.add("Large");
							price.add(large);
						}
						break;
				}
						
			}
			// Crust Section
			System.out.println("\n1. Normal \n2. Thinza \n3. Cheese Filled");
			System.out.print("Select crust type: ");
			int crust1 = in.nextInt();
			switch(crust1)
			{
				case 1:
				{
					crust.add("Normal");
					break;
				}
				case 2:
				{
					crust.add("Thinza");
					break;
				}
				case 3:
				{
					crust.add("Cheese Filled");
					break;
				}
			}
			
		}
		// Drink Section
		    System.out.print("\n\nDo you wish to add Beverages in your order? \nIf yes press 1, If no press any other number. . . ");
			int bevchoice = in.nextInt();
			switch(bevchoice){
				case 1:{
			System.out.println("\nBeverages");
			System.out.println("1. Soft Drink   -----------------200/- (per pitcher)");
			System.out.println("2. Mineral Water-----------------70/-  (1.5 Litre)");
			System.out.print("Select your drink: ");
			int beverage1 = in.nextInt();
			switch(beverage1)
			{
				case 1:
				{
					beverage.add("Soft Drink   ");
					beverageprize.add(soft);
					break;
				}
				case 2:
				{
					beverage.add("Mineral Water");
					beverageprize.add(mineral);
					break;
				}
				default:
				{
					beverage.add("None         ");
					beverageprize.add(0);
					break;
				}
			}
			break;
				}
				default:
				{
					beverage.add("None         ");
					beverageprize.add(0);
					System.out.println("No Beverages As per your demands");
					break;
				}
				
			}
			// Appetizer Section
			System.out.print("\n\nDo you wish to add Appertizers in your order? \nIf yes press 1, If no press any other number. . . ");
			int appchoice = in.nextInt();
			switch(appchoice) {
				case 1:{
			System.out.println("\nAppetizers");
			System.out.println("1. Garlic Bread    ----------------- 199/-");
			System.out.println("2. Mozarella Stick ----------------- 199/-");
			System.out.println("3. Chicken Fries   ----------------- 199/-");
			System.out.println("4. French Fries    ----------------- 199/-");
			System.out.print("Select your appetizer: ");
			int appetizer1 = in.nextInt();
			switch(appetizer1)
			{
				case 1:
				{
					appetizer.add("Garlic Bread   ");
					appetizerprize.add(app);
					
				}
				case 2:
				{
					appetizer.add("Mozarella Stick");
					appetizerprize.add(app);
					
				}
				case 3:
				{
					appetizer.add("Chicken Fries  ");
					appetizerprize.add(app);
					
				}
				case 4:
				{
					appetizer.add("French Fries   ");
					appetizerprize.add(app);
					
				}
				default:
				{
					appetizer.add("None           ");
					appetizerprize.add(0);
				}
			}
			break;
				}
				default: {
					appetizer.add("None           ");
					appetizerprize.add(0);
					break;
				}
			}
		int total=0;
		// Bill Heading
		System.out.println("\n\t\t\t\t Bill");
		System.out.println("\t\t\t\t ****");
		System.out.println("\t\tName: "+name+"\t\tDate: "+df.format(d));
		System.out.println("\t\t-------------------------------------------");
		System.out.print("\t\tItems\t\t\t\tPrice\n\t\t*****\t\t\t\t*****\n");
		System.out.print("\n\t\tPizza\n\t\t=====\n");
		for(int i=0; i<amount;i++)
		{
		try{System.out.println("\t\t1."+size.get(i)+" Pizza\t\t\t"+price.get(i)+"/-\n\t\tFlavour: "+items.get(i)+"\n\t\tCrust: "+crust.get(i)+"/-");
		total = total+price.get(i);}catch(Exception e){}
		}
		System.out.print("\n\t\tAppertizers & Beverages\n\t\t=========== = =========\n");
		for(int i=0;i<1;i++){
			System.out.print("\t\t1. "+beverage.get(i)+"\t\t"+beverageprize.get(i)+"/-\n\t\t1. "+appetizer.get(i)+"\t\t"+appetizerprize.get(i)+"/-");
			total = total+beverageprize.get(i)+appetizerprize.get(i);
		}
		System.out.print("\n\t\tYour Total Bill is :\t\t"+total+"/- \n");
		System.out.println("\t\t-------------------------------------------");
		System.out.println("\t\t\t\tThank You!");
		// Writing into a file
		f.write("\n\n\t\t\t\tBill\n\t\t\t\t****");
		f.write("\n\t\tName: "+name+"\t\tDate: "+df.format(d));
		f.write("\n\t\t-------------------------------------------");
		f.write("\n\t\tItems\t\t\t\tPrice\n\t\t*****\t\t\t\t*****\n");
		f.write("\n\t\tPizza\n\t\t=====");
		for(int i=0; i<amount;i++)
		{
			try{f.write("\n\t\t1."+size.get(i)+" Pizza\t\t\t"+String.valueOf(price.get(i))+"/-\n\t\tFlavour: "+items.get(i)+"\n\t\tCrust:/-");}catch(Exception e){}
		}
		f.write("\n\n\t\tAppertizers & Beverages\n\t\t=========== = =========");
		for(int i=0;i<1;i++){
			f.write("\n\t\t1. "+beverage.get(i)+"\t\t"+String.valueOf(beverageprize.get(i))+"/-\n\t\t1 ."+appetizer.get(i)+"\t\t"+String.valueOf(appetizerprize.get(i))+"/-");
		}
		f.write("\n\t\tTotal:\t\t\t\t"+String.valueOf(total)+"/-\n");
		f.write("\t\t-------------------------------------------");
		f.write("\n\t\t\t\tThank You!");
		f.close();
	}
	void records() throws IOException{
		// Reading from a file
		FileReader fr = new FileReader("Records.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
// Main Class
class pizzatest1{
	public static void main(String args[]) throws IOException
	{
		order o = new order();
		int n=0;
		while(n!=3){
		Scanner in = new Scanner(System.in);
		System.out.println("\nPress 1 to order");
		System.out.println("Press 2 to check Bill records");
		System.out.println("Press 3 to exit");
		n = in.nextInt();
		switch(n){
			case 1:{ o.addinfo(); break; }
			case 2:{o.records(); break;}
	}
	}
}}