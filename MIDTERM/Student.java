
//Eldrin Trapa
//BSIT-2B

import java.util.Scanner;

class Student {

    private String firstName, middleName, lastName, suffix;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
      
    public String getFullName() {
        String fullName = firstName + " " + (middleName != null ? middleName + " " : "") + lastName;
        if (suffix != null && !suffix.isEmpty()) {
            fullName += " " + suffix;
        }
        return fullName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        student.setFirstName(firstName);

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();
        student.setMiddleName(middleName);

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        student.setLastName(lastName);

        System.out.print("Enter Suffix: ");
        String suffix = scanner.nextLine();
        student.setSuffix(suffix);
        
        

        System.out.println("\nFirst Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("Full Name: " + student.getFullName());
    }
}