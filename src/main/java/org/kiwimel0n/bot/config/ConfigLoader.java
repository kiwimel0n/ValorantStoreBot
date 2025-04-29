package org.kiwimel0n.bot.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("application.properties 파일을 찾을 수 없습니다.");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("설정 파일을 로드하는 중 오류가 발생했습니다.", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
