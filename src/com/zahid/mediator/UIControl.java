package com.zahid.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void attachEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (EventHandler eventHandler : eventHandlers) {
            eventHandler.handleEvent();
        }
    }


}
