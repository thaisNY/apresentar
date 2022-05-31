
public class Employee extends Citizen{
    private int ctps;
    private String role;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String cpf, int ctps, String role, double salary) {
        super( name, cpf);
        this.ctps = ctps;
        this.role = role;
        this.salary = salary;
    }

    public int getCtps(){
        return ctps;
    }
    public void setCtps(int ctps){
        this.ctps = ctps;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return "Name: " +
                getName() +
                "CPF: " +
                getCpf() +
                "CTPS: " +
                ctps +
                "Role: " +
                role +
                "Salary" +
                salary;
    }
}
