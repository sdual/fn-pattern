package com.github.sdual.fnpattern.compose;

import com.github.sdual.fnpattern.data.Variable1;
import com.github.sdual.fnpattern.data.Variable2;
import com.github.sdual.fnpattern.function.FunctionVariable1To1;
import com.github.sdual.fnpattern.function.FunctionVariable2To1;
import javax.inject.Inject;

public class ComposedFunction extends
    AbstractComposedFunction<Variable2<Integer>, Variable1<Integer>, Variable1<Integer>> {

  @Inject
  public ComposedFunction(FunctionVariable2To1 func1, FunctionVariable1To1 func2) {
    super(func1, func2);
  }

}
