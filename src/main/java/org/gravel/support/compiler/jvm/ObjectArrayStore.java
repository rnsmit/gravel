package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import org.gravel.support.compiler.jvm.JVMInstructionVisitor;
import org.gravel.support.compiler.jvm.JVMStack;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMArrayType;
import org.gravel.support.compiler.jvm.JVMBottomType;

public class ObjectArrayStore extends JVMInstruction implements Cloneable {

	public static ObjectArrayStore_Factory factory = new ObjectArrayStore_Factory();

	public static class ObjectArrayStore_Factory extends JVMInstruction_Factory {

		public ObjectArrayStore basicNew() {
			ObjectArrayStore newInstance = new ObjectArrayStore();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitObjectArrayStore_(this);
	}

	public ObjectArrayStore copy() {
		try {
			ObjectArrayStore _temp1 = (ObjectArrayStore) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		final JVMType _arrayType;
		final JVMType _valType;
		_valType = _aJVMStack.pop();
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _valType.isObjectType());
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.pop().isIntType());
		_arrayType = _aJVMStack.pop();
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _arrayType.isArrayType());
		org.gravel.support.jvm.ObjectExtensions.assert_(this, ((JVMArrayType) _arrayType).elementType().isObjectType());
		return this;
	}

	public ObjectArrayStore_Factory factory() {
		return factory;
	}

	@Override
	public ObjectArrayStore printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(org.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public ObjectArrayStore sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMBottomType.factory.basicNew();
	}

	@Override
	public ObjectArrayStore withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return ObjectArrayStore.this;
		}
		throw new RuntimeException("niy");
	}
}
