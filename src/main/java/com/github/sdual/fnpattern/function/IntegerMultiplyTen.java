package com.github.sdual.fnpattern.function;

import com.github.sdual.fnpattern.data.Variable1;

public class IntegerMultiplyTen implements FunctionVariable1To1 {

  private Variable1<Integer> multiply(Variable1<Integer> input) {
    return new Variable1<>(10 * input.getVal1());
  }

  @Override
  public Variable1<Integer> apply(Variable1<Integer> input) {
    // Functional Interfaceに合わせるためにwrapしている。
    return multiply(input);
  }

}
