package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wrrrrrrry.evaluationteaching.entity.*;
import org.wrrrrrrry.evaluationteaching.mapper.QuestionnaireMapper;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional
public class QuestionnaireServiceImpl implements QuestionnaireService {

    @Autowired
    QuestionnaireMapper questionnaireMapper;

    @Override
    public boolean createQuestionnaire(Questionnaire questionnaire) {
        return questionnaireMapper.addQuestionnaire(questionnaire)>0 && questionnaireMapper.addQuestions(questionnaire)>0;
    }

    @Override
    public List<Questionnaire> allQuestionnaire(String start, String length) {
        return questionnaireMapper.queryAllQuestionnaire(start,length);
    }

    @Override
    public Map<String, Object> queryQuestionnaireDetail(Integer qnId) {
        Map<String,Object> result = new HashMap<>();
        result.put("questions",questionnaireMapper.queryQuestionsByQnId(qnId));
        result.put("indicators", queryIndicatorDetail(questionnaireMapper.queryIndicatorRootByQnId(qnId)));
        return result;
    }

    @Override
    public int deleteQuestionnaire(Integer qnId) {
        return questionnaireMapper.deleteQuestionnaire(qnId);
    }

    @Override
    public boolean releaseQuestionnaireInstitute(List<TeacherToTeacher> ttts) {
        questionnaireMapper.addTTT(ttts);
        List<User> teachers = questionnaireMapper.queryTeachersByInids(ttts);
        List<Message> messages = new ArrayList<>();
        ttts.forEach(ttt->{
            List<User> group =  teachers.stream().filter(item->item.getInId() == ttt.getInId()).collect(Collectors.toList());
            group.forEach(x->group.forEach(y->{
                if (!x.equals(y)) messages.add(Message.builder().uId(x.getId()).targetId(y.getId()).tttId(ttt.getId()).context("???").build());
            }));
        });
        questionnaireMapper.addMessages(messages);
        return true;
    }

    @Override
    public Object releaseQuestionnaireCourse(int questionnaireId, List<Course> courses) {
        // Todo
        return null;
    }

    @Override
    public Object getStudentQuestionnaireDetail(int questionnaireId) {
        // Todo
        return null;
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
    public List<Index> queryIndicatorDetail(Index index) {
        List<Index> queue = new ArrayList();
        queue.add(questionnaireMapper.queryIndicatorRootById(index));
        int i = 0;
        while (i < queue.size()){
            if (!queue.get(i).isEnd())
            queue.addAll(questionnaireMapper.queryIndicatorsByPaNode(queue.get(i)));
            i++;
        }
        return queue;
    }
}
