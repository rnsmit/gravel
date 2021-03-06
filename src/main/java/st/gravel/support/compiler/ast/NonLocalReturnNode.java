package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.IntermediateStatement;
import st.gravel.support.compiler.ast.IntermediateStatement.IntermediateStatement_Factory;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.Statement;
import st.gravel.support.compiler.ast.ReturnNode;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class NonLocalReturnNode extends IntermediateStatement implements Cloneable {

	public static NonLocalReturnNode_Factory factory = new NonLocalReturnNode_Factory();

	String _marker;

	Expression _value;

	public static class NonLocalReturnNode_Factory extends IntermediateStatement_Factory {

		public NonLocalReturnNode basicNew() {
			NonLocalReturnNode newInstance = new NonLocalReturnNode();
			newInstance.initialize();
			return newInstance;
		}

		public NonLocalReturnNode marker_value_(final String _anObject, final Expression _anExpression) {
			return ((NonLocalReturnNode) this.basicNew().initializeMarker_value_(_anObject, _anExpression));
		}
	}

	static public NonLocalReturnNode _marker_value_(Object receiver, final String _anObject, final Expression _anExpression) {
		return factory.marker_value_(_anObject, _anExpression);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitNonLocalReturnNode_(this);
	}

	@Override
	public NonLocalReturnNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public NonLocalReturnNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return NonLocalReturnNode.this;
			}
		});
		return this;
	}

	public NonLocalReturnNode copy() {
		try {
			NonLocalReturnNode _temp1 = (NonLocalReturnNode) this.clone();
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
		if (this._marker == null) {
			if (!(((NonLocalReturnNode) _anObject)._marker == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.StringExtensions.equals_(this._marker, ((NonLocalReturnNode) _anObject)._marker)) {
				return false;
			}
		}
		if (this._value == null) {
			if (!(((NonLocalReturnNode) _anObject)._value == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.ObjectExtensions.equals_(this._value, ((NonLocalReturnNode) _anObject)._value)) {
				return false;
			}
		}
		return true;
	}

	public NonLocalReturnNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return ((super.hashCode() ^ _marker.hashCode()) ^ (_value == null ? 0 : _value.hashCode()));
	}

	@Override
	public boolean hasReturnStatements() {
		return true;
	}

	public NonLocalReturnNode initializeMarker_value_(final String _anObject, final Expression _anExpression) {
		_marker = _anObject;
		_value = _anExpression;
		this.initialize();
		return this;
	}

	@Override
	public NonLocalReturnNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{(return to ");
		_aStream.append(_marker);
		_aStream.append(") ");
		_aStream.append('^');
		_value.sourceOn_(_aStream);
		_aStream.append("}");
		return this;
	}

	@Override
	public boolean isNonLocalReturnNode() {
		return true;
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
	public NonLocalReturnNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	public String marker() {
		return _marker;
	}

	@Override
	public NonLocalReturnNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_value);
		return this;
	}

	@Override
	public NonLocalReturnNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public NonLocalReturnNode printOn_(final StringBuilder _aStream) {
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
	public NonLocalReturnNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public Expression returnValue() {
		return _value;
	}

	@Override
	public NonLocalReturnNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public Statement unoptimized() {
		return ReturnNode.factory.value_(_value);
	}

	public Expression value() {
		return _value;
	}

	@Override
	public NonLocalReturnNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public NonLocalReturnNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public NonLocalReturnNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return NonLocalReturnNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
