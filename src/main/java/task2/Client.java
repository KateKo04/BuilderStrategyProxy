package task2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

enum Gender {
    MALE, FEMALE
}

public class Client {
    @Getter
    private int id;
    private static int count = 0;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender sex;

    public Client(String name, Gender sex, int age){
        id = ++count;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
