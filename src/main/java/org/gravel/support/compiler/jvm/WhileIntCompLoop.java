package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.WhileLoop;
import org.gravel.support.compiler.jvm.WhileLoop.WhileLoop_Factory;
import org.gravel.support.compiler.jvm.Frame;
import org.gravel.support.compiler.jvm.JVMStack;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.JVMType;

public class WhileIntCompLoop extends WhileLoop implements Cloneable {

	public static WhileIntCompLoop_Factory factory = new WhileIntCompLoop_Factory();

	Frame _incFrame;

	public static class WhileIntCompLoop_Factory extends WhileLoop_Factory {

		public WhileIntCompLoop basicNew() {
			WhileIntCompLoop newInstance = new WhileIntCompLoop();
			newInstance.initialize();
			return newInstance;
		}

		public WhileIntCompLoop incFrame_testFrame_doFrame_(final Frame _aFrame, final Frame _aFrame2, final Frame _aFrame3) {
			return ((WhileIntCompLoop) this.basicNew().initializeIncFrame_testFrame_doFrame_(_aFrame, _aFrame2, _aFrame3));
		}
	}

	static public WhileIntCompLoop _incFrame_testFrame_doFrame_(Object receiver, final Frame _aFrame, final Frame _aFrame2, final Frame _aFrame3) {
		return factory.incFrame_testFrame_doFrame_(_aFrame, _aFrame2, _aFrame3);
	}

	public WhileIntCompLoop copy() {
		try {
			WhileIntCompLoop _temp1 = (WhileIntCompLoop) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		super.effectStack_(_aJVMStack);
		org.gravel.support.jvm.ObjectExtensions.assert_(this, org.gravel.support.jvm.IntegerExtensions.equals_(_testFrame.endStack().size(), 2));
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _testFrame.endStack().peek().isIntType());
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _testFrame.endStack().peek_(2).isIntType());
		org.gravel.support.jvm.ObjectExtensions.assert_(this, _incFrame.endStack().isEmpty());
		return this;
	}

	public WhileIntCompLoop_Factory factory() {
		return factory;
	}

	public Frame incFrame() {
		return _incFrame;
	}

	public WhileIntCompLoop initializeIncFrame_testFrame_doFrame_(final Frame _aFrame, final Frame _aFrame2, final Frame _aFrame3) {
		_incFrame = _aFrame;
		_testFrame = _aFrame2;
		_doFrame = _aFrame3;
		this.initialize();
		return this;
	}

	@Override
	public WhileIntCompLoop initializeTestFrame_doFrame_(final Frame _aFrame, final Frame _aFrame2) {
		_testFrame = _aFrame;
		_doFrame = _aFrame2;
		this.initialize();
		return this;
	}

	@Override
	public WhileIntCompLoop printOn_(final StringBuilder _aStream) {
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
	public WhileIntCompLoop sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public WhileIntCompLoop withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return WhileIntCompLoop.this;
		}
		throw new RuntimeException("niy");
	}
}
