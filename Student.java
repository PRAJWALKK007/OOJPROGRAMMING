                                                                                                 import java.util.Scanner;

class Subject 
{
    int subjectMarks;
    int credits;
    int grade;
}

public class Student 
	{
    Subject[] subject;
    String name;
    String usn;
    double SGPA;
    Scanner s;



    Student() 
	{
        int i;
        subject = new Subject[9];
        for (i = 0; i < 9; i++)
            subject[i] = new Subject();
        s = new Scanner(System.in);
    }

    public void getStudentDetails() 
{
        System.out.println("Enter Name: ");
        name = s.nextLine();
        System.out.println("Enter USN: ");
        usn = s.nextLine();
    }

    public void getMarks() 
	{
        for (int i = 0; i < 8; i++) 
	 {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            subject[i].subjectMarks = s.nextInt();
            System.out.println("Enter credits for subject " + (i + 1) + ": ");
            subject[i].credits = s.nextInt();
            if (subject[i].subjectMarks > 100) 
		{
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                i--;
            } 
		else if (subject[i].subjectMarks >= 90) 
		{
                subject[i].grade = 10;
            } 
		else if (subject[i].subjectMarks >= 80) 
		{
                subject[i].grade = 9;
            } 
		else if (subject[i].subjectMarks >= 70) 
		{
                subject[i].grade = 8;
            } 
		else if (subject[i].subjectMarks >= 60) 
		{
                subject[i].grade = 7;
            } 
		else if (subject[i].subjectMarks >= 50) 
		{
                subject[i].grade = 6;
            } 
		else if (subject[i].subjectMarks >= 40) 
		{
                subject[i].grade = 5;
            } 
		else 
		{
                subject[i].grade = 0;
            }
        }
    }

    public void computeSGPA() 
	{
        double totalCredits = 0;
        double totalGradePoints = 0;
        for (int i = 0; i < 8; i++) 
	 {
            totalCredits += subject[i].credits;
            totalGradePoints += subject[i].grade * subject[i].credits;
        }
        SGPA = totalGradePoints / totalCredits;
    }

    public static void main(String[] args) 
	{
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        System.out.println("Name: " + s1.name);
        System.out.println("USN: " + s1.usn);
        System.out.println("SGPA: " + s1.SGPA);
    }
}


