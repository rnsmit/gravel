package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMNode;
import st.gravel.support.compiler.jvm.JVMNode.JVMNode_Factory;
import st.gravel.support.compiler.jvm.JVMDefinedObjectType;
import st.gravel.support.compiler.jvm.JVMField;
import st.gravel.support.compiler.jvm.JVMMethod;

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

		public JVMClass type_(final JVMDefinedObjectType _aJVMDefinedObjectType) {
			return this.type_superType_fields_methods_(_aJVMDefinedObjectType, JVMDefinedObjectType.factory.object(), new JVMField[] {}, new JVMMethod[] {});
		}

		public JVMClass type_methods_(final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMMethod[] _methods) {
			return this.type_superType_fields_methods_(_aJVMDefinedObjectType, JVMDefinedObjectType.factory.object(), new JVMField[] {}, _methods);
		}

		public JVMClass type_superType_fields_methods_(final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMDefinedObjectType _aJVMDefinedObjectType2, final JVMField[] _anArray, final JVMMethod[] _anArray2) {
			return this.basicNew().initializeType_superType_fields_methods_(_aJVMDefinedObjectType, _aJVMDefinedObjectType2, _anArray, _anArray2);
		}
	}

	static public JVMClass _type_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType) {
		return factory.type_(_aJVMDefinedObjectType);
	}

	static public JVMClass _type_methods_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMMethod[] _methods) {
		return factory.type_methods_(_aJVMDefinedObjectType, _methods);
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

	public JVMField fieldNamed_ifAbsent_(final String _name, final st.gravel.support.jvm.Block0<JVMField> _aBlock) {
		return st.gravel.support.jvm.ArrayExtensions.detect_ifNone_(_fields, new st.gravel.support.jvm.Predicate1<JVMField>() {

			@Override
			public boolean value_(final JVMField _each) {
				return st.gravel.support.jvm.StringExtensions.equals_(_each.varName(), _name);
			}
		}, _aBlock);
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

	public JVMMethod methodNamed_ifAbsent_(final String _name, final st.gravel.support.jvm.Block0<JVMMethod> _aBlock) {
		return st.gravel.support.jvm.ArrayExtensions.detect_ifNone_(_methods, new st.gravel.support.jvm.Predicate1<JVMMethod>() {

			@Override
			public boolean value_(final JVMMethod _each) {
				return st.gravel.support.jvm.StringExtensions.equals_(_each.name(), _name);
			}
		}, _aBlock);
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
		super.sourceOn_(_aStream);
		_aStream.append('[');
		_aStream.append(_type.toString());
		_aStream.append(']');
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
