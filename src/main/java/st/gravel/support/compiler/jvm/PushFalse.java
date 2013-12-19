package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.PushBoolean;
import st.gravel.support.compiler.jvm.PushBoolean.PushBoolean_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMType;

public class PushFalse extends PushBoolean implements Cloneable {

	public static PushFalse_Factory factory = new PushFalse_Factory();

	public static class PushFalse_Factory extends PushBoolean_Factory {

		public PushFalse basicNew() {
			PushFalse newInstance = new PushFalse();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitPushFalse_(this);
	}

	public PushFalse copy() {
		try {
			PushFalse _temp1 = (PushFalse) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public PushFalse_Factory factory() {
		return factory;
	}

	@Override
	public PushFalse printOn_(final StringBuilder _aStream) {
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
	public PushFalse sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public PushFalse withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return PushFalse.this;
		}
		throw new RuntimeException("niy");
	}
}