package com.project.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T extends Comparable<T>> implements Comparable<MyStack<T>> {

    private static final String TO_STRING_TEMPLATE = "[%s]";
    private static final String EMPTY_STACK_ERROR_MSG = "Stack is empty";

    protected StackNode<T> topElement;
    protected int size = 0;

    public MyStack() {
    }

    public MyStack(T value) {
        StackNode<T> firstElement = new StackNode<T>(value);
        topElement = firstElement;
    }

    public void push(T element) {
        StackNode<T> node = new StackNode<>(element);
        if (topElement == null) {
            topElement = new StackNode<>(element);
        } else {
            StackNode<T> pointer = topElement;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(new StackNode<>(element));
        }
        size++;
    }

    public T pop() {
        if (topElement == null) {
            throw new IllegalStateException(EMPTY_STACK_ERROR_MSG);
        }
        size--;
        if (topElement.getNext() == null) {
            T value = topElement.getValue();
            topElement = null;
            return value;
        }
        StackNode<T> pointer = topElement;
        while (pointer.getNext().getNext() != null) {
            pointer = pointer.getNext();
        }
        T value = pointer.getNext().getValue();
        pointer.setNext(null);
        return value;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        List<String> elements = new ArrayList<>();
        StackNode<T> pointer = topElement;
        while (pointer != null) {
            elements.add(pointer.getValue().toString());
            pointer = pointer.getNext();
        }
        return String.format(TO_STRING_TEMPLATE, String.join(", ", elements));
    }

    @Override
    public int compareTo(MyStack<T> o) {
        if (size < o.size) {
            return -1;
        }
        StackNode<T> thisPointer = topElement;
        StackNode<T> otherPointer = o.topElement;
        while (thisPointer != null) {
            int compareTo = thisPointer.getValue().compareTo(otherPointer.getValue());
            if (compareTo != 0) {
                return compareTo;
            }
            thisPointer = thisPointer.getNext();
            otherPointer = otherPointer.getNext();
        }
        return 0;
    }

    @Override
    public int hashCode() {
        int hashSum = 0;
        StackNode<T> pointer = topElement;
        while (pointer != null) {
            hashSum += pointer.getValue().hashCode();
            pointer = pointer.getNext();
        }
        return hashSum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != MyStack.class) {
            return false;
        }
        MyStack<T> other = (MyStack<T>) obj;
        return compareTo(other) == 0;
    }
}
