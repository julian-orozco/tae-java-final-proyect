package Data;

public class FullTimeTeacher extends Teacher {
    private Double baseSalary;
    private int yearsOfExperience;

    public FullTimeTeacher(String name, Double baseSalary, int yearsOfExperience){
        super(name, baseSalary * (1.1 * yearsOfExperience));
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return String.format("Full-Time teacher:\nName: %s - Base salary: %.2f - Years of experience: %d - Salary: %.2f\n", this.getName(), this.getBaseSalary(), this.getYearsOfExperience(), this.getSalary());
    }
}

