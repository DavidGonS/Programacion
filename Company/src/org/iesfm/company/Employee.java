package org.iesfm.company;

public class Employee {
    private String nif;
    private String name;
    private String surname;
    private int cp;
    private String role;

    public Employee(String nif, String name, String surname, int cp, String role) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.cp = cp;
        this.role = role;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
