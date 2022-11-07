package quiz2;

import java.util.ArrayList;

public class MultipleChoiceQuestion {
    private String questionText;
    private ArrayList<Answer> answers;

    public MultipleChoiceQuestion(String questionText) {
        this.questionText   = questionText;
        this.answers        = new ArrayList<>();
    }

    public void addAnswer(Answer a) {
        this.answers.add(a);
    }

    public double answersPercentsSum() {
        double prc = 0;
        for (Answer a: this.answers){
            prc += a.getPercent();
        }
        return prc;
    }

    public boolean isValid() {
        return this.answersPercentsSum() == 100;
    }

    public void showToStudent(){
        System.out.println(this.questionText);
        for (int i = 0; i < this.answers.size(); i++){
            System.out.println((i+1) + ". " + this.answers.get(i).getText());
        }
    }

    public void showToTeacher(){
        System.out.println(this.questionText);
        for (int i = 0; i < this.answers.size(); i++){
            System.out.println(this.answers.get(i).getPercent() + "\t" + (i+1) + ". " + this.answers.get(i).getText());
        }
    }

}