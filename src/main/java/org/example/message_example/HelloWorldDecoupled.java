package org.example.message_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        MessageRenderer mr = context.getBean("mrNoArgs",MessageRenderer.class);
        MessageProvider mp = context.getBean("mpByeWorld",MessageProvider.class);

        mr.setMessageProvider(mp);

        mr.render();
    }
}
