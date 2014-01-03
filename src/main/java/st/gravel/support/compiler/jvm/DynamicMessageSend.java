package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.DynamicSend;
import st.gravel.support.compiler.jvm.DynamicSend.DynamicSend_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMMethodType;
import st.gravel.support.compiler.jvm.JVMType;

public class DynamicMessageSend extends DynamicSend implements Cloneable {

	public static DynamicMessageSend_Factory factory = new DynamicMessageSend_Factory();

	public static class DynamicMessageSend_Factory extends DynamicSend_Factory {

		public DynamicMessageSend basicNew() {
			DynamicMessageSend newInstance = new DynamicMessageSend();
			newInstance.initialize();
			return newInstance;
		}

		public DynamicMessageSend functionName_numArgs_(final String _aString, final int _anInteger) {
			return this.basicNew().initializeFunctionName_numArgs_(_aString, _anInteger);
		}
	}

	static public DynamicMessageSend _functionName_numArgs_(Object receiver, final String _aString, final int _anInteger) {
		return factory.functionName_numArgs_(_aString, _anInteger);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitDynamicMessageSend_(this);
	}

	public DynamicMessageSend copy() {
		try {
			DynamicMessageSend _temp1 = (DynamicMessageSend) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public DynamicMessageSend_Factory factory() {
		return factory;
	}

	public DynamicMessageSend initializeFunctionName_numArgs_(final String _aString, final int _anInteger) {
		_functionName = _aString;
		_numArgs = _anInteger;
		this.initialize();
		return this;
	}

	@Override
	public DynamicMessageSend printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	public JVMMethodType signature() {
		return JVMMethodType.factory.dynamic_((_numArgs + 1));
	}

	@Override
	public DynamicMessageSend sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_functionName);
		return this;
	}

	@Override
	public DynamicSend withReceiverType_argumentTypes_(final JVMType _aJVMObjectType, final JVMType[] _anArray) {
		DynamicMessageSend _temp1 = this.copy();
		_temp1.pvtSetReceiverType_(_aJVMObjectType);
		return _temp1.pvtSetArgumentTypes_(_anArray);
	}

	@Override
	public DynamicMessageSend withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return DynamicMessageSend.this;
		}
		throw new RuntimeException("niy");
	}
}
