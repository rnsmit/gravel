package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.NumberLiteralNode;
import st.gravel.support.compiler.ast.NumberLiteralNode.NumberLiteralNode_Factory;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class IntegerLiteralNode extends NumberLiteralNode implements Cloneable {

	public static IntegerLiteralNode_Factory factory = new IntegerLiteralNode_Factory();

	java.math.BigInteger _integer;

	public static class IntegerLiteralNode_Factory extends NumberLiteralNode_Factory {

		public IntegerLiteralNode basicNew() {
			IntegerLiteralNode newInstance = new IntegerLiteralNode();
			newInstance.initialize();
			return newInstance;
		}

		public IntegerLiteralNode integer_(final java.math.BigInteger _anInteger) {
			return ((IntegerLiteralNode) this.basicNew().initializeInteger_(_anInteger));
		}
	}

	static public IntegerLiteralNode _integer_(Object receiver, final java.math.BigInteger _anInteger) {
		return factory.integer_(_anInteger);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitIntegerLiteralNode_(this);
	}

	@Override
	public IntegerLiteralNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public IntegerLiteralNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return IntegerLiteralNode.this;
			}
		});
		return this;
	}

	public IntegerLiteralNode copy() {
		try {
			IntegerLiteralNode _temp1 = (IntegerLiteralNode) this.clone();
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
		if (this._integer == null) {
			if (!(((IntegerLiteralNode) _anObject)._integer == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.LargeIntegerExtensions.equals_(this._integer, ((IntegerLiteralNode) _anObject)._integer)) {
				return false;
			}
		}
		return true;
	}

	public IntegerLiteralNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ _integer.hashCode());
	}

	public IntegerLiteralNode initializeInteger_(final java.math.BigInteger _anInteger) {
		_integer = _anInteger;
		this.initialize();
		return this;
	}

	@Override
	public IntegerLiteralNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("" + _integer);
		return this;
	}

	public java.math.BigInteger integer() {
		return _integer;
	}

	@Override
	public boolean isIntegerLiteralNode() {
		return true;
	}

	@Override
	public IntegerLiteralNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public IntegerLiteralNode negated() {
		return IntegerLiteralNode.factory.integer_(_integer.negate());
	}

	@Override
	public IntegerLiteralNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public IntegerLiteralNode printOn_(final StringBuilder _aStream) {
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
	public IntegerLiteralNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public IntegerLiteralNode sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return IntegerLiteralNode.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	@Override
	public Object value() {
		return st.gravel.support.jvm.LargeIntegerExtensions.compressed(_integer);
	}

	@Override
	public IntegerLiteralNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public IntegerLiteralNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public IntegerLiteralNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return IntegerLiteralNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
