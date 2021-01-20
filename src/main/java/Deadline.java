public class Deadline extends Task{
    protected String deadline;

    Deadline(String description, String deadline){
        super(description);
        this.deadline = deadline;
    }

    @Override
    public String toString(){
        return "[D]" + super.toString() + "(by: " + deadline + ")";
    }
}
