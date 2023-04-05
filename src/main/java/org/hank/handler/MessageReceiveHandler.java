package org.hank.handler;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.hank.command.Commandable;
import org.hank.config.CommandConfig;
import org.hank.utils.BotEventUtils;

public class MessageReceiveHandler extends ListenerAdapter {
    CommandConfig commandConfig = new CommandConfig();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (BotEventUtils.isBot(event)) {
            return;
        }

        String commandPrefix = BotEventUtils.extractRawMessage(event).split(" ")[0];
        Commandable command = commandConfig.getCommand(commandPrefix);
        command.doCommand(event.getChannel(), BotEventUtils.extractRawMessage(event));
    }
}
