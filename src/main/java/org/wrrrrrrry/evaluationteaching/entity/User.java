package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    private int in_id;
    private String code;
    private String sex;
    private int age;
    private int height;
    private String addr;
    private String intr;
    private List<Power> powers;
}
