package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrrrrrrry.evaluationteaching.entity.Index;
import org.wrrrrrrry.evaluationteaching.mapper.QuestionnaireMapper;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

    @Autowired
    QuestionnaireMapper questionnaireMapper;

    @Override
    public boolean createQuestionnaire(Map questionnaire) {
        System.out.println(questionnaire);
        return false;
    }

    public int createIndicator(List<Index> indexList) {
        Integer maxId = questionnaireMapper.queryCurrentMaxId();
        indexList.forEach(item->{
            item.setId(item.getId()+maxId);
            if (item.getPaNode()!=null){
                item.setPaNode(item.getPaNode()+maxId);
            }
        });
        System.out.println(indexList);
        return questionnaireMapper.addIndicator(indexList);
    }

    @Override
    public int deleteIndicator(Index index) {
        return questionnaireMapper.deleteIndicator(index);
    }

    @Override
    public List<Index> allIndicator() {
        return questionnaireMapper.queryAllIndicator();
    }

    @Override
    public List<Index> queryDetail(Index index) {
        List<Index> queen = new ArrayList();
        queen.add(index);
        int i = 0;
        while (i < queen.size()){
            if (!queen.get(i).isEnd())
            queen.addAll(questionnaireMapper.queryIndicatorsByPaNode(queen.get(i)));
            i++;
        }
        return queen;
    }
}
