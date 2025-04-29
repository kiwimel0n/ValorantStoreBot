package org.kiwimel0n.bot;

import net.dv8tion.jda.api.JDABuilder;
import org.kiwimel0n.bot.config.ConfigLoader;

public class StoreBot {

    public static void main(String[] args) {
        String token = ConfigLoader.getProperty("discord.token");

        if (token == null || token.isEmpty()) {
            System.out.println("디스코드 토큰이 설정되지 않았습니다.");
            return;
        }

        JDABuilder.createDefault(token)
                .build();

    }
}
