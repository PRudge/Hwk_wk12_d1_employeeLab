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
        this.name = name;
    }

    public String getNINumber(){
        return this.NINumber;
    }

    public void setNINumber(String NINumber){
        this.NINumber = NINumber;

    }

    public Double getSalary(){
        return this.salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void raiseSalary(Double salaryIncrement){

       this.salary += salaryIncrement;
    }

    public Double payBonus() {
        return (this.salary * 1/100);
    }





}
