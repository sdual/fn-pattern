package com.github.sdual.fnpattern;

import com.github.sdual.fnpattern.function.Variable1To1Function;
import com.github.sdual.fnpattern.function.Variable2To1Function;
import com.github.sdual.fnpattern.function.IntegerAdder;
import com.github.sdual.fnpattern.function.IntegerMultiplyTen;
import com.google.inject.AbstractModule;

public class BindingModule extends AbstractModule {

  @Override
  public void configure() {
    bind(Variable2To1Function.class).to(IntegerAdder.class);
    bind(Variable1To1Function.class).to(IntegerMultiplyTen.class);
  }

}
