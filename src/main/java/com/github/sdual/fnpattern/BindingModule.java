package com.github.sdual.fnpattern;

import com.github.sdual.fnpattern.function.FunctionVariable1To1;
import com.github.sdual.fnpattern.function.FunctionVariable2To1;
import com.github.sdual.fnpattern.function.IntegerAdder;
import com.github.sdual.fnpattern.function.IntegerMultiplyTen;
import com.google.inject.AbstractModule;

public class BindingModule extends AbstractModule {

  @Override
  public void configure() {
    bind(FunctionVariable2To1.class).to(IntegerAdder.class);
    bind(FunctionVariable1To1.class).to(IntegerMultiplyTen.class);
  }

}
