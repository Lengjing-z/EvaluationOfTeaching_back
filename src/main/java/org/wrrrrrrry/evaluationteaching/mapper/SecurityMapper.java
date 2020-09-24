package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.entity.UserPower;

import java.util.List;

@Repository
public interface SecurityMapper {
    int updatePasswordByCode(@Param("code") String code);

    int modifyMyInfo(@Param("user") User user);

    int powerAdd(@Param("userPowers") List<UserPower> userPowers);

    int powerDel(@Param("userPowers") List<UserPower> userPowers);

    List<UserPower> selectUserPowerAll();
}
