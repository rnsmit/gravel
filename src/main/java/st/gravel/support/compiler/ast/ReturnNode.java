package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.Statement;
import st.gravel.support.compiler.ast.Statement.Statement_Factory;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class ReturnNode extends Statement implements Cloneable {

	public static ReturnNode_Factory factory = new ReturnNode_Factory();

	Expression _value;

	public static class ReturnNode_Factory extends Statement_Factory {

		public ReturnNode basicNew() {
			ReturnNode newInstance = new ReturnNode();
			newInstance.initialize();
			return newInstance;
		}

		public ReturnNode value_(final Expression _aVariableNode) {
			return ((ReturnNode) this.basicNew().initializeValue_(_aVariableNode));
		}
	}

	static public ReturnNode _value_(Object receiver, final Expression _aVariableNode) {
		return factory.value_(_aVariableNode);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitReturnNode_(this);
	}

	@Override
	public ReturnNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ReturnNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ReturnNode.this;
			}
		});
		return this;
	}

	public ReturnNode copy() {
		try {
			ReturnNode _temp1 = (ReturnNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean equals(final Object _anObject) {
		if (!super.equals(_anObject)) {
			return false;
		}
		if (this._value == null) {
			if (!(((ReturnNode) _anObject)._value == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.ObjectExtensions.equals_(this._value, ((ReturnNode) _anObject)._value)) {
				return false;
			}
		}
		return true;
	}

	public ReturnNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ (_value == null ? 0 : _value.hashCode()));
	}

	@Override
	public boolean hasReturnStatements() {
		return true;
	}

	public ReturnNode initializeValue_(final Expression _aVariableNode) {
		_value = _aVariableNode;
		this.initialize();
		return this;
	}

	@Override
	public ReturnNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append('^');
		_value.sourceOn_(_aStream);
		return this;
	}

	@Override
	public boolean isReturnNode() {
		return true;
	}

	@Override
	public boolean isTraitRequirementMessage() {
		return _value.isTraitRequirementMessage();
	}

	@Override
	public ReturnNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public ReturnNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_value);
		return this;
	}

	@Override
	public ReturnNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ReturnNode printOn_(final StringBuilder _aStream) {
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
	public ReturnNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public Expression returnValue() {
		return null;
	}

	@Override
	public ReturnNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	public Expression value() {
		return _value;
	}

	@Override
	public ReturnNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ReturnNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public ReturnNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ReturnNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
