package org.example.message_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean("mpHelloWorld")
    public MessageProvider getMessageProviderHelloWorld() {
        return new HelloWorldMessageProvider();
    }

    @Bean("mpByeWorld")
    public MessageProvider getMessageProviderByeWorld() {
        return new ByeWorldMessageProvider();
    }

    @Bean("mrWithArgs")
    public MessageRenderer getMessageRendererWithParameter() {
        return new StandardOutMessageRenderer(getMessageProviderHelloWorld());
    }

    @Bean("mrNoArgs")
    public MessageRenderer getMessageRendererWithoutParameter() {
        return new StandardOutMessageRenderer();
    }
}
