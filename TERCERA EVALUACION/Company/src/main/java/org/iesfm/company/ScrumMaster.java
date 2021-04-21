package org.iesfm.company;

import java.util.HashSet;
import java.util.Objects;

public class ScrumMaster extends Employee{
    private HashSet<String> teams;

    public ScrumMaster(int id, String name, String surname, int workedHours, HashSet<String> teams) {
        super(id, name, surname, workedHours);
        this.teams = teams;
    }

    @Override
    protected void showSpecificInfo() {
        System.out.println("Equipos: ");
        for (String team: teams) {
            System.out.println(team);
        }
    }

    public HashSet<String> getTeams() {
        return teams;
    }

    public void setTeams(HashSet<String> teams) {
        this.teams = teams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ScrumMaster that = (ScrumMaster) o;
        return Objects.equals(teams, that.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teams);
    }
}
