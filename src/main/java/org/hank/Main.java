package org.hank;


import org.hank.config.CommandConfig;
import org.hank.config.JdaConfig;

public class Main {
    public static void main(String[] args) {
        String botKey = System.getProperty("bot_key", "");
        JdaConfig.startBot(botKey);
        
        new CommandConfig();
    }

}

