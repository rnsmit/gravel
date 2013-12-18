package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMNode;
import org.gravel.support.compiler.jvm.JVMNode.JVMNode_Factory;
import org.gravel.support.compiler.jvm.JVMDefinedObjectType;
import org.gravel.support.compiler.jvm.JVMField;
import org.gravel.support.compiler.jvm.JVMMethod;

public class JVMClass extends JVMNode implements Cloneable {

	public static JVMClass_Factory factory = new JVMClass_Factory();

	JVMField[] _fields;

	JVMMethod[] _methods;

	String _source;

	JVMDefinedObjectType _superType;

	JVMDefinedObjectType _type;

	public static class JVMClass_Factory extends JVMNode_Factory {

		public JVMClass basicNew() {
			JVMClass newInstance = new JVMClass();
			newInstance.initialize();
			return newInstance;
		}

		public JVMClass type_superType_fields_methods_(final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMDefinedObjectType _aJVMDefinedObjectType2, final JVMField[] _anArray, final JVMMethod[] _anArray2) {
			return this.basicNew().initializeType_superType_fields_methods_(_aJVMDefinedObjectType, _aJVMDefinedObjectType2, _anArray, _anArray2);
		}
	}

	static public JVMClass _type_superType_fields_methods_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMDefinedObjectType _aJVMDefinedObjectType2, final JVMField[] _anArray, final JVMMethod[] _anArray2) {
		return factory.type_superType_fields_methods_(_aJVMDefinedObjectType, _aJVMDefinedObjectType2, _anArray, _anArray2);
	}

	public JVMClass copy() {
		try {
			JVMClass _temp1 = (JVMClass) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public JVMClass_Factory factory() {
		return factory;
	}

	public JVMField[] fields() {
		return _fields;
	}

	public JVMClass initializeType_superType_fields_methods_(final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMDefinedObjectType _aJVMDefinedObjectType2, final JVMField[] _anArray, final JVMMethod[] _anArray2) {
		_type = _aJVMDefinedObjectType;
		_superType = _aJVMDefinedObjectType2;
		_fields = _anArray;
		_methods = _anArray2;
		this.initialize();
		return this;
	}

	public JVMMethod[] methods() {
		return _methods;
	}

	@Override
	public JVMClass printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	public String source() {
		return _source;
	}

	@Override
	public JVMClass sourceOn_(final StringBuilder _aStream) {
		_aStream.append(org.gravel.core.Symbol.value(this.getClass().getSimpleName()));
		return this;
	}

	public JVMClass source_(final String _anObject) {
		_source = _anObject;
		return this;
	}

	public JVMDefinedObjectType superType() {
		return _superType;
	}

	public JVMDefinedObjectType type() {
		return _type;
	}
}
