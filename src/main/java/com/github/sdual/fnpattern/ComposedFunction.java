package com.github.sdual.fnpattern;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import javax.inject.Inject;


public class ComposedFunction<A, B, C> implements Function<A, C> {

  private final Function<A, C> composed;

  @Inject
  public ComposedFunction(Function<B, C> g, Function<A, B> f) {
    this.composed = Functions.compose(g, f);
  }

  public C apply(A p) {
    return composed.apply(p);
  }

}
