package org.iesfm.company;

import java.util.Objects;

public abstract class Employee {
    private int id;
    private String name;
    private String surname;
    private int workedHours;

    public Employee(int id, String name, String surname, int workedHours) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
    }
    public void logWork(int hours){
        workedHours += hours;
    }

    public void info(){
        System.out.println("Datos del empleado");
        System.out.println("id " + id);
        System.out.println("Nombre " + name);
        System.out.println("Apellido "+ surname);
        System.out.println("Horas trabajadas " + workedHours);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    protected abstract void showSpecificInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && workedHours == employee.workedHours && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, workedHours);
    }
}
