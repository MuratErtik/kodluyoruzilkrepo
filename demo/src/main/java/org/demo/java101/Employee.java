package org.demo.java101;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workingYears = currentYear - this.hireYear;

        if (workingYears < 10) {
            return this.salary * 0.05;
        } else if (workingYears >= 10 && workingYears < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = this.salary + raise;

        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus +
                "\nToplam Maaş : " + totalSalary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(e1.toString());
    }
}