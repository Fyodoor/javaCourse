package lesson_12.additional;

public class Specialist {
    //fields

    private String name;
    private Integer salary;
    private Specialty specialty;

    //constructor


    public Specialist(String name, Integer salary, Specialty specialty) {
        this.name = name;
        this.salary = salary;
        this.specialty = specialty;
    }

    //method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", specialty=" + specialty +
                '}';
    }
}
