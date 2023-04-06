package org.hank.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;
import java.time.LocalDateTime;

import static org.hank.utils.BotEventUtils.sendMessage;

public class ReactionCommand implements Commandable {
    @Override
    public void doCommand(MessageChannel channel, String userMessage) {
//        if (userMessage.equals("사랑해")) {
        EmbedBuilder builder = new EmbedBuilder();
        MessageEmbed message = builder.setTitle("인조인간 18호가 내 여동생일리 없어")
                .setDescription("인조인간 18호가 내여동생이라는 내용")
                .setColor(Color.PINK)
                .setTimestamp(LocalDateTime.now())
                .setFooter("from 인조인간 18호", "https://avatars.githubusercontent.com/u/77097180?s=400&u=d3dfeb8a627e5f78a4668ee8002563777d446d8e&v=4")
                .setAuthor("HANK", "https://github.com/ranjafunc", "https://avatars.githubusercontent.com/u/77097180?s=400&u=d3dfeb8a627e5f78a4668ee8002563777d446d8e&v=4")
                .addField(new MessageEmbed.Field("필드", "벨류", true))
                .addField(new MessageEmbed.Field("필드2", "벨류2", true))
                .addField(new MessageEmbed.Field("필드3", "벨류3", false))
                .setImage("https://avatars.githubusercontent.com/u/77097180?s=400&u=d3dfeb8a627e5f78a4668ee8002563777d446d8e&v=4")
                .build();


        channel.sendMessageEmbeds(message).queue();
    }
//
//
//        if (userMessage.equals("안녕")) {
//            sendMessage(channel, "안녕하세요.");
//        }
//    }

    @Override
    public CommandType getCommandType() {
        return CommandType.REACTION;
    }


}
