package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.User;

public interface SecurityService {
    int resetPasswordByCode(String code);

    int modifyMyInfo(User user);
}
