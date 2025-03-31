/** Create an Employee class that extends the
 *  Person class.  An employee has a jobTitle,
 *  and a salary.
 */
public class Employee extends Person
{
    private String jobTitle;
    private int salary;

    public Employee(String name, int age, String jobTitle, int salary)
    {
        super(name, age); // Person(String, int)
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public Employee(String jobTitle, int salary)
    {
        this("John Doe", 0, jobTitle, salary);
    }

    public Employee()
    {
        this("John Doe", 0, "Unemployed", 0);
    }

}