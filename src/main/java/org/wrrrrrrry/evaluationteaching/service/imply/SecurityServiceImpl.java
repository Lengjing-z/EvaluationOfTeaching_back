package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.SecurityMapper;
import org.wrrrrrrry.evaluationteaching.service.SecurityService;
@Service
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    SecurityMapper securityMapper;
    @Override
    public int resetPasswordByCode(String code) {
        return securityMapper.updatePasswordByCode(code);
    }

    @Override
    public int modifyMyInfo(User user) {
        return securityMapper.modifyMyInfo(user);
    }
}
