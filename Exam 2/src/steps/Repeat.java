package steps;

import java.util.List;
import java.util.ArrayList;

public class Repeat extends AbstractStep {
    private int count;
    private List<AbstractStep> steps;

    public Repeat(String description, int count){
        super(description);

        this.count = count;
        this.steps = new ArrayList<>();
    }

    public void addStep(AbstractStep step) {
        this.steps.add(step);
    }

    @Override
    public int getDuration() {
        int duration = 0;
        for (AbstractStep step: this.steps){
            duration += step.getDuration();
        }
        return duration * this.count; // * count to have the total number of minutes
    }

    @Override
    public void display() {
        int duration = this.getDuration(); // instead of calling it twice

        System.out.println(this.description + " " + duration + " minutes"); // we expect duration to be > 1 in general
        System.out.println("Répéter " + count + " fois");
        for (AbstractStep step: this.steps){
            step.display();
        }
        System.out.println(this.description + " " + duration + " minutes : fin" );
    }
}
