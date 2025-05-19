package quiz;

public class hey_gil_HardcodedFootballQuestionLoader implements hey_gil_QuestionLoader {
    @Override
    public hey_gil_QuizSet loadQuestions() {
        hey_gil_QuizSet set = new hey_gil_QuizSet();
        set.addQuestion(new hey_gil_Question("Who won the 2010 FIFA World Cup?", "Spain"));
        set.addQuestion(new hey_gil_Question("How many Ballon d'Or titles does Lionel Messi have?", "8"));
        set.addQuestion(new hey_gil_Question("Which country has the most World Cup titles?", "Brazil"));
        set.addQuestion(new hey_gil_Question("Which club did Cristiano Ronaldo play for before Real Madrid?", "Manchester United"));
        set.addQuestion(new hey_gil_Question("Who is the top goal scorer in World Cup history?", "Miroslav Klose"));
        set.addQuestion(new hey_gil_Question("What is the nickname of the Argentine national team?", "La Albiceleste"));
        set.addQuestion(new hey_gil_Question("What country hosted the 2006 FIFA World Cup?", "Germany"));
        set.addQuestion(new hey_gil_Question("Which country won the 2022 FIFA World Cup?", "Argentina"));
        set.addQuestion(new hey_gil_Question("Which club is known as 'The Reds' in the Premier League?", "Liverpool"));
        set.addQuestion(new hey_gil_Question("How many players are on the field for one team during a football match?", "11"));
        return set;
    }
}
