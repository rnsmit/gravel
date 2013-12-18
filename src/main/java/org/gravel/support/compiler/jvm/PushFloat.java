package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.PushConstant;
import org.gravel.support.compiler.jvm.PushConstant.PushConstant_Factory;
import org.gravel.support.compiler.jvm.JVMInstructionVisitor;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMFloatType;

public class PushFloat extends PushConstant implements Cloneable {

	public static PushFloat_Factory factory = new PushFloat_Factory();

	float _value;

	public static class PushFloat_Factory extends PushConstant_Factory {

		public PushFloat basicNew() {
			PushFloat newInstance = new PushFloat();
			newInstance.initialize();
			return newInstance;
		}

		public PushFloat value_(final float _aFloat) {
			return this.basicNew().initializeValue_(_aFloat);
		}
	}

	static public PushFloat _value_(Object receiver, final float _aFloat) {
		return factory.value_(_aFloat);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitPushFloat_(this);
	}

	public PushFloat copy() {
		try {
			PushFloat _temp1 = (PushFloat) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public PushFloat_Factory factory() {
		return factory;
	}

	public PushFloat initializeValue_(final float _aFloat) {
		_value = _aFloat;
		this.initialize();
		return this;
	}

	@Override
	public PushFloat printOn_(final StringBuilder _aStream) {
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
	public PushFloat sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMFloatType.factory.basicNew();
	}

	public float value() {
		return _value;
	}

	@Override
	public PushFloat withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return PushFloat.this;
		}
		throw new RuntimeException("niy");
	}
}
