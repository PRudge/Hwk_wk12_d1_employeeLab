package Management;

import Management.Director;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String NInumber, Double salary, String deptName, Double budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
    
}

