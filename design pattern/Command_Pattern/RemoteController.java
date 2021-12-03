package Command_Pattern;

public class RemoteController {
    Command[] onCommand;
    Command[] offCommand;

    Command undoCommand;

    public RemoteController()
    {
        onCommand = new Command[5];
        offCommand = new Command[5];
        for (int i =0; i < 5; i++)
        {
            offCommand[i] = new NoCommand();
            onCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command oncommand, Command Offcommand)
    {
        onCommand[no] = oncommand;
        offCommand[no] = Offcommand;
    }

    public void onButtonWasPushed(int no)
    {
        onCommand[no].execute();
        undoCommand = onCommand[no];
    }

    public void offButtonWasPushed(int no)
    {
        offCommand[no].execute();
        undoCommand = offCommand[no];
    }

    public void UndoButtonWasPushed()
    {
        undoCommand.undo();
    }
}
