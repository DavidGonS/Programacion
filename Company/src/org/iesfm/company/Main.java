package org.iesfm.company;

import org.iesfm.company.exceptions.DepartmentNotFoundException;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    private static Employee getEmployee() {
        return null;
    }

    public static void setSc(Scanner sc) {

    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("1", "alex", "pardal", 28952, "presidente")
        };

        Department[] departments = {
                new Department("Ciencia", employees)
        };

        Company pardalSa = new Company("Pardal SA", "854761B", departments);

        try {
            pardalSa.getDepartmentEmployees("Ciencia");
        } catch (DepartmentNotFoundException e) {
            System.out.println("No se ha encontrado el departamento");
        }
    }
}
