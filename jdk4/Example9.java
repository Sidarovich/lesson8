package epm.com.jdk4;

import java.util.Date;

public class Example9 {

	public static void main(String[] args) {
		
		Date dNow = new Date();

		Account acc_customer1 = new Account("1234", "Ivan FFFFF", "USD");
		Account acc_customer2 = new Account("1234", "Ctepan fff", "USD");
		System.out.println("acc_customer1 now " + dNow + " hashCode " + acc_customer1.hashCode()); // -2040933628
		acc_customer1.setopendate(dNow);
		System.out.println("acc_customer1 now " + dNow + " hashCode " + acc_customer1.hashCode()); // 1450954280
		if (acc_customer1.addtransaction(10000, "USD")) {
			System.out.println("acc_customer1 10000 USD added , hashCode" + acc_customer1.hashCode()); 
		};
		System.out.println("acc_customer1 " + acc_customer1.toString()); 
		if (acc_customer1.minustransaction  (100, "USD")) {
			System.out.println("acc_customer1 100 USD deducted , hashCode " + acc_customer1.hashCode()); 
		}
		System.out.println("Is acc_customer1 equals to acc_customer2: " + acc_customer1.equals(acc_customer2)); 
		if (acc_customer2.addtransaction(9900, "USD")) {
			System.out.println("acc_customer2 9900 USD added , hashCode, " + acc_customer2.hashCode()); 
		};

		acc_customer2.setopendate(dNow);
		System.out.println("acc_customer2 hashCode " + acc_customer2.hashCode()); // 1450954280
		System.out.println("Is acc_customer1 equals to acc_customer2: " + acc_customer1.equals(acc_customer2)); 
		
		pay Zayavka1= new pay();
		Itm tovar1 = new Itm ("Laptop mm", 999.90);
		Itm tovar2 = new Itm ("Back", 19.90);
		Itm tovar3 = new Itm ("Pizz77", 4.99);
		Zayavka1.add(tovar1);

		Zayavka1.add(tovar2);
		Zayavka1.add(tovar3);
		System.out.println("Currently in basket goods total sum:  " + Zayavka1.totalamount()); 
		if (acc_customer1.minustransaction  (Zayavka1.totalamount(), "USD")) {
			System.out.println("acc_customer1 " + Zayavka1.totalamount() + " USD deducted " ); 
		}
		System.out.println("Details on acc_customer1 BankAccout after Payment " + acc_customer1.toString()); 
	}
}
