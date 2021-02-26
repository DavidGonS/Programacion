package org.iesfm.company;

import org.iesfm.company.exceptions.DepartmentNotFoundException;

public class Company implements ICompany {
    private String name;
    private String cif;
    private Department[] departments;

    public Company(String name, String nif, Department[] departments) {
        this.name = name;
        this.cif = nif;
        this.departments = departments;
    }

    @Override
    public Employee[] getDepartmentEmployees(String departmentName) throws DepartmentNotFoundException {
        Department department = findDepartment(departmentName);
        if (department != null) {
            return department.getEmployees();
        } else {
            throw new DepartmentNotFoundException();
        }
    }

    public Department findDepartment(String departmentName) {
        Department result = null;
        for (int i = 0; i < departments.length; i++) {
            Department department = departments[i];
            if (department.getName().equals(departmentName)) {
                result = department;
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}
