package com.teksystems;



    class Employee {
    public long employeeId;
    public String employeeName;
    public String employeeAddress;
    public long employeePhone;
    public double basicSalary;
    public double specialAllowance = 250.80d;
    public double hra = 1000.50d;

    Employee(long id, String name,
                    String address, long phone) {
        id = employeeId;
        name = employeeName;
        address = employeeAddress;
        phone = employeePhone;
    }

    public double calculateSalary() {
        return  basicSalary + (basicSalary * specialAllowance / 100)
                + (basicSalary * hra / 100);

    }

    public double calculateTransportAllowance(){
        return basicSalary * .1;
    }

        public double calculateTransportAllowanceManager(){
            return basicSalary * .15;
        }


}

class Trainee extends Employee {
    public Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;

    }
}

    class Manager extends Employee{
        public Manager (long id, String name, String address, long phone, double salary){
            super(id, name, address, phone);
            basicSalary = salary;

        }


}
public class InheritanceActivity {
    public static void main(String[] args) {
        Employee peter = new Manager(126534, "Peter", "Chennai India", 237844, 65000 );
        System.out.println(peter);
        System.out.println(peter.calculateSalary());
        Employee jack = new Trainee(29046, "jack", "Mumbai India", 442085, 45000);
        System.out.println(jack.calculateSalary());
        System.out.println(jack.calculateTransportAllowance());
        System.out.println(peter.calculateTransportAllowanceManager());
    }
}
