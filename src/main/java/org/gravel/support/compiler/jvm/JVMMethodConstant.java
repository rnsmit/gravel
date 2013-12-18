package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.jvm.Frame;
import org.gravel.support.compiler.jvm.JVMDefinedObjectType;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.GetStatic;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.PutStatic;
import org.gravel.support.compiler.jvm.JVMField;

public class JVMMethodConstant extends Object implements Cloneable {

	public static JVMMethodConstant_Factory factory = new JVMMethodConstant_Factory();

	Expression _expression;

	Frame _frame;

	String _name;

	JVMDefinedObjectType _ownerType;

	JVMType _type;

	public static class JVMMethodConstant_Factory extends org.gravel.support.jvm.SmalltalkFactory {

		public JVMMethodConstant basicNew() {
			JVMMethodConstant newInstance = new JVMMethodConstant();
			newInstance.initialize();
			return newInstance;
		}

		public JVMMethodConstant expression_name_frame_ownerType_(final Expression _anExpression, final String _aString, final Frame _aFrame, final JVMDefinedObjectType _aJVMDefinedObjectType) {
			return this.expression_name_frame_ownerType_type_(_anExpression, _aString, _aFrame, _aJVMDefinedObjectType, _aFrame.endStack().peek());
		}

		public JVMMethodConstant expression_name_frame_ownerType_type_(final Expression _anExpression, final String _aString, final Frame _aFrame, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMType _type) {
			return this.basicNew().initializeExpression_name_frame_ownerType_type_(_anExpression, _aString, _aFrame, _aJVMDefinedObjectType, _type);
		}
	}

	static public JVMMethodConstant _expression_name_frame_ownerType_(Object receiver, final Expression _anExpression, final String _aString, final Frame _aFrame, final JVMDefinedObjectType _aJVMDefinedObjectType) {
		return factory.expression_name_frame_ownerType_(_anExpression, _aString, _aFrame, _aJVMDefinedObjectType);
	}

	static public JVMMethodConstant _expression_name_frame_ownerType_type_(Object receiver, final Expression _anExpression, final String _aString, final Frame _aFrame, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMType _type) {
		return factory.expression_name_frame_ownerType_type_(_anExpression, _aString, _aFrame, _aJVMDefinedObjectType, _type);
	}

	public GetStatic asReadInstruction() {
		return GetStatic.factory.ownerType_name_type_(_ownerType, _name, this.type());
	}

	public JVMInstruction[] clinitInstructions() {
		return org.gravel.support.jvm.ArrayFactory.with_with_(_frame, PutStatic.factory.ownerType_name_type_(_ownerType, _name, _type));
	}

	public JVMMethodConstant copy() {
		try {
			JVMMethodConstant _temp1 = (JVMMethodConstant) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public Expression expression() {
		return _expression;
	}

	public JVMMethodConstant_Factory factory() {
		return factory;
	}

	public JVMField fieldDefinition() {
		return JVMField.factory.ownerType_varName_type_isStatic_(_ownerType, _name, _type, true);
	}

	public Frame frame() {
		return _frame;
	}

	public JVMMethodConstant initialize() {
		return this;
	}

	public JVMMethodConstant initializeExpression_name_frame_ownerType_type_(final Expression _anExpression, final String _aString, final Frame _aFrame, final JVMDefinedObjectType _aJVMDefinedObjectType, final JVMType _aType) {
		_expression = _anExpression;
		_name = _aString;
		_frame = _aFrame;
		_ownerType = _aJVMDefinedObjectType;
		_type = _aType;
		this.initialize();
		return this;
	}

	public String name() {
		return _name;
	}

	public JVMDefinedObjectType ownerType() {
		return _ownerType;
	}

	public JVMMethodConstant postCopy() {
		return this;
	}

	public JVMType type() {
		return _frame.type();
	}
}
