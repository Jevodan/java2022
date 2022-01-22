public class lesson5 {

    public static void main(String[] args) {
        Employe[] emp = new Employe[5];
        emp[0] = new Employe("Костров Александр", "директор", "sanne80@mail.ru", "+79202543576", 130000, 41);
        emp[1] = new Employe("Чагорская Ольга", "учредитель", "ch74@mail.ru", "+79202544587", 150000, 47);
        emp[2] = new Employe("Махнева Надежда", "бухгалтер", "nady@mail.ru", "+7924356894", 30000, 33);
        emp[3] = new Employe("Баранова Наталия", "организатор", "nathalie@yandex.ru", "+79202151676", 420000, 44);
        emp[4] = new Employe("Салищева Алена", "стажер", "sali@mail.ru", "+7920255600", 15000, 20);

        for (Employe employes : emp) {
            if (employes.getAge() > 40)
                employes.printEmploye();

        }
    }


}
