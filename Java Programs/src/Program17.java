/* Person
        Write a class with the name Person. The class needs three fields (instance variables) with the names
        firstName, lastName of type String and age of type int.
        Write the following methods(instance methods):
        *Method named getFirstName without any parameters, it needsto return the value of the firstName
        field.
        *Method named getLastName without any parameters, it needs to return the value of the lastName
        field.
        *Method named getAge without any parameters, it needs to return the value of the age field.
        *Method named setFirstName with one parameter of type String, it needs to set the value of the
        firstName field.
        *Method named setLastName with one parameter oftype String, it needs to set the value of the
        lastName field.
        *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
        the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
        *Method named isTeen without any parameters, it needs to return true if the value of the age field is
        greaterthan 12 and lessthan 20, otherwise, return false.
        *Method named getFullName without any parameters, it needs to return the full name ofthe person.
        *In case both firstName and lastName fields are empty, Strings return an empty String.
        *In case firstName is an empty String, return firstName.
        *In case lastName is an empty String, return lastName.

        To check if s String is empty, use the method isEmpty from the String class. For example,
        firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
        contain any characters.*/
       public class Program17 {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Program17 person = new Program17();
        person.setFirstName("");//First name set as empty
        person.setLastName("");// Lat name aet as empty
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // First name set
        person.setAge(18);
        System.out.println("First name: " + person.getFirstName());
        System.out.println("teen= " + person.isTeen());
        System.out.println("Last name: " + person.getLastName());
        person.setLastName("Smith"); // lastName is set
        System.out.println("fullName= " + person.getFullName());
    }
}



































