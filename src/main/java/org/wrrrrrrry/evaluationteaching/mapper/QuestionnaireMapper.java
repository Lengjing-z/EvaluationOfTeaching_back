package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.Index;

import java.util.List;

@Repository
public interface QuestionnaireMapper {
    int addIndicator(@Param("list") List<Index> indexList);
    int queryCurrentMaxId();

    int deleteIndicator(@Param("indicator") Index index);

    List<Index> queryAllIndicator();

    List<Index> queryIndicatorsByPaNode(@Param("parent") Index index);
}
