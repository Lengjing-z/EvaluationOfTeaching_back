package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.IndexMapper;
import org.wrrrrrrry.evaluationteaching.service.IndexService;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public User queryMyInfo(String code) {
        return indexMapper.selectUserInfoByCode(code);
    }
}
