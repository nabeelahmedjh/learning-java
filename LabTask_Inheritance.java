class Employee {
    String name;
    int salery;

    Employee(String name, int salery) {
        setName(name);
        setSalery(salery);
    }

    Employee() {
        System.out.println("Hello, from Defualt constructor");
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSalery(int salery) {
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public int getSalery() {
        return salery;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salery: " + salery);
    }
}

public class LabTask_Inheritance {

    public static void main(String[] args) {
        Employee e = new Employee("Nabeel", 300_000);
        e.display();
    }

}
