package com.github.sdual.fnpattern.function;

import com.github.sdual.fnpattern.data.Variable1;
import com.github.sdual.fnpattern.data.Variable2;

public class IntegerAdder implements Variable2To1Function {

  private Variable1<Integer> add(Variable2<Integer> input) {
    return new Variable1<>(input.getVal1() + input.getVal2());
  }

  @Override
  public Variable1<Integer> apply(Variable2<Integer> input) {
    // Functional Interfaceに合わせるためにwrapしている。
    return add(input);
  }
}
