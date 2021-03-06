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
import st.gravel.support.compiler.jvm.JVMArrayType;
import st.gravel.support.compiler.jvm.JVMType;

public class ObjectArrayLoad extends JVMInstruction implements Cloneable {

	public static ObjectArrayLoad_Factory factory = new ObjectArrayLoad_Factory();

	public static class ObjectArrayLoad_Factory extends JVMInstruction_Factory {

		public ObjectArrayLoad basicNew() {
			ObjectArrayLoad newInstance = new ObjectArrayLoad();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitObjectArrayLoad_(this);
	}

	public ObjectArrayLoad copy() {
		try {
			ObjectArrayLoad _temp1 = (ObjectArrayLoad) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		final JVMArrayType _arrayType;
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.pop().isIntType());
		_arrayType = ((JVMArrayType) _aJVMStack.pop());
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _arrayType.isArrayType());
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _arrayType.elementType().isObjectType());
		_aJVMStack.push_(_arrayType.elementType());
		return this;
	}

	public ObjectArrayLoad_Factory factory() {
		return factory;
	}

	@Override
	public ObjectArrayLoad printOn_(final StringBuilder _aStream) {
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
	public ObjectArrayLoad sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public ObjectArrayLoad withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return ObjectArrayLoad.this;
		}
		throw new RuntimeException("niy");
	}
}
