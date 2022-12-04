package org.task1;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@ToString
//@Builder
@SuperBuilder
public class User extends Human{
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
//    @Singular(value = "my_job")
    @Singular
    private List<String> occupations;



}