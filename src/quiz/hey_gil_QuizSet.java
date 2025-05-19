package quiz;

import java.util.ArrayList;

public class hey_gil_QuizSet {
    private ArrayList<hey_gil_Question> questions;
    private int currentIndex = 0;

    public hey_gil_QuizSet() {
        questions = new ArrayList<>();
    }

    public void addQuestion(hey_gil_Question q) {
        questions.add(q);
    }

    public hey_gil_Question getNextQuestion() {
        if (currentIndex < questions.size()) {
            return questions.get(currentIndex++);
        }
        return null;
    }

    public boolean hasMoreQuestions() {
        return currentIndex < questions.size();
    }

    public void reset() {
        currentIndex = 0;
    }
}
