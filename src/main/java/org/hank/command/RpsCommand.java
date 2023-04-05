package org.hank.command;

import net.dv8tion.jda.api.entities.MessageChannel;
import org.hank.command.Commandable;

public class RpsCommand implements Commandable {
    @Override
    public void doCommand(MessageChannel channel, String message) {
        // !도박 [가위,바위,보]
        String rawMessage = message.substring(1);
        String[] splited = rawMessage.split(" ");

        int computer = (int) Math.round(Math.random() * 3);

        if (splited.length != 2) {
            return;
        }

        if (splited[1].equals("가위")) {
            if (computer == 0) {
                channel.sendMessage("비겼습니다!").queue();
            } else if (computer == 1) {
                channel.sendMessage("졌습니다!").queue();
            } else {
                channel.sendMessage("이겼습니다!").queue();
            }
        } else if (splited[1].equals("바위")) {
            if (computer == 0) {
                channel.sendMessage("이겼습니다!").queue();
            } else if (computer == 1) {
                channel.sendMessage("비겼습니다!").queue();
            } else {
                channel.sendMessage("졌습니다!").queue();
            }
        } else if (splited[1].equals("보")) {
            if (computer == 0) {
                channel.sendMessage("졌습니다!").queue();
            } else if (computer == 1) {
                channel.sendMessage("이겼습니다!").queue();
            } else {
                channel.sendMessage("비겼습니다!").queue();
            }
        }
    }

    @Override
    public String getCommandType() {
        return "가위바위보";
    }
}
