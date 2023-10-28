/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Enrollment {

    
    public static void main(String[] args) {
    	
    	//System.out.println("\n\n Ejercicio pendiente de realizar \n\n");
    	LabClass clase1 = new LabClass(2);
    	LabClass clase2 = new LabClass(1);
    	Student student1 = new Student("Monica Geller", "A00234");
    	Student student2 = new Student("Joe Tribiani", "C22044");
    	Student student3 = new Student("Chandler Bing", "A12003");
    	Student student4 = new Student("Rachel Green", "B660034");
    	
    	clase1.setInstructor("Eli");
    	clase1.setTime("Miercoles, 15h");
    	clase1.setRoom("Aulario 2");
    	
    	clase2.setInstructor("Jose Antonio");
    	clase2.setTime("Miercoles, 17h");
    	clase2.setRoom("Aulario 2");
    	
    	clase1.enrollStudent(student1);
    	clase1.enrollStudent(student2);
    	student1.addCredits(24);
    	student2.addCredits(56);
    	student3.addCredits(6);
    	
    	clase2.enrollStudent(student3);
    	clase2.enrollStudent(student4);
    	
    	clase1.printList();
    	clase2.printList();
    	
    } 
    
}
