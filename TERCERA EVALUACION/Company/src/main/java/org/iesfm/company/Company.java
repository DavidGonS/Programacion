package org.iesfm.company;

import java.util.*;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Programmer> getProgrammers(){
        List<Programmer> programmers = new ArrayList<>();
        for (Employee employee: employees){
            if (employee instanceof Programmer){
                Programmer programmer = (Programmer) employee;
                programmers.add(programmer);
            }
        }
        return programmers;
    }

    public List<ProjectManager> getProjectManagers(){
        List<ProjectManager> managers = new LinkedList<>();
        for (Employee employee : employees){
            if (employee instanceof ProjectManager){
                managers.add((ProjectManager) employee);
            }
        }
        return managers;
    }

    public List<ScrumMaster> getScrumMaster(){
        List<ScrumMaster> scrumMasters = new LinkedList<>();
        for (Employee employee: employees){
            if (employee instanceof ScrumMaster){
                scrumMasters.add((ScrumMaster) employee);
            }
        }
        return scrumMasters;
    }

    public List<String> getProjects(){
        List<ProjectManager> projectManagers = getProjectManagers();
        List<String> projects = new ArrayList<>();
        for (ProjectManager projectManager : projectManagers){
            projects.addAll(projectManager.getProjects());
        }
        return projects;
    }

    public Set<String> getTeams(){
        Set<String> teams = new HashSet<>();
        List<ScrumMaster> scrumMasters = getScrumMaster();
        for (ScrumMaster scrumMaster : scrumMasters){
            teams.addAll(scrumMaster.getTeams());
        }
        return teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }
}
