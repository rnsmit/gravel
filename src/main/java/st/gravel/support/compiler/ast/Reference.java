package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.AbsoluteReference;

abstract public class Reference extends Object implements Cloneable {

	public static Reference_Factory factory = new Reference_Factory();

	public static class Reference_Factory extends st.gravel.support.jvm.SmalltalkFactory {

		public Reference basicNew() {
			throw new RuntimeException("Reference is an abstract class");
		}

		public Reference value_(final String _aString) {
			if (_aString.endsWith(" class")) {
				return Reference.factory.value_(_aString.substring(0, _aString.length() - 6)).meta();
			}
			if (_aString.length() == 0) {
				return AbsoluteReference.factory.path_(new st.gravel.core.Symbol[] {});
			}
			return AbsoluteReference.factory.path_(st.gravel.support.jvm.ArrayExtensions.collect_(st.gravel.support.jvm.StringExtensions.tokensBasedOn_(_aString, '.'), ((st.gravel.support.jvm.Block1<st.gravel.core.Symbol, String>) (new st.gravel.support.jvm.Block1<st.gravel.core.Symbol, String>() {

				@Override
				public st.gravel.core.Symbol value_(final String _each) {
					return (st.gravel.core.Symbol) st.gravel.core.Symbol.value(_each);
				}
			}))));
		}
	}

	static public Reference _value_(Object receiver, final String _aString) {
		return factory.value_(_aString);
	}

	public Reference copy() {
		try {
			Reference _temp1 = (Reference) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public abstract boolean equals(final Object _anObject);

	public Reference_Factory factory() {
		return factory;
	}

	public abstract int hashCode();

	public Reference initialize() {
		return this;
	}

	public abstract boolean isMeta();

	public abstract Reference meta();

	public abstract AbsoluteReference namespace();

	public abstract AbsoluteReference nonmeta();

	public Reference postCopy() {
		return this;
	}

	public abstract Reference printOn_(final StringBuilder _aStream);

	public String toString() {
		final StringBuilder _aStream;
		_aStream = st.gravel.support.jvm.WriteStreamFactory.on_(new String());
		this.printOn_(_aStream);
		return _aStream.toString();
	}
}
