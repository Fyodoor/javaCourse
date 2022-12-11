package lesson_10;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println("Пойдём гулять");
        if (isMuzzlePutOn && isCollarPutOn && isLeashPutOn) {
            System.out.println("Ура, " + name + ", идём гулять!");
        } else {
            throw  new DogIsNotReadyToWalkException("Собака не готова гулять");
        }
    }
}
