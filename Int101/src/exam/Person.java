package exam;

public class Person {
//    1. Create a Person class in "exam" package containing
//    the following instance variables, which are all private:
//    (1) code: int (cannot be changed after initialization).
    public static int nextCode = 99;
    private final int code;
//    (2) firstname: String.
    private String firstname;
//    (3) lastname: String.
    private String lastname;
//    (4) type: int (cannot be changed after initialization).
    private final int  type;

//    1.1) Create a contructor: Person(String firstname, String lastname, int type).
    public Person(String firstname, String lastname, int type) {
        this.firstname = (firstname != null || firstname.isBlank()) ? firstname : "Chanapol";
        this.lastname = (lastname != null || lastname.isBlank()) ? lastname : "Puntuvadee";
        this.type = (type < 0) ? 1 : type;
        this.code = nextCode++;
    }
//    1.2) Create another constructor: Person(String firstname, String lastname).
//    Use the default value for type as stated in 1.1. Avoid duplicate coding.

    public Person(String firstname, String lastname) {
        this(firstname,lastname, 1);
    }
//    1.3) Create all four public getters and two public setters for firstname and lastname.
//    Do not change the firstname or the lastname if the input argument is null or blank.

    public int getCode() {
        return code ;
    }

    public String getFirstname() {
        return this.firstname = firstname;
    }

    public String setFirstname(String firstname) {
        return this.firstname = (firstname == null || firstname.isBlank()) ? firstname : "Chanapol";
    }

    public String setLastname(String lastname) {
        return this.lastname = (lastname == null || lastname.isBlank()) ? lastname : "Puntuvadee";
    }

    public String getLastname() {
        return this.lastname = lastname;
    }

    public int getType() {
        return type;
    }
//    1.4) Override toString() method to return a string representation in this format:
//    [Person: CODE (FIRSTNAME LASTNAME) TYPE] where CODE, FIRSTNAME,
//    LASTNAME, and TYPE are code, firstname, lastname, and type of the person.

    @Override
    public String toString() {
        return String.format(" [Person: %d (%s %s) %d]",code,firstname,lastname,type);
    }
//    1.5) Override equals(Object obj) method, so that two person objects are equal
//    when they have the same code.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Person other = (Person) o;
        return code == other.code;
    }

}
