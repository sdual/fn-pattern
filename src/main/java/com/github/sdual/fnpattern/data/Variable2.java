package com.github.sdual.fnpattern.data;

public class Variable2<T> {
  private final T val1;
  private final T val2;

  public Variable2(T val1, T val2) {
    this.val1 = val1;
    this.val2 = val2;
  }

  public T getVal1() {
    return val1;
  }

  public T getVal2() {
    return val2;
  }

}
