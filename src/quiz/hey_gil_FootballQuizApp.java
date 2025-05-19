package quiz;

import javax.swing.*;

public class hey_gil_FootballQuizApp {
    private JPanel panelMain;
    private JLabel questionLabel;
    private JTextField userAnswerField;
    private JButton enviarButton;
    private JButton nextButton;
    private JLabel feedbackLabel;

    private hey_gil_QuizSet quizSet;
    private hey_gil_Question currentQuestion;
    private int score = 0;
    private int total = 0;

    public hey_gil_FootballQuizApp() {
        hey_gil_QuestionLoader loader = new hey_gil_HardcodedFootballQuestionLoader();
        quizSet = loader.loadQuestions();
        loadNextQuestion();

        enviarButton.addActionListener(e -> checkAnswer());
        nextButton.addActionListener(e -> loadNextQuestion());
    }

    private void checkAnswer() {
        if (currentQuestion != null) {
            String userInput = userAnswerField.getText().trim();
            total++;
            if (userInput.equalsIgnoreCase(currentQuestion.getAnswer())) {
                feedbackLabel.setText("✅ Correct!");
                score++;
            } else {
                feedbackLabel.setText("❌ Wrong. Correct answer: " + currentQuestion.getAnswer());
            }
            enviarButton.setEnabled(false);
        }
    }

    private void loadNextQuestion() {
        if (quizSet.hasMoreQuestions()) {
            currentQuestion = quizSet.getNextQuestion();
            questionLabel.setText("<html>" + currentQuestion.getQuestionText() + "</html>");
            userAnswerField.setText("");
            feedbackLabel.setText("");
            enviarButton.setEnabled(true);
        } else {
            questionLabel.setText("Quiz Finished!");
            feedbackLabel.setText("Final Score: " + score + " / " + total);
            userAnswerField.setEnabled(false);
            enviarButton.setEnabled(false);
            nextButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("hey_gil_FootballQuizApp");
        frame.setContentPane(new hey_gil_FootballQuizApp().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
