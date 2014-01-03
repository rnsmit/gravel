package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMDefinedObjectType;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;

public class PutStatic extends JVMInstruction implements Cloneable {

	public static PutStatic_Factory factory = new PutStatic_Factory();

	String _name;

	JVMDefinedObjectType _ownerType;

	JVMType _type;

	public static class PutStatic_Factory extends JVMInstruction_Factory {

		public PutStatic basicNew() {
			PutStatic newInstance = new PutStatic();
			newInstance.initialize();
			return newInstance;
		}

		public PutStatic ownerType_name_type_(final JVMDefinedObjectType _aJVMDefinedObjectType, final String _aString, final JVMType _aJVMDefinedObjectType2) {
			return this.basicNew().initializeOwnerType_name_type_(_aJVMDefinedObjectType, _aString, _aJVMDefinedObjectType2);
		}
	}

	static public PutStatic _ownerType_name_type_(Object receiver, final JVMDefinedObjectType _aJVMDefinedObjectType, final String _aString, final JVMType _aJVMDefinedObjectType2) {
		return factory.ownerType_name_type_(_aJVMDefinedObjectType, _aString, _aJVMDefinedObjectType2);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitPutStatic_(this);
	}

	public PutStatic copy() {
		try {
			PutStatic _temp1 = (PutStatic) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		_aJVMStack.pop();
		return this;
	}

	public PutStatic_Factory factory() {
		return factory;
	}

	public PutStatic initializeOwnerType_name_type_(final JVMDefinedObjectType _aJVMDefinedObjectType, final String _aString, final JVMType _aJVMDefinedObjectType2) {
		_ownerType = _aJVMDefinedObjectType;
		_name = _aString;
		_type = _aJVMDefinedObjectType2;
		this.initialize();
		return this;
	}

	public String name() {
		return _name;
	}

	public JVMDefinedObjectType ownerType() {
		return _ownerType;
	}

	@Override
	public PutStatic printOn_(final StringBuilder _aStream) {
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
	public PutStatic sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return _type;
	}

	@Override
	public PutStatic withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return PutStatic.this;
		}
		throw new RuntimeException("niy");
	}
}
