package org.hank.config;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.hank.handler.MessageReceiveHandler;

import javax.security.auth.login.LoginException;

public class JdaConfig {
    public static void startBot(String botKey) {
        JDABuilder jda = JDABuilder.createDefault(botKey);
        jda.enableIntents(GatewayIntent.GUILD_MESSAGES);
        jda.addEventListeners(new MessageReceiveHandler());
        jda.setActivity(Activity.playing("JAVA"));

        try {
            jda.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

    }

}
