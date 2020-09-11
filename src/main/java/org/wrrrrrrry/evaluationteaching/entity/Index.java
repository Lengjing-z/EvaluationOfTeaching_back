package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class Index {
    private int id;
    private int pNode;
    private String name;
    private double rate;
    private boolean isEnd;
}
