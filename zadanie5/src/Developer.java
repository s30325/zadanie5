import java.util.ArrayList;
class Developer extends Employee {
    public Developer(String firstName, String lastName, String adress, String email, String pesel, int employeeYear) {
        super(firstName, lastName, adress, email, pesel, employeeYear);
    }
    public ArrayList<Technology> technologie = new ArrayList<>();
    public void addTechnology(Technology technology){
        technologie.add(technology);
    }
    @Override
    public int calculateSalary() {
        int basicSalary = super.calculateSalary();
    for(Technology tech : technologie){
        basicSalary += tech.zwrocBonus();
    }
return basicSalary;
    }
}
