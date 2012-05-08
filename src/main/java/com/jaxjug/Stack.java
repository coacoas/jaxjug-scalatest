package com.jaxjug;

import java.util.*;

public class Stack<T> {

  public int MAX = 10;
  private List<T> buf = new ArrayList<T>();
  
  public void push(T o) { 
	  if (!isFull()) {
		  buf.add(0, o);
	  } else {
		  throw new IllegalStateException("can't push onto a full stack");
	  }
  }
  
  public T pop() {
	  if (!isEmpty()) {
		  return buf.remove(0);
	  } else {
		  throw new IllegalStateException("can't pop an empty stack");
	  }
  }

  public T peek() { 
	  if (!isEmpty()) {
		  return buf.get(0);
	  } else  {
		  throw new IllegalStateException("can't peek an empty stack");
	  }
  }
  
  public boolean isFull() { 
	  return buf.size() >= MAX;
  }

  public boolean isEmpty() { 
	  return buf.isEmpty();
  }

  public int size() {
	  return buf.size();
  }
  
  @Override 
  public String toString() { 
	  StringBuilder sb = new StringBuilder("Stack(");
	  boolean append = false;
	  for (T o : buf) { 
		  if (append) {
			  sb.append(",");
		  }
		  sb.append(o);
		  append = true;
	  }
	  sb.append(")");
	  return sb.toString();
  }
}
