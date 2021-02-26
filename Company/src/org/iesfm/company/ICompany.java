package org.iesfm.company;

import org.iesfm.company.exceptions.DepartmentNotFoundException;

public interface ICompany {
    Employee[] getDepartmentEmployees(String departmentName) throws DepartmentNotFoundException;
}
