/*
 * File name: PaymeInterfaceTest.java
 * author: Jiebo Peng
 * Course: CST8284 - OOP (314)
 * Assignment: lab06
 * Date: 31 March 2023
 * Professor: George Kriger
 * Purpose: use extends, inheritance and polymorphism
 */
package Lab06;
/**
 * this class tese Payme objects.
 * @see java.io
 */
public class PaymeInterfaceTest2  {
	/**
	 * this is the main entrance of the program.
	 * @param args arguments of command
	 */
	public static void main(String[] args) {

		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n"); 

		// generically process each element in array paymeObjects
		Payme payme1 = new Invoice("22776", "brakes", 3, 300.00);
		Payme payme2 = new Invoice("33442", "gear", 5, 90.99);
		Payme payme3 = new SalariedProgrammer("Chioma", "Peng", "345-67-0001", 320.00);
		Payme payme4 = new HourlyProgrammer("Amara", "Peng", "345-56-7770", 18.95, 40.00);
		Payme payme5 = new CommissionProgrammer("Peter", "Peng", "123-45-6999", 16500.00, 0.44);
		Payme payme6 = new BasePlusCommissionProgrammer("Esther", "Peng", "102-34-5888", 1200.00, 0.04, 720.00);

		Payme[] paymeObjects = {payme1, payme2, payme3, payme4, payme5, payme6};

		for (Payme currentPayme : paymeObjects) {
			//call interface Payme's default method and it will print each class itself.
			currentPayme.display(); 
		
			// output currentPayme and its appropriate payment amount	 
			//System.out.printf("%s \n", currentPayme.toString()); 

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to 
				// BasePlusCommissioProgrammer reference, and know why we're doing thisS
				BasePlusCommissionProgrammer programmer = 
						(BasePlusCommissionProgrammer) currentPayme;

				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						programmer.getBaseSalary());
			} 
			
			
      //output each Payme instance payment due.
			System.out.printf("payment due: $%,.2f\n", currentPayme.getPaymentAmount());
			System.out.println();
		}
	} 
	
}


