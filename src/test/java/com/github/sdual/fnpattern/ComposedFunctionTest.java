package com.github.sdual.fnpattern;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.google.common.base.Function;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import org.junit.Test;

public final class ComposedFunctionTest {
  @Test
  public void supportsGenericInjection() {

    Injector injector = Guice.createInjector(new ComposedFunctionModule());

    Function<Double, String> composed = injector.getInstance(
        new Key<Function<Double, String>>(){}
    );

    assertThat(composed.apply(1.25), is("3ff4000000000000"));
  }

  private static final class ComposedFunctionModule implements Module {

    public void configure(Binder binder) {
      binder.bind(new TypeLiteral<Function<Double, Long>>(){}).
          to(DoubleToLong.class);
      binder.bind(new TypeLiteral<Function<Long, String>>(){}).
          to(LongToString.class);
      binder.bind(new TypeLiteral<Function<Double, String>>(){}).
          to(new TypeLiteral<ComposedFunction<Double, Long, String>>(){});
    }
  }

  private static final class DoubleToLong implements Function<Double, Long> {

    public Long apply(Double x) {
      return Double.doubleToLongBits(x);
    }
  }

  private static final class LongToString implements Function<Long, String> {

    public String apply(Long x) {
      return Long.toHexString(x);
    }
  }
}