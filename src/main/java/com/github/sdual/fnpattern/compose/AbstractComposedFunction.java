package com.github.sdual.fnpattern.compose;

import java.util.function.Function;

public abstract class AbstractComposedFunction<S, T, R> implements Function<S, R> {

  // f: (S -> T) -> R
  private final Function<S, R> composedFunc;

  public AbstractComposedFunction(Function<S, T> f, Function<T, R> g) {
    this.composedFunc = g.compose(f);
  }

  public R apply(S input) {
    return composedFunc.apply(input);
  }

}
