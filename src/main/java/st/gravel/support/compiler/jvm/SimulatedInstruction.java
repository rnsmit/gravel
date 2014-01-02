package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMType;

abstract public class SimulatedInstruction extends JVMInstruction implements Cloneable {

	public static SimulatedInstruction_Factory factory = new SimulatedInstruction_Factory();

	public static class SimulatedInstruction_Factory extends JVMInstruction_Factory {

		public SimulatedInstruction basicNew() {
			throw new RuntimeException("SimulatedInstruction is an abstract class");
		}
	}

	public SimulatedInstruction copy() {
		try {
			SimulatedInstruction _temp1 = (SimulatedInstruction) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public SimulatedInstruction_Factory factory() {
		return factory;
	}

	@Override
	public SimulatedInstruction printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public SimulatedInstruction sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public SimulatedInstruction withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return SimulatedInstruction.this;
		}
		throw new RuntimeException("niy");
	}
}
