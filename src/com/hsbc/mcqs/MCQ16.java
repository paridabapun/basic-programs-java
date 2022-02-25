package com.hsbc.mcqs;

import java.util.Stack;

class MyGenericStack<E>{
    Stack<E> stk=new Stack<E>();
    public void push(E obj){
        stk.push(obj);
    }
    public E pop(){
        E obj=stk.pop();
        return obj;
    }
}

 class MCQ16 {
    public static void main(String[] args) {
MyGenericStack<Integer> genericStack = new MyGenericStack<Integer>();
genericStack.push(36);
        System.out.println(genericStack.pop());
    }
}
