package com.github.sdual.fnpattern;

import com.github.sdual.fnpattern.compose.ComposedFunction;
import com.github.sdual.fnpattern.data.Variable1;
import com.github.sdual.fnpattern.data.Variable2;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

  public static void main(String[] args) {

    Injector injector = Guice.createInjector(new BindingModule());
    // Create a composed function by using dependency injection.
    ComposedFunction composedFunc = injector.getInstance(ComposedFunction.class);

    Variable2<Integer> input1 = new Variable2<>(1, 3);

    // Apply the composed function.
    Variable1<Integer> result = composedFunc.apply(input1);

    // f: (a, b) -> a + b
    // g: c -> 10 * c
    // (1 + 3) × 10 = 40
    System.out.println(result.getVal1());
  }

}
