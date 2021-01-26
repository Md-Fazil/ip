package duke;

import java.io.IOException;

/**
 * Represents a bye command keyed in by the user.
 */
public class ByeCommand extends Command{

    ByeCommand(String[] parsedAction) {
        super(parsedAction);
    }

    /**
     * Executes the bye command by getting ui to print the goodbye message.
     *
     * @param taskManager TaskManager object that maintains the list of tasks.
     * @param ui Ui object that handles user interaction.
     * @param storage Storage object that handles the updating of stored file.
     */
    public void execute(TaskManager taskManager, Ui ui, Storage storage) {
        ui.showByeMessage();
    }

    @Override
    public boolean isExit() {
        return true;
    }

}
