public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description)
    {
        this.description = description;
        isDone = false;
    }

    public String GetDescription()
    {
        return description;
    }

    public void SetDescription(String description)
    {
        this.description = description;
    }

    public Boolean GetisDone()
    {
        return isDone;
    }

    public void SetisDone(boolean isDone) {
        this.isDone = isDone;
    }

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}
