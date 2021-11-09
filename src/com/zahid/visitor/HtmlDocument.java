package com.zahid.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<HtmlNode> nodes = new ArrayList<>();

    public void addNode(HtmlNode node) {
        nodes.add(node);
    }

    public void removeNode(HtmlNode node){
        nodes.remove(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes) {
            node.execute(operation);
        }
    }

}
