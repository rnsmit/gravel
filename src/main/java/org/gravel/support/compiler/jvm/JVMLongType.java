package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMPrimitiveType;
import org.gravel.support.compiler.jvm.JVMPrimitiveType.JVMPrimitiveType_Factory;
import org.gravel.support.compiler.jvm.JVMNodeVisitor;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.CastObjectToLong;
import org.gravel.support.compiler.jvm.CastTo;

public class JVMLongType extends JVMPrimitiveType implements Cloneable {

	public static JVMLongType_Factory factory = new JVMLongType_Factory();

	public static class JVMLongType_Factory extends JVMPrimitiveType_Factory {

		public JVMLongType basicNew() {
			JVMLongType newInstance = new JVMLongType();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMLongType_(this);
	}

	@Override
	public JVMType commonSuperTypeWith_(final JVMType _aJVMType) {
		return _aJVMType.commonSuperTypeWithLong_(this);
	}

	public JVMLongType copy() {
		try {
			JVMLongType _temp1 = (JVMLongType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMLongType descriptorOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	public JVMLongType_Factory factory() {
		return factory;
	}

	@Override
	public boolean isLongType() {
		return true;
	}

	@Override
	public CastObjectToLong newCastInstructionFromDynamicObject() {
		return CastObjectToLong.factory.basicNew();
	}

	@Override
	public CastTo newCastInstructionTo_(final JVMType _aJVMType) {
		return _aJVMType.newCastInstructionFromLong();
	}

	@Override
	public JVMLongType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMLongType sourceOn_(final StringBuilder _aStream) {
		_aStream.append('J');
		return this;
	}
}
