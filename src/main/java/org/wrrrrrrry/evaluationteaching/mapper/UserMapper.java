package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.User;

@Repository
public interface UserMapper {
    // 根据code查询用户信息及其拥有的权限
    User queryUserAndAuthoritiesByCode(@Param("code") String code);

}