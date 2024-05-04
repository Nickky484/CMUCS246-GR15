package cau1;

class Person {
    String id;
    String name;

    public Person() {
        // TODO Auto-generated constructor stub
    }
}

class Instructor extends Person {
    int yearOfExp;

    public Instructor() {
        // TODO Auto-generated constructor stub
    }

    public int getSalary() {
        return 1;
    }
}

class hocsinh extends Person {
    String className;

    public hocsinh() {
        // TODO Auto-generated constructor stub
    }

    public int getScholarship() {
        return 1;
    }
}
