package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;

public class AbstractMapping extends Object implements Cloneable {

	public static AbstractMapping_Factory factory = new AbstractMapping_Factory();

	public static class AbstractMapping_Factory extends st.gravel.support.jvm.SmalltalkFactory {

		public AbstractMapping basicNew() {
			AbstractMapping newInstance = new AbstractMapping();
			newInstance.initialize();
			return newInstance;
		}
	}

	public AbstractMapping copy() {
		try {
			AbstractMapping _temp1 = (AbstractMapping) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public AbstractMapping_Factory factory() {
		return factory;
	}

	public AbstractMapping initialize() {
		return this;
	}

	public AbstractMapping postCopy() {
		return this;
	}
}
