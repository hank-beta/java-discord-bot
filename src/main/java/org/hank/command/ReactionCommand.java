package org.hank.command;

import net.dv8tion.jda.api.entities.MessageChannel;

import static org.hank.utils.BotEventUtils.sendMessage;

public class ReactionCommand implements Commandable {
    @Override
    public void doCommand(MessageChannel channel, String userMessage) {
        if (userMessage.equals("*사랑해")) {
            sendMessage(channel, "오니짱~~");
        }


        if (userMessage.equals("*안녕")) {
            sendMessage(channel, "안녕하세요.");
        }
    }

    @Override
    public String getCommandType() {
        return "반응";
    }


}
