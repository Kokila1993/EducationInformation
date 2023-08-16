package org.edu;

public class Arts extends Education {
	
	private void bSc(int Student) {
		
		System.out.println("Enter the Number of student:"+Student);
	}
	private void bA(int Student) {
		
		System.out.println("Enter the Number of student:"+Student);
	}
	private void bEd(int Student) {
		
		System.out.println("Enter the Number of student:"+Student);
	}
	private void bBA(int Student) {
		
		System.out.println("Enter the Number of student:"+Student);
	}
	public void ug(int student) {
		
		super.ug(3450);
		System.out.println("Number of Students in arts UG:"+student);
	}
	public void pg(int student) {
		
		super.pg(1512);
		System.out.println("Number of Students in arts PG:"+student);
	}
	public static void main(String[] args) {
		Arts i = new Arts();
		i.bSc(59);
		i.bA(43);
		i.bBA(60);
		i.bEd(56);
		i.ug(250);
		i.pg(200);
		
	}
}
