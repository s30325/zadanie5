import java.util.ArrayList;
public class Employee {
    public String firstName;
    public String lastName;
    public String adress;
    public String email;
    public String pesel;
    public int employeeYear;
    public Employee(String firstName,String lastName,String adress,String email,String pesel,int employeeYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
        this.pesel = pesel;
        this.employeeYear = employeeYear;
    }
    public int calculateSalary(){
        int basicSalary = 3000;
        basicSalary = 3000+(2024-employeeYear)*1000;
        return basicSalary;
    }


}
