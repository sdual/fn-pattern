package com.github.sdual.fnpattern;

import com.github.sdual.fnpattern.function.BaseFunction;
import com.github.sdual.fnpattern.function.Variable1To1Function;
import com.github.sdual.fnpattern.function.Variable2To1Function;
import com.google.inject.AbstractModule;

public class BindingModule extends AbstractModule {

  @Override
  public void configure() {
    bind(Variable2To1Function.class).toInstance(BaseFunction.function1);
    bind(Variable1To1Function.class).toInstance(BaseFunction.function2);
  }

}
