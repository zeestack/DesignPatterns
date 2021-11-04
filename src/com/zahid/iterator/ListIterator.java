package com.zahid.iterator;

public class ListIterator implements Iterator{
    private BrowseHistory history;
    int index = 0;

    public ListIterator(BrowseHistory history){
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return index < history.urls.size();
    }

    @Override
    public String current() {
        return history.urls.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
