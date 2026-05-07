package org.example;

import java.util.Stack;

public class MyStringBuilder {
    private final StringBuilder stringBuilder;
    private final Stack<MyStringBuilder> history;

    public MyStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
        history = new Stack<>();
    }

    public void append(String str) {
        history.push(new MyStringBuilder(new StringBuilder(stringBuilder)));
        stringBuilder.append(str);
    }

    public MyStringBuilder undo() {
        return history.pop();
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
