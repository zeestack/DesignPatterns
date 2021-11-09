package com.zahid.chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler handler) {
        this.next = handler;
    }

    public void handle(HttpRequest request){
        if(doHandle(request)) return ;

        if(next != null)
            next.handle(request);
    }


    public abstract boolean doHandle(HttpRequest request);



}
