package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.wrrrrrrry.evaluationteaching.entity.User;

@Repository
@Transactional
public interface IndexMapper {
    User selectUserInfoByCode(@Param("code") String code);
}
