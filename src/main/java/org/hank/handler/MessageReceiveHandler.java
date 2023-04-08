package org.hank.handler;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.hank.command.CommandHolder;
import org.hank.command.CommandType;
import org.hank.utils.BotEventUtils;

import java.util.Arrays;

public class MessageReceiveHandler extends ListenerAdapter {
    private final CommandHolder holder = CommandHolder.getInstance();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (BotEventUtils.isBot(event)) {
            return;
        }
        String message = BotEventUtils.extractRawMessage(event);


        if (!message.startsWith("*")) {
//            nonePrefixProcess(event, message);
            return;
        }

        String userMessage = message.substring(1);
        String[] splitedUserMessage = userMessage.split(" ");
        String[] stringWithoutCommand = Arrays.copyOfRange(splitedUserMessage, 1, splitedUserMessage.length);
        String command = splitedUserMessage[0];

        CommandType commandType = CommandType.from(command);
        String optionCommand = String.join(" ", stringWithoutCommand);
        String optionMessage = optionCommand.length() > 0 ? optionCommand : command;

        holder.getCommandableMap()
                .get(commandType)
                .doCommand(event.getChannel(), event.getAuthor(), String.join(" ", optionMessage));
    }

    private void nonePrefixProcess(MessageReceivedEvent event, String message) {
        CommandType reactionCommand = CommandType.from(message);
        holder.getCommandableMap().get(reactionCommand).doCommand(event.getChannel(), event.getAuthor(), message);
    }
}
