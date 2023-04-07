package org.hank.command.mylove;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;

public class HelloMyLove implements MyLove {
    private int choice = 0;
    private int scenarioStep = 0;


    @Override
    public boolean unCompleteFirstStep() {
        return scenarioStep == 0;
    }

    @Override
    public boolean completeFirstStep() {
        return scenarioStep == 1;
    }

    @Override
    public boolean completeSecondStep() {
        return scenarioStep == 2;
    }

    @Override
    public boolean completeFinalStep() {
        return scenarioStep == 3;
    }

    @Override
    public void printPreDefinedText(MessageChannel channel, User user, Integer choice) {
        channel.sendMessage("내 사랑 베타가 나타났다. 어떻게 꼬시지?\n" + "[1] 안녕 자기\n[2] 사랑해").queue();
        scenarioStep++;
    }

    @Override
    public void choose(MessageChannel channel, User user, Integer choice) {
        switch (choice) {
            case 1:
                this.choice = 1;
                break;
            case 2:
                this.choice = 2;
                break;
        }
        scenarioStep++;
    }

    @Override
    public void printPostDefinedText(MessageChannel channel, User user, Integer choice) {
        switch (this.choice) {
            case 1:
                channel.sendMessage("머야 이새키, 귀엽노").queue();
                break;
            case 2:
                channel.sendMessage("경멸의 눈빛을 보낸다.\n '이상한 새키'").queue();
                break;
        }
        scenarioStep++;
    }
}
