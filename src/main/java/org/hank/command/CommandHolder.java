package org.hank.command;

import java.util.HashMap;
import java.util.Map;

public class CommandHolder {

    private static CommandHolder INSTANCE = null;
    private final Map<CommandType, Commandable> commandableMap = new HashMap<>();

    private CommandHolder() {

    }

    public static CommandHolder getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CommandHolder();
        }

        return INSTANCE;
    }

    public Map<CommandType, Commandable> getCommandableMap() {
        return commandableMap;
    }

}
