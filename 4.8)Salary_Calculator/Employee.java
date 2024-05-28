import com.sun.source.tree.ReturnTree;

public class Employee {
    private static final int TAX_PERCENTAGE = 3;
    private static final int BONUS_PER_HOUR = 30;
    private static final int CURRENT_YEAR = 2021;
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(){
        return this.salary * TAX_PERCENTAGE / 100;
    }
    int bonus(){
        if(this.workHours > 40){
            int extraHour = this.workHours % 40;
            return extraHour * 30;
        }
        return 0;
    }
    int raiseSalary(){
        int yearsWorked = CURRENT_YEAR - this.hireYear;
        int raise = 0;
        if(yearsWorked < 10){
            raise += this.salary * 5/100;
        }else if(yearsWorked < 20){
            raise += this.salary * 10 / 100;
        } else if (yearsWorked >= 20){
            raise += this.salary * 15 / 100;
        }
        return raise;
    }
    int calculateTotalSalary(){
        int tax = tax();
        int bonus = bonus();
        int raise = raiseSalary();
        return this.salary + bonus + raise - tax;
    }
    public String toString(){
        return "Name: " + this.name + "\nSalary: " + this.salary + "\nwork Hours: " + workHours +
                "\nStart Year: " + hireYear + "\ntax: " + tax() + "\nBonus: " + bonus() +
                "\nSalary Increase: " + raiseSalary() + "\nSalary with Tax and Bonuses: " +
                (this.salary - tax() + bonus()) + "\nTotal Salary: " + calculateTotalSalary();
    }
}
