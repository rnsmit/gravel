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
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMArrayType;

public class NewArray extends JVMInstruction implements Cloneable {

	public static NewArray_Factory factory = new NewArray_Factory();

	JVMType _elementType;

	public static class NewArray_Factory extends JVMInstruction_Factory {

		public NewArray basicNew() {
			NewArray newInstance = new NewArray();
			newInstance.initialize();
			return newInstance;
		}

		public NewArray elementType_(final JVMType _aJVMObjectType) {
			return this.basicNew().initializeElementType_(_aJVMObjectType);
		}
	}

	static public NewArray _elementType_(Object receiver, final JVMType _aJVMObjectType) {
		return factory.elementType_(_aJVMObjectType);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitNewArray_(this);
	}

	public NewArray copy() {
		try {
			NewArray _temp1 = (NewArray) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.pop().isIntType());
		_aJVMStack.push_(this.type());
		return this;
	}

	public JVMType elementType() {
		return _elementType;
	}

	public NewArray_Factory factory() {
		return factory;
	}

	public NewArray initializeElementType_(final JVMType _aJVMObjectType) {
		_elementType = _aJVMObjectType;
		this.initialize();
		return this;
	}

	@Override
	public NewArray printOn_(final StringBuilder _aStream) {
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
	public NewArray sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMArrayType.factory.elementType_(_elementType);
	}

	@Override
	public NewArray withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return NewArray.this;
		}
		throw new RuntimeException("niy");
	}
}
