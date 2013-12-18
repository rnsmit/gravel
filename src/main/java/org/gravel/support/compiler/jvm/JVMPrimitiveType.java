package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMType.JVMType_Factory;
import org.gravel.support.compiler.jvm.JVMNodeVisitor;

abstract public class JVMPrimitiveType extends JVMType implements Cloneable {

	public static JVMPrimitiveType_Factory factory = new JVMPrimitiveType_Factory();

	public static class JVMPrimitiveType_Factory extends JVMType_Factory {

		public JVMPrimitiveType basicNew() {
			throw new RuntimeException("JVMPrimitiveType is an abstract class");
		}
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMPrimitiveType_(this);
	}

	public JVMPrimitiveType copy() {
		try {
			JVMPrimitiveType _temp1 = (JVMPrimitiveType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMPrimitiveType descriptorOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	public JVMPrimitiveType_Factory factory() {
		return factory;
	}

	@Override
	public JVMPrimitiveType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMPrimitiveType sourceOn_(final StringBuilder _aStream) {
		_aStream.append(org.gravel.core.Symbol.value(this.getClass().getSimpleName()));
		return this;
	}
}
