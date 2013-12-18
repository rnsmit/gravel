package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMVariable;
import org.gravel.support.compiler.jvm.JVMVariable.JVMVariable_Factory;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMNodeVisitor;

public class JVMLocalDeclaration extends JVMVariable implements Cloneable {

	public static JVMLocalDeclaration_Factory factory = new JVMLocalDeclaration_Factory();

	int _index;

	public static class JVMLocalDeclaration_Factory extends JVMVariable_Factory {

		public JVMLocalDeclaration basicNew() {
			JVMLocalDeclaration newInstance = new JVMLocalDeclaration();
			newInstance.initialize();
			return newInstance;
		}

		public JVMLocalDeclaration varName_type_index_(final String _aString, final JVMType _aJVMObjectType, final int _anInteger) {
			return this.basicNew().initializeVarName_type_index_(_aString, _aJVMObjectType, _anInteger);
		}
	}

	static public JVMLocalDeclaration _varName_type_index_(Object receiver, final String _aString, final JVMType _aJVMObjectType, final int _anInteger) {
		return factory.varName_type_index_(_aString, _aJVMObjectType, _anInteger);
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMLocalDeclaration_(this);
	}

	public JVMLocalDeclaration copy() {
		try {
			JVMLocalDeclaration _temp1 = (JVMLocalDeclaration) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public JVMLocalDeclaration_Factory factory() {
		return factory;
	}

	public int index() {
		return _index;
	}

	public JVMLocalDeclaration initializeVarName_type_index_(final String _aString, final JVMType _aJVMObjectType, final int _anInteger) {
		_varName = _aString;
		_type = _aJVMObjectType;
		_index = _anInteger;
		this.initialize();
		return this;
	}

	@Override
	public JVMLocalDeclaration printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMLocalDeclaration sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_varName);
		return this;
	}
}
