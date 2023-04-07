package org.hank.command;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import org.hank.Main;

import java.io.IOException;
import java.io.InputStream;

public class ImageCommand implements Commandable {

    @Override
    public void doCommand(MessageChannel channel, User user, String userMessage) {
        InputStream resource = Main.class.getClassLoader().getResourceAsStream("cocomi.png");
        byte[] bytes = new byte[0];
        try {
            bytes = resource.readAllBytes();
        } catch (IOException e) {
            System.out.println("w파일을 읽을 수 없네/ 파일이 없네");
            throw new RuntimeException(e);
        }
        channel.sendFile(bytes, "cocomi.png").queue();
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.IMAGE;
    }
}
