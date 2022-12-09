package steps;

public class BasicStep extends AbstractStep {
    private int duration;

    public BasicStep(String description, int duration) {
        super(description);
        this.duration = duration;
    }

    @Override
    public int getDuration(){
        return this.duration;
    }

    
    public void display(){
        String str = this.description + " " + this.duration + " minute";
        if (this.duration != 1) str += "s";
        
        System.out.println(str);
    }
  
}
