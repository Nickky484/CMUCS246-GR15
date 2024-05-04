package cau2;

class Employee {
    String Name;
    String ID;
    int level;

    public void computeSalary() {
        System.out.println("The salary of Employee");
    }
}

class Coder extends Employee {
    public void computeSalary() {
        System.out.println("The salary of Coder");
    }
}

class Manager extends Employee {
    public void computeSalary() {
        System.out.println("The salary for Manager");
    }
}
