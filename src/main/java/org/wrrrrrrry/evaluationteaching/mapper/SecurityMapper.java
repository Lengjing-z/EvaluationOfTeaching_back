package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.User;

@Repository
public interface SecurityMapper {
    int updatePasswordByCode(@Param("code") String code);

    int modifyMyInfo(@Param("user") User user);
}
