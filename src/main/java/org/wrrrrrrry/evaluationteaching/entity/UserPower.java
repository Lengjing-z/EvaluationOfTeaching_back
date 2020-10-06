package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class UserPower {
    private int id;
    private Integer uId;
    private Integer pId;

    public UserPower(int uId, int pId) {
        this.uId = uId;
        this.pId = pId;
    }
}
