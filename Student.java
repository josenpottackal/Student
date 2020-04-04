
/**
* File Name: Student.java
* Purpose: Emulates a student
* Date: 2020-03-01
* Last modified: 2020-03-01
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class Student {
	
	/**
	 *  First Name of the student
	 */
	private String firstName;
	
	/**
	 *  Surname of the student
	 */
	private String surname;
	
	/**
	 *  Student coursework mark
	 */
	private double courseworkMark;
	
	/**
	 *  Student test mark
	 */
	private double testMark;
	
	/**
	 *  Student lab partner
	 */
	private Student studentPartner;
	
	/**
	 * Creates a student.
	 */
	public Student(String firstName, String surname, double courseworkMark, 
									double testMark, Student studentPartner) {
		this.firstName = firstName;
		this.surname = surname;
		this.courseworkMark = courseworkMark;
		this.testMark = testMark;
		this.studentPartner = studentPartner;
	}
	
	/**
	 * Method to set first name
	 * @param firstName student first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Method to set surname
	 * @param surname student surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * Method to set lab partner
	 * @param studentPartner student lab partner
	 */
	public void setStudentPartner(Student studentPartner) {
		this.studentPartner = studentPartner;
	}
	
	/**
	 * Method to get firstName
	 */
	public String getFirstName() {
		System.out.println(firstName);
        return firstName;
    }
	
	/**
	 * Method to get surname
	 */
	public String getSurname() {
		System.out.println(surname);
        return surname;
    }
	
	/**
	 * Method to get full name
	 */
	public String getFullName() {
		System.out.println(firstName + " " + surname);
        return firstName + " " + surname;
    }
	
	/**
	 * Method to get student's lab partner
	 */
	public Student getStudentPartner() {
		return studentPartner;
	}
	
	/**
	 * Method to get student's average mark
	 */
	public double getAverageMark() {
		double averageMark = ((courseworkMark + testMark) / 2);
		System.out.println(averageMark);
		return averageMark;
	}
}
