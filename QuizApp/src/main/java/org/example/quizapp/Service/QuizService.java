package org.example.quizapp.Service;

import org.example.quizapp.Dao.QuestionDao;
import org.example.quizapp.Dao.QuizDao;
import org.example.quizapp.Model.Question;
import org.example.quizapp.Model.QuestionWrapper;
import org.example.quizapp.Model.Quiz;
import org.example.quizapp.Model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Question> questionList = questionDao.findRandomQuestionsByCategory(category,numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questionList);

        quizDao.save(quiz);
        return new ResponseEntity<>("hehe",HttpStatus.CREATED);

    }


    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionList = quiz.get().getQuestions();
        List<QuestionWrapper> questionWrapperList = new ArrayList<>();

        for (Question q: questionList) {
            QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
             questionWrapperList.add(qw);
        }
        return new ResponseEntity<>(questionWrapperList,HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionList = quiz.get().getQuestions();
        int right=0;
        int i=0;
        for(Response r: responses) {
            if (r.getResponse().equals(questionList.get(i).getRightAnswer())){
                right++;
               i++;
            }
        }
        return new ResponseEntity<>(right,HttpStatus.OK);
    }
}
