package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {

    private String procesor;
    private String ram;
    private String garphicsCard;
    private String company;
    private String model;

    public Computer() {

    }

    public Computer(String procesor, String ram, String garphicsCard, String company, String model) {
        this.procesor = procesor;
        this.ram = ram;
        this.garphicsCard = garphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGarphicsCard() {
        return garphicsCard;
    }

    public void setGarphicsCard(String garphicsCard) {
        this.garphicsCard = garphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram='" + ram + '\'' +
                ", garphicsCard='" + garphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return procesor.equals(computer.procesor) && ram.equals(computer.ram) && garphicsCard.equals(computer.garphicsCard) && company.equals(computer.company) && model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, ram, garphicsCard, company, model);
    }
}
