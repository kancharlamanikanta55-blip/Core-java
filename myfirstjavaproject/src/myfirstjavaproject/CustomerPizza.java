package myfirstjavaproject;

import java.util.Scanner;

public class CustomerPizza {

			static int price=0;
			static double cost=0;
			static double dCharge=0;
			static double getPizzaPrice(char size) {
				switch(size) {
					case 'S'-> price=70;
					case 'M'-> price=100;
					case 'L'->price=150;
					default->{ 
						System.out.println("The size not available");
						price=0;
					}
				}
				return price;
			}
			static double calculatepizzaCost(double price,int quantity) {
				cost=price*quantity;
				return cost;
			}
			static double calculateDeliveryCharge(double distance) {
				if(distance>=0&&distance<=10) {
					dCharge=70;
				}
				else if(distance>=11&&distance<=20) {
					dCharge=100;
				}
				else {
					dCharge=150;
				}
				return dCharge;
				
			}
			static double calculateFinalBill(double pizzaCost,double deliveryCharge ) {
				return pizzaCost+deliveryCharge;
			}

			public static void main(String[] args) {
				System.out.println("Welcome to dominos house");
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the size of the pizza: ");
				char size=Character.toUpperCase(sc.next().charAt(0));
				System.out.println("Enter the quantity: ");
				int quantity=sc.nextInt();
				System.out.println("Enter the distance between home to dominos house: ");
				double distance=sc.nextDouble();
				getPizzaPrice(size);
				double pizzaCost=calculatepizzaCost(price,quantity);
				double deliveryCharge=calculateDeliveryCharge(distance);
				double finalBill=calculateFinalBill(pizzaCost,deliveryCharge );
				System.out.println("The Total Bill invoice: "+finalBill);
				System.out.println("Enjoy our receipe");
				System.out.println("Thank you");

			}


  }


