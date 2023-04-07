package org.hank.config;

import org.hank.command.*;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class CommandConfig {

    public CommandConfig() { // CommandHolder 최초 생성 및 등록
        CommandHolder holder = CommandHolder.getInstance();

        List<Commandable> commandables = getCommandables();

        for (Commandable commandable : commandables) {
            holder.getCommandableMap()
                    .put(commandable.getCommandType(), commandable);
        }
    }

    @NotNull
    private static List<Commandable> getCommandables() {
        List<Commandable> commandables = Arrays.asList(
                new RpsCommand(),
                new ReactionCommand(),
                new ImageCommand(),
                new MyLoveCommand()
        );
        return commandables;
    }
}
