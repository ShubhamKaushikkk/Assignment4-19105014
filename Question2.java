class Employee {
    private
    String name;
    int year;
    String address;
    public
    Employee(String a, int b, String c){
        name=a;
        year=b;
        address=c;
    }
    void display(){
        System.out.println(name+"     "+year+"            "+address);
    }
}
public class Question2 {
    public static void main(String []args){
        Employee e1= new Employee("Robert",1994,"64C- WallsStreat");
        Employee e2= new Employee("Sam   ",2000,"68d- WallsStreat");
        Employee e3= new Employee("John  ",1999,"26B- WallsStreat");
        System.out.println("Name     Year of joining       Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
