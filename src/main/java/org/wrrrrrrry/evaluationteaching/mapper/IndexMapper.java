package org.wrrrrrrry.evaluationteaching.mapper;

import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.User;

@Repository
public interface IndexMapper {
    User selectUserInfoByCode(String code);
}
