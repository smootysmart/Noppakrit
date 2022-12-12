package exam;

public class Department {
    private static int nextCode= 400;
    private int code;
    private final String title;
    private Person[] staff;
    private int count; // for keeping track of the number of staff in the array.

//    2.1) Create a constructor: Department(String title) where

    public Department(String title) {
        this.title = (title == null || title.isBlank()) ? "old school" : title;
        code = nextCode++;
        this.staff = new Person[10];
    }
//    2.2) Create three public getters for code, title, and count. No setter.
        public int getCode() {
            return code;
        }

        public String getTitle() {
            return title;
        }

        public int getCount() {
            return count;
        }
//        2.3) Create a public method: addStaff(String firstname, String lastname, int type).
//    This method will create a Person (without checking the type), add this person
//    into the staff array, and return true. However, if the array is full or the firstname
//    or the lastname is null or blank, do not create a Person but return false instead.
    public boolean addStaff(String firstname, String lastname, int type){
        if (firstname == null || firstname.isBlank()) {
            return false;
        }if (lastname == null || lastname.isBlank()){
            return false;
        }if (staff.length == count){
            return false;
        }
        staff[count++] = new Person(firstname,lastname,type);
        return true;
    }
//    2.4) Create a public method: getTypeCount(int type): int. This method will return
//    the number of staffs that have type equals to the input argument.
    public int getTypeCount(int type){
        int typecount = 0;
        for (int i = 0; i < count ; i++){
            if (staff[i].getType() == type){
                typecount++;
            }
        }
        return typecount;
    }
//    2.5) Create a public method: getAllCodes(): int[]. This method will return an array
//    containing the codes of all staffs and the size of the array must be the same as
//    the number of staffs in the department.
    public int[] getAllCodes(){
        int[] result = new int[count];
        for (int i = 0; i < count ; i++){
            result[i] = staff[i].getCode();


            }
            return result;
        }
//    2.6) Create a public method: getStaff(int code): Person. This method will return
//    the person in the staff array that match the code in the argument.
//    Null will be returned if no staff with that code.
    public Person getStaff(int code){
        for (int i = 0; i < count ; i++){
            if (staff[i].getCode() == code){
                return staff[i];
            }
        }
        return null;
    }
//    2.7) Override a public method: toString(): String. This method will return
//    a string representation of the department in the following format.
//    [Department: CODE (TITLE) COUNT] where CODE, TITLE, and COUNT
//    are the code, the title, and the number of staffs in the department respectively.


    @Override
    public String toString() {
        return String.format("[Department: %d (%s) %d]",code,title,count);
    }
//    2.8) Create a public method: getAllTypes(): int[]. This method will return an array
//    containing all types of staffs in the department. Make sure that there are
//    no duplicate types in the array and the size of the array equals to the number
//    of distinct types.
    public int[] getAllTypes(){
        int[] temp = new int[count];
        int typeCount =0;
        for (int i = 0;i < count;i++){
            if (isUnique(temp, staff[i].getType())) {
                temp[typeCount++] = staff[i].getType();
            }
        }
        int[] result = new int[typeCount];
        for(int i = 0; i < typeCount;i++){
            result[i] = temp[i];
        }
        return result;
    }
    public boolean isUnique(int[] temp,int i){
        for (int s = 0;s < count;s++){
            if(temp[s] == i){
                return false;
            }
        }
        return true;
    }
}
