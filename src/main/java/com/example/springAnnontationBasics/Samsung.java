package com.example.springAnnontationBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired//by type
    MobileProcessor processor;

    public MobileProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(MobileProcessor processor) {
        this.processor = processor;
    }

    public void config()
    {
        System.out.println("Octa core,4gb Ram,12MP Camera :");
        processor.process();
    }
}
