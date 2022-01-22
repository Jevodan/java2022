public class Employe {

    private String name;
    private String position;
    private String mail;
    private String tele;
    private int salary;
    private int age;

    public Employe(String name, String position, String mail, String tele, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.tele = tele;
        this.salary = salary;
        this.age = age;
    }

    public void printEmploye() {
        System.out.println("Секретная информация о тех, кому за 40:{" +
                "Имя='" + name + '\'' +
                ", должность='" + position + '\'' +
                ", почта='" + mail + '\'' +
                ", телефон='" + tele + '\'' +
                ", зарплата=" + salary +
                ", возраст=" + age +
                '}');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
