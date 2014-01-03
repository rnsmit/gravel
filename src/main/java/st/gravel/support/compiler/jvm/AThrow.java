package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMType;

public class AThrow extends JVMInstruction implements Cloneable {

	public static AThrow_Factory factory = new AThrow_Factory();

	public static class AThrow_Factory extends JVMInstruction_Factory {

		public AThrow basicNew() {
			AThrow newInstance = new AThrow();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitAThrow_(this);
	}

	public AThrow copy() {
		try {
			AThrow _temp1 = (AThrow) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		st.gravel.support.jvm.ObjectExtensions.assert_(this, st.gravel.support.jvm.IntegerExtensions.equals_(_aJVMStack.size(), 1));
		_aJVMStack.popLast();
		return this;
	}

	public AThrow_Factory factory() {
		return factory;
	}

	@Override
	public AThrow printOn_(final StringBuilder _aStream) {
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
	public AThrow sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public AThrow withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return AThrow.this;
		}
		throw new RuntimeException("niy");
	}
}
