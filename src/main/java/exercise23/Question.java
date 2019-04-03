package exercise23;

public class Question {
    private String text;
    private Question yesQuestion;
    private Question noQuestion;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setYesQuestion(Question yesQuestion) {
        this.yesQuestion = yesQuestion;
    }

    public Question getYesQuestion() {
        return yesQuestion;
    }

    public void setNoQuestion(Question noQuestion) {
        this.noQuestion = noQuestion;
    }

    public Question getNoQuestion() {
        return noQuestion;
    }
}
