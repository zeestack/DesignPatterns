package com.zahid.mediator;

public class Button extends UIControl{

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
        this.notifyEventHandlers();
    }

}
