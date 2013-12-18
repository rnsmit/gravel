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
import org.gravel.support.compiler.jvm.CastObjectToChar;
import org.gravel.support.compiler.jvm.CastTo;

public class JVMCharType extends JVMPrimitiveType implements Cloneable {

	public static JVMCharType_Factory factory = new JVMCharType_Factory();

	public static class JVMCharType_Factory extends JVMPrimitiveType_Factory {

		public JVMCharType basicNew() {
			JVMCharType newInstance = new JVMCharType();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMCharType_(this);
	}

	@Override
	public JVMType commonSuperTypeWith_(final JVMType _aJVMType) {
		return _aJVMType.commonSuperTypeWithChar_(this);
	}

	public JVMCharType copy() {
		try {
			JVMCharType _temp1 = (JVMCharType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMCharType descriptorOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	public JVMCharType_Factory factory() {
		return factory;
	}

	@Override
	public boolean isCharType() {
		return true;
	}

	@Override
	public CastObjectToChar newCastInstructionFromDynamicObject() {
		return CastObjectToChar.factory.basicNew();
	}

	@Override
	public CastTo newCastInstructionTo_(final JVMType _aJVMType) {
		return _aJVMType.newCastInstructionFromChar();
	}

	@Override
	public JVMCharType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMCharType sourceOn_(final StringBuilder _aStream) {
		_aStream.append('C');
		return this;
	}
}
