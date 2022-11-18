package lesson_05;

public class Contact {

    // 1. Поля

    private  String name;
    private  String phone;
    private  String email;

    // 2. Конструкторы

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    // 3. Методы

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
