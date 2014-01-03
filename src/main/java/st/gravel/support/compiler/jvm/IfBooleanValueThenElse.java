package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.IfThenElse;
import st.gravel.support.compiler.jvm.IfThenElse.IfThenElse_Factory;
import st.gravel.support.compiler.jvm.PushTrue;
import st.gravel.support.compiler.jvm.PushFalse;
import st.gravel.support.compiler.jvm.Frame;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMType;

public class IfBooleanValueThenElse extends IfThenElse implements Cloneable {

	public static IfBooleanValueThenElse_Factory factory = new IfBooleanValueThenElse_Factory();

	public static class IfBooleanValueThenElse_Factory extends IfThenElse_Factory {

		public IfBooleanValueThenElse basicNew() {
			IfBooleanValueThenElse newInstance = new IfBooleanValueThenElse();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public IfBooleanValueThenElse r_boolean() {
			return ((IfBooleanValueThenElse) this.trueFrame_falseFrame_(PushTrue.factory.basicNew().asFrame(), PushFalse.factory.basicNew().asFrame()));
		}

		@Override
		public IfBooleanValueThenElse trueFrame_falseFrame_(final Frame _aFrame, final Frame _aFrame2) {
			return ((IfBooleanValueThenElse) this.basicNew().initializeTrueFrame_falseFrame_(_aFrame, _aFrame2));
		}
	}

	static public IfBooleanValueThenElse _r_boolean(Object receiver) {
		return factory.r_boolean();
	}

	static public IfBooleanValueThenElse _trueFrame_falseFrame_(Object receiver, final Frame _aFrame, final Frame _aFrame2) {
		return factory.trueFrame_falseFrame_(_aFrame, _aFrame2);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitIfBooleanValueThenElse_(this);
	}

	public IfBooleanValueThenElse copy() {
		try {
			IfBooleanValueThenElse _temp1 = (IfBooleanValueThenElse) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public IfBooleanValueThenElse_Factory factory() {
		return factory;
	}

	@Override
	public IfBooleanValueThenElse initialize() {
		if (_trueFrame == null) {
			_trueFrame = PushTrue.factory.basicNew().asFrame();
		}
		if (_falseFrame == null) {
			_falseFrame = PushFalse.factory.basicNew().asFrame();
		}
		return this;
	}

	@Override
	public IfBooleanValueThenElse initializeTrueFrame_falseFrame_(final Frame _aFrame, final Frame _aFrame2) {
		_trueFrame = _aFrame;
		_falseFrame = _aFrame2;
		this.initialize();
		return this;
	}

	@Override
	public IfBooleanValueThenElse printOn_(final StringBuilder _aStream) {
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
	public IfBooleanValueThenElse pushTypeOnStack_(final JVMStack _aJVMStack) {
		if (!this.type().isBottomType()) {
			_aJVMStack.push_(IfBooleanValueThenElse.this.type());
		}
		return this;
	}

	@Override
	public IfBooleanValueThenElse sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public IfBooleanValueThenElse withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return IfBooleanValueThenElse.this;
		}
		throw new RuntimeException("niy");
	}
}
