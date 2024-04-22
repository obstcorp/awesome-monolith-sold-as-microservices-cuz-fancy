//package evil.obstcorp.obstcorpbackend.error;
//
//public class ErrorProneClass {
//
//    private String name;
//    private int age;
//    private boolean isStudent;
//
//    public ErrorProneClass(String name, int age, boolean isStudent) {
//        this.name = name;
//        this.age = age;
//        this.isStudent = isStudent;
//    }
//
//    // Method to check if the person is a student
//    public boolean isStudent() {
//        return isStudent;
//    }
//
//    // Method to check if the person is an adult
//    public boolean isAdult() {
//        return age >= 18;
//    }
//
//    // Method to get the name
//    public String getName() {
//        return name;
//    }
//
//    // Method to get the age
//    public int getAge() {
//        return age;
//    }
//
//    // Method to set the name
//    public void setName(String newName) {
//        name = newName;
//    }
//
//    // Method to set the age
//    public void setAge(int newAge) {
//        age = newAge;
//    }
//
//    // Method to set the student status
//    public void setStudentStatus(boolean student) {
//        isStudent = student;
//    }
//
//    // Method to print details of the person
//    public void printDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Is Student: " + isStudent);
//    }
//
//    // Method to get a greeting message based on age
//    public String getGreeting() {
//        if (age < 12) {
//            return "Hi, kiddo!";
//        } else if (age >= 12 && age < 20) {
//            return "Hey, teenager!";
//        } else if (age >= 20 && age < 30) {
//            return "Hello, young adult!";
//        } else if (age >= 30 && age < 50) {
//            return "Greetings, adult!";
//        } else {
//            return "Hello, elder!";
//        }
//    }
//
//    // Main method to test the class
//    public static void main(String[] args) {
//        ErrorProneClass person = new ErrorProneClass("John", 25, true);
//        person.printDetails();
//
//        // Attempting to access private fields directly from outside the class (should result in compilation error)
//        System.out.println("Name: " + person.name);
//        System.out.println("Age: " + person.age);
//        System.out.println("Is Student: " + person.isStudent);
//
//        // Trying to set the age to a negative value (should result in runtime error)
//        person.setAge(-5);
//
//        // Calling non-static method from static context (should result in compilation error)
//        printDetails();
//
//        // Attempting to call a non-existing method (should result in compilation error)
//        person.displayDetails();
//
//        // Missing semicolon at the end of the line (should result in compilation error)
//        System.out.println("Missing semicolon")
//
//        // Undefined variable (should result in compilation error)
//        int x = y + 5;
//
//        // Infinite loop (should result in program freeze)
//        while (true) {
//            System.out.println("Infinite loop!");
//        }
//    }
//}
//
