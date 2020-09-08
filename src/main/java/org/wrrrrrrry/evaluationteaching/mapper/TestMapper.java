package org.wrrrrrrry.evaluationteaching.mapper;

import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.User;

@Repository
public interface TestMapper {
    User sel(int id);
}
