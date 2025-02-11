package org.example.message_example;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    public StandardOutMessageRenderer() {
        System.out.println("--> StandardOutMessageRenderer default constructor");
    }

    public StandardOutMessageRenderer(MessageProvider messageProvider) {
        System.out.println("--> StandardOutMessageRenderer parametrized constructor");
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("Message Provider has not been initialized");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        System.out.println("--> StandardOutMessageRenderer setMessageProvider");
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
