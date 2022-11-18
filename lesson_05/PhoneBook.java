package lesson_05;

public class PhoneBook {

    // 1. Поля
    private Contact [] contacts = new Contact[10];

    // 2. Конструктор

    // 3. Методы
    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null){
                contacts[i] = contact;
                break;
            }
        }
    }

    public void viewAllCont () {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].getName() + " " + contacts[i].getName());
        }
    }

    public void renameContact(String original, String renamed) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(original)) {
                contacts[i].setName(renamed);
                break;
            }
        }
    }


    public void deleteContact(String deleteName) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(deleteName)) {
                contacts[i] = null;
                break;
            }
        }
    }

    public void findContact(String findName) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equalsIgnoreCase(findName)) {
                System.out.println(contacts[i].getName());
                break;
            }
        }
    }


}
