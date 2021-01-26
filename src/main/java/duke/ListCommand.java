package duke;

/**
 * Represents a list command keyed in by the user.
 */
public class ListCommand extends Command {

    ListCommand(String[] parsedCommand) {
        super(parsedCommand);
    }

    /**
     * Executes the list command by printing all the tasks to the user.
     *
     * @param taskManager TaskManager object that maintains the list of tasks.
     * @param ui Ui object that handles user interaction.
     * @param storage Storage object that handles the updating of stored file.
     */
    public void execute(TaskManager taskManager, Ui ui, Storage storage) {
        ui.showAllTasks(taskManager.getList());
    }
}
