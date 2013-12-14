package org.gravel.support.parser;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.parser.MethodDiff;
import org.gravel.support.parser.MethodDiff.MethodDiff_Factory;
import org.gravel.support.parser.Reference;
import org.gravel.support.parser.MethodNode;
import org.gravel.support.parser.DiffVisitor;

abstract public class RemoveMethodDiff extends MethodDiff implements Cloneable {

	public static RemoveMethodDiff_Factory factory = new RemoveMethodDiff_Factory();

	public static class RemoveMethodDiff_Factory extends MethodDiff_Factory {

		public RemoveMethodDiff basicNew() {
			throw new RuntimeException("RemoveMethodDiff is an abstract class");
		}

		@Override
		public RemoveMethodDiff reference_methodNode_(final Reference _anAbsoluteReference, final MethodNode _anUnaryMethodNode) {
			return ((RemoveMethodDiff) this.basicNew().initializeReference_methodNode_(_anAbsoluteReference, _anUnaryMethodNode));
		}
	}

	static public RemoveMethodDiff _reference_methodNode_(Object receiver, final Reference _anAbsoluteReference, final MethodNode _anUnaryMethodNode) {
		return factory.reference_methodNode_(_anAbsoluteReference, _anUnaryMethodNode);
	}

	@Override
	public DiffVisitor accept_(final DiffVisitor _visitor) {
		return _visitor.visitRemoveMethodDiff_(this);
	}

	public RemoveMethodDiff copy() {
		try {
			RemoveMethodDiff _temp1 = (RemoveMethodDiff) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public RemoveMethodDiff_Factory factory() {
		return factory;
	}

	@Override
	public RemoveMethodDiff initializeReference_methodNode_(final Reference _anAbsoluteReference, final MethodNode _anUnaryMethodNode) {
		_reference = _anAbsoluteReference;
		_methodNode = _anUnaryMethodNode;
		this.initialize();
		return this;
	}

	@Override
	public RemoveMethodDiff printDescriptionOn_(final StringBuilder _aStream) {
		_aStream.append(_reference.toString());
		return this;
	}
}