package com.project.stack;

public class StackNode<T> {

    private T value;
    private StackNode<T> next;
    private StackNode<T> prev;

    public StackNode(T value) {
        this.value = value;
        next = null;
        prev = null;
    }

    public T getValue() {
        return value;
    }

    public StackNode<T> setValue(T value) {
        this.value = value;
        return this;
    }

    public StackNode<T> getNext() {
        return next;
    }

    public StackNode<T> setNext(StackNode<T> next) {
        this.next = next;
        return this;
    }

    public StackNode<T> getPrev() {
        return prev;
    }

    public StackNode<T> setPrev(StackNode<T> prev) {
        this.prev = prev;
        return this;
    }
}
