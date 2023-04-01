package org.hank;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReceiveHandler extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }


        String message = event.getMessage().getContentRaw();
        char commandType = message.charAt(0);
        if (commandType == '$') {
            String botMessage = message.substring(1);
            event.getChannel().sendMessage("고쥬사마, " + botMessage).queue();
        }

    }
}
