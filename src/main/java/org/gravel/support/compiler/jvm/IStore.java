package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.Store;
import org.gravel.support.compiler.jvm.Store.Store_Factory;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.JVMLocalDeclaration;
import org.gravel.support.compiler.jvm.JVMInstructionVisitor;

public class IStore extends Store implements Cloneable {

	public static IStore_Factory factory = new IStore_Factory();

	public static class IStore_Factory extends Store_Factory {

		public IStore basicNew() {
			IStore newInstance = new IStore();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public IStore index_type_(final int _anInteger, final JVMType _aJVMDynamicObjectType) {
			return ((IStore) this.basicNew().initializeIndex_type_(_anInteger, _aJVMDynamicObjectType));
		}

		@Override
		public IStore local_(final JVMLocalDeclaration _aJVMLocalDeclaration) {
			return ((IStore) this.index_type_(_aJVMLocalDeclaration.index(), _aJVMLocalDeclaration.type()));
		}
	}

	static public IStore _index_type_(Object receiver, final int _anInteger, final JVMType _aJVMDynamicObjectType) {
		return factory.index_type_(_anInteger, _aJVMDynamicObjectType);
	}

	static public IStore _local_(Object receiver, final JVMLocalDeclaration _aJVMLocalDeclaration) {
		return factory.local_(_aJVMLocalDeclaration);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitIStore_(this);
	}

	public IStore copy() {
		try {
			IStore _temp1 = (IStore) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public IStore_Factory factory() {
		return factory;
	}

	@Override
	public IStore initializeIndex_type_(final int _anInteger, final JVMType _aJVMDynamicObjectType) {
		_index = _anInteger;
		_type = _aJVMDynamicObjectType;
		this.initialize();
		return this;
	}

	@Override
	public IStore printOn_(final StringBuilder _aStream) {
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
	public IStore sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public IStore withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return IStore.this;
		}
		throw new RuntimeException("niy");
	}
}
