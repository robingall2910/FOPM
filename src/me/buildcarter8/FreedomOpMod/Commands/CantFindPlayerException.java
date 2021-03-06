package me.buildcarter8.FreedomOpMod.Commands;

@SuppressWarnings("serial")
public class CantFindPlayerException extends Exception
{
    public CantFindPlayerException()
    {
        super("Can't find player.");
    }

    public CantFindPlayerException(String msg)
    {
        super("Can't find player: " + msg);
    }
}
