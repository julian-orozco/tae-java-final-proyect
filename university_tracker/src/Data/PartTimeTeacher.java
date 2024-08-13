package Data;

public class PartTimeTeacher extends Teacher{
    private Double baseSalary;
    private int activeHoursWeek;

    public PartTimeTeacher(String name, Double baseSalary, int activeHoursWeek){
        super(name, baseSalary * activeHoursWeek);
        this.baseSalary = baseSalary;
        this.activeHoursWeek = activeHoursWeek;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getActiveHoursWeek() {
        return activeHoursWeek;
    }

    public void setActiveHoursWeek(int activeHoursWeek) {
        this.activeHoursWeek = activeHoursWeek;
    }

    @Override
    public String toString() {
        return String.format("Part time teacher:\nName: %s - Base salary: %.2f - Active hours per week: %d - Salary: %.2f\n", this.getName(), this.getBaseSalary(), this.getActiveHoursWeek(), this.getSalary());
    }
}
