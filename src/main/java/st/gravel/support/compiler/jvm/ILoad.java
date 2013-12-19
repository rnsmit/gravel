package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.Load;
import st.gravel.support.compiler.jvm.Load.Load_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMType;

public class ILoad extends Load implements Cloneable {

	public static ILoad_Factory factory = new ILoad_Factory();

	public static class ILoad_Factory extends Load_Factory {

		public ILoad basicNew() {
			ILoad newInstance = new ILoad();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitILoad_(this);
	}

	public ILoad copy() {
		try {
			ILoad _temp1 = (ILoad) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ILoad_Factory factory() {
		return factory;
	}

	@Override
	public ILoad initializeIndex_type_(final int _anInteger, final JVMType _aJVMDynamicObjectType) {
		_index = _anInteger;
		_type = _aJVMDynamicObjectType;
		this.initialize();
		return this;
	}

	@Override
	public ILoad printOn_(final StringBuilder _aStream) {
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
	public ILoad sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public ILoad withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return ILoad.this;
		}
		throw new RuntimeException("niy");
	}
}