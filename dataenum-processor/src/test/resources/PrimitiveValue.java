/*
 * -\-\-
 * DataEnum
 * --
 * Copyright (c) 2017 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */
import com.spotify.dataenum.function.Consumer;
import com.spotify.dataenum.function.Function;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;
import javax.annotation.Nonnull;

@Generated("com.spotify.dataenum.processor.DataEnumProcessor")
public abstract class PrimitiveValue {
  PrimitiveValue() {
  }

  public static PrimitiveValue value(int param1, boolean param2, float param3, double param4) {
    return new Value(param1, param2, param3, param4);
  }

  public final boolean isValue() {
    return (this instanceof Value);
  }

  public final Value asValue() {
    return (Value) this;
  }

  public abstract void match(@Nonnull Consumer<Value> value);

  public abstract <R_> R_ map(@Nonnull Function<Value, R_> value);

  public static final class Value extends PrimitiveValue {
    private final int param1;

    private final boolean param2;

    private final float param3;

    private final double param4;

    Value(int param1, boolean param2, float param3, double param4) {
      this.param1 = param1;
      this.param2 = param2;
      this.param3 = param3;
      this.param4 = param4;
    }

    public final int param1() {
      return param1;
    }

    public final boolean param2() {
      return param2;
    }

    public final float param3() {
      return param3;
    }

    public final double param4() {
      return param4;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Value)) return false;
      Value o = (Value) other;
      return o.param1 == param1
          && o.param2 == param2
          && o.param3 == param3
          && o.param4 == param4;
    }

    @Override
    public int hashCode() {
      int result = 0;
      result = result * 31 + Integer.valueOf(param1).hashCode();
      result = result * 31 + Boolean.valueOf(param2).hashCode();
      result = result * 31 + Float.valueOf(param3).hashCode();
      return result * 31 + Double.valueOf(param4).hashCode();
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Value{param1=").append(param1);
      builder.append(", param2=").append(param2);
      builder.append(", param3=").append(param3);
      builder.append(", param4=").append(param4);
      return builder.append('}').toString();
    }

    @Override
    public final void match(@Nonnull Consumer<Value> value) {
      value.accept(this);
    }

    @Override
    public final <R_> R_ map(@Nonnull Function<Value, R_> value) {
      return value.apply(this);
    }
  }
}
