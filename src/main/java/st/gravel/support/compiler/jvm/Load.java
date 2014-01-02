package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMInstruction.JVMInstruction_Factory;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.ALoad;
import st.gravel.support.compiler.jvm.ILoad;
import st.gravel.support.compiler.jvm.JVMLocalDeclaration;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;

public class Load extends JVMInstruction implements Cloneable {

	public static Load_Factory factory = new Load_Factory();

	int _index;

	JVMType _type;

	public static class Load_Factory extends JVMInstruction_Factory {

		public Load basicNew() {
			Load newInstance = new Load();
			newInstance.initialize();
			return newInstance;
		}

		public Load index_type_(final int _anInteger, final JVMType _aJVMType) {
			if (_aJVMType.isObjectType() || _aJVMType.isArrayType()) {
				return ALoad.factory.basicNew().initializeIndex_type_(_anInteger, _aJVMType);
			}
			if (_aJVMType.isIntType()) {
				return ILoad.factory.basicNew().initializeIndex_type_(_anInteger, _aJVMType);
			}
			st.gravel.support.jvm.ObjectExtensions.halt(this);
			return Load.factory.basicNew().initializeIndex_type_(_anInteger, _aJVMType);
		}

		public Load local_(final JVMLocalDeclaration _aJVMLocalDeclaration) {
			return this.index_type_(_aJVMLocalDeclaration.index(), _aJVMLocalDeclaration.type());
		}
	}

	static public Load _index_type_(Object receiver, final int _anInteger, final JVMType _aJVMType) {
		return factory.index_type_(_anInteger, _aJVMType);
	}

	static public Load _local_(Object receiver, final JVMLocalDeclaration _aJVMLocalDeclaration) {
		return factory.local_(_aJVMLocalDeclaration);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitLoad_(this);
	}

	public Load copy() {
		try {
			Load _temp1 = (Load) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		_aJVMStack.push_(_type);
		return this;
	}

	public Load_Factory factory() {
		return factory;
	}

	public int index() {
		return _index;
	}

	public Load initializeIndex_type_(final int _anInteger, final JVMType _aJVMDynamicObjectType) {
		_index = _anInteger;
		_type = _aJVMDynamicObjectType;
		this.initialize();
		return this;
	}

	@Override
	public Load printOn_(final StringBuilder _aStream) {
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
	public Load sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return _type;
	}

	@Override
	public Load withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return Load.this;
		}
		throw new RuntimeException("niy");
	}
}
