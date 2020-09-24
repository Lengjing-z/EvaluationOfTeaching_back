package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.entity.UserPower;

import java.util.List;

public interface SecurityService {
    int resetPasswordByCode(String code);

    int modifyMyInfo(User user);

    int powerAdd(List<UserPower> userPowers);

    int powerDel(List<UserPower> userPowers);

    List<UserPower> queryUserPowerAll();
}
