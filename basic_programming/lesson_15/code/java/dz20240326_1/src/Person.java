public class Person {
    String firstName;
    String lastName;
    MyDate birthday;

    public Person(String firstName, String lastName, MyDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return firstName + ' ' +  lastName + " ("  +  birthday + ')';
    }

    public  String toSmallString(){
        return lastName + " " + firstName.charAt(0) + ".";
    }
}
