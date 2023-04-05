package org.hank.command;

import net.dv8tion.jda.api.entities.MessageChannel;

public interface Commandable {
    void doCommand(MessageChannel channel, String userMessage);

    String getCommandType();
}
