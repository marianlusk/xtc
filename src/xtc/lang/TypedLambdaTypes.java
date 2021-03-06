// ===========================================================================
// This file has been generated by
// Typical, version 1.13.1,
// (C) 2004-2007 Robert Grimm and New York University,
// on Monday, October 15, 2007 at 8:59:39 PM.
// Edit at your own risk.
// ===========================================================================

package xtc.lang;

import xtc.typical.Record;
import xtc.typical.Variant;
import xtc.typical.Tuple;

/** Types for TypedLambda. */
public class TypedLambdaTypes {
  /** Implementation of constructor 'IntegerT' in variant 'raw_type'. */
  public static class IntegerT extends raw_type<Tuple.T0> {
    public IntegerT() {
      tuple = new Tuple.T0();
    }

    public final Tag tag() {
      return Tag.IntegerT;
    }

    public boolean isIntegerT() {
      return true;
    }

    public String getName() {
      return "IntegerT";
    }

    public String toString() {
      return "IntegerT";
    }
  }

  /** Implementation of constructor 'StringT' in variant 'raw_type'. */
  public static class StringT extends raw_type<Tuple.T0> {
    public StringT() {
      tuple = new Tuple.T0();
    }

    public final Tag tag() {
      return Tag.StringT;
    }

    public boolean isStringT() {
      return true;
    }

    public String getName() {
      return "StringT";
    }

    public String toString() {
      return "StringT";
    }
  }

  /** Implementation of constructor 'FunctionT' in variant 'raw_type'. */
  public static class FunctionT extends raw_type<Tuple.T2<TypedLambdaTypes.raw_type<?>, TypedLambdaTypes.raw_type<?>>> {
    public FunctionT(TypedLambdaTypes.raw_type<?> member1, TypedLambdaTypes.raw_type<?> member2) {
      tuple = new Tuple.T2<TypedLambdaTypes.raw_type<?>, TypedLambdaTypes.raw_type<?>>(member1, member2);
    }

    public final Tag tag() {
      return Tag.FunctionT;
    }

    public boolean isFunctionT() {
      return true;
    }

    public String getName() {
      return "FunctionT";
    }

    public String toString() {
      return "FunctionT of " + tuple.toString();
    }
  }

  /** Superclass of all constructors in variant 'raw_type'. */
  public static abstract class raw_type<T extends Tuple> extends Variant<T> {
    public static enum Tag {
      IntegerT,
      StringT,
      FunctionT
    }

    protected raw_type() {
    }

    public abstract Tag tag();

    public boolean isIntegerT() {
      return false;
    }

    public boolean isStringT() {
      return false;
    }

    public boolean isFunctionT() {
      return false;
    }
  }

  /** Implementation of record 'type'. */
  public static class type implements Record {
    public TypedLambdaTypes.raw_type<?> type;

    public type(TypedLambdaTypes.raw_type<?> type) {
      this.type = type;
    }

    public boolean equals(Object o) {
      if (o == null) {
        return false;
      }
      if (!(o instanceof type)) {
        return false;
      }

      type other = (type)o;
      boolean res = true;

      res = res && type.equals(other.type);
      return res;
    }

    public String toString() {
      return "{" + (null == type ? "?" : type.toString()) + "}";
    }
  }

  private TypedLambdaTypes() {
  }
}
