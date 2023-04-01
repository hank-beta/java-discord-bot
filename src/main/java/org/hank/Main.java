package org.hank;


public class Main {
    public static void main(String[] args) {
        String botKey = System.getProperty("bot_key", "");
        JdaConfig.startBot(botKey);
    }


}

