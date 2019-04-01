package Staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private Double salary;


    public Employee(String name, String NINumber, Double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name != ""){
            this.name = name;
        }
    }

    public String getNINumber(){
        return this.NINumber;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void raiseSalary(Double salaryIncrement){
        if (salaryIncrement > 0) {
            this.salary += salaryIncrement;
        }
    }

    public Double payBonus() {
        return (this.salary * 1/100);
    }





}
