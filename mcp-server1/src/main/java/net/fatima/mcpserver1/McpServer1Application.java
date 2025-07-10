package net.fatima.mcpserver1;

import net.fatima.mcpserver1.tools.StockTools;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpServer1Application {

    public static void main(String[] args) {

        SpringApplication.run(McpServer1Application.class, args);
    }
    @Bean
    public MethodToolCallbackProvider getMethodToolCallbackProvider() {
        return MethodToolCallbackProvider.builder()
                .toolObjects(new StockTools())
                .build();
    }

}
