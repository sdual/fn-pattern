package com.github.sdual.fnpattern.function;

import com.github.sdual.fnpattern.data.Variable1;

public abstract class BaseFunction {

  public static final Variable2To1Function function1 = input -> new Variable1<>(
      input.getVal1() + input.getVal2());

  public static final Variable1To1Function function2 = input -> new Variable1<>(
      10 * input.getVal1());

}
