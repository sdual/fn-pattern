package com.github.sdual.fnpattern.compose;

import com.github.sdual.fnpattern.data.Variable1;
import com.github.sdual.fnpattern.data.Variable2;
import com.github.sdual.fnpattern.function.Variable1To1Function;
import com.github.sdual.fnpattern.function.Variable2To1Function;
import javax.inject.Inject;

public class ComposedFunction extends
    AbstractComposedFunction<Variable2<Integer>, Variable1<Integer>, Variable1<Integer>> {

  @Inject
  public ComposedFunction(Variable2To1Function func1, Variable1To1Function func2) {
    super(func1, func2);
  }

}
