import java.util.Scanner;

/**
 * 
 */

/**
 * @author Devesh_83855
 *
 */
public class Invoice {
//	private String partName;
	private String partNumber;
	private String partDesc;
	private int quantityPurchased;
	private double  itemPrice;
	private double totalAmount=0;
	// Constroctur 
	public Invoice(){
		System.out.println("Inside parameter less constructor");
		partNumber = "p11";
		partDesc = "Spark plug for port 11mm";
		quantityPurchased = 1;
		itemPrice=  1000;
		
	}
		
	public Invoice(String partNumber, String partDesc, int quantityPurchased, double itemPrice) {
		System.out.println("Inside parameterize constructor");
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantityPurchased = quantityPurchased;
		this.itemPrice = itemPrice;
	}
	



	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	//facilitator
	public double totalAmount() {
		return totalAmount =itemPrice*quantityPurchased ;
	
	}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Part Number:- ");
		partNumber = sc.nextLine();
		System.out.println("Enter Part Description:- ");
		partDesc = sc.nextLine();
		System.out.println("Enter Quantity of Purchased item:- ");
		quantityPurchased = sc.nextInt();
		System.out.println("Enter Part price:- ");
		itemPrice = sc.nextDouble();
		if(quantityPurchased<0 && itemPrice<0) {
			setQuantityPurchased(0);
			setItemPrice(0);	
		}
		totalAmount();
		display();
		
		
	}
	public void display() {
		System.out.println("Thank you For Visiting our Store Sir!");
		System.out.println("Part Number = "+partNumber);
		System.out.println("Part Description ="+partDesc);
		System.out.println("QuantityPurchased ="+quantityPurchased);
		System.out.println("Total = "+ totalAmount);
	}
	
	

}
