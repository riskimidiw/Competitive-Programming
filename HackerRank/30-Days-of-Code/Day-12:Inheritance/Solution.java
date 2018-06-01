// Problem : https://www.hackerrank.com/challenges/30-inheritance/problem

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0, mean = 0;
        for(int i:testScores) {
            sum += i;
        }
        mean = sum / testScores.length;
        if(mean >= 90 && mean <= 100) {
            return 'O';
        }else if(mean >= 80 && mean < 90) {
            return 'E';
        }else if(mean >= 70 && mean < 80) {
            return 'A';
        }else if(mean >= 55 && mean < 70) {
            return 'P';
        }else if(mean >= 40 && mean < 55) {
            return 'D';
        }
        return 'T';
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}