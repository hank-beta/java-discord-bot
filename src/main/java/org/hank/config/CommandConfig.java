package org.hank.config;

import org.hank.command.Commandable;
import org.hank.command.ReactionCommand;
import org.hank.command.RpsCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandConfig {
    Map<String, Commandable> commandableMap = new HashMap<>();

    public CommandConfig() { // 생성자
        commandableMap.put("*도박", new RpsCommand());
        commandableMap.put("", new ReactionCommand());
    }

    public Commandable getCommand(String commandPrefix) {
        if (commandableMap.containsKey(commandPrefix)) {
            return commandableMap.get(commandPrefix);
        } else {
            return commandableMap.get("");
        }

    }

}
