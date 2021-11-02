package com.zahid.template;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    //should protected as we dont want this to be called by the object.
    protected abstract void doExecute();

}
