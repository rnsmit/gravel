package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.Frame;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMType;

abstract public class JVMInstruction extends Object implements Cloneable {

	public static JVMInstruction_Factory factory = new JVMInstruction_Factory();

	public static class JVMInstruction_Factory extends st.gravel.support.jvm.SmalltalkFactory {

		public JVMInstruction basicNew() {
			throw new RuntimeException("JVMInstruction is an abstract class");
		}
	}

	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitJVMInstruction_(this);
	}

	public Frame asFrame() {
		return Frame.factory.empty().withInstruction_(this);
	}

	public JVMInstruction copy() {
		try {
			JVMInstruction _temp1 = (JVMInstruction) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public abstract JVMInstruction effectStack_(final JVMStack _aJVMStack);

	public JVMInstruction_Factory factory() {
		return factory;
	}

	public JVMInstruction initialize() {
		return this;
	}

	public boolean isCast() {
		return false;
	}

	public JVMInstruction postCopy() {
		return this;
	}

	public JVMInstruction printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	public JVMInstruction sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	public String toString() {
		final StringBuilder _aStream;
		_aStream = st.gravel.support.jvm.WriteStreamFactory.on_(new String());
		this.printOn_(_aStream);
		return _aStream.toString();
	}

	public JVMType type() {
		throw new RuntimeException("Not supported");
	}

	public JVMInstruction withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return JVMInstruction.this;
		}
		throw new RuntimeException("niy");
	}
}
