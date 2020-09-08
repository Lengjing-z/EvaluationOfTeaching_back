package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class Power {
    private int id;
    private String name;
    private Boolean is_role;
    private int p_node;
    private Boolean is_end;
}
