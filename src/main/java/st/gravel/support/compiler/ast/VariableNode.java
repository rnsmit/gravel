package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.Expression.Expression_Factory;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.AssignmentNode;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class VariableNode extends Expression implements Cloneable {

	public static VariableNode_Factory factory = new VariableNode_Factory();

	String _name;

	public static class VariableNode_Factory extends Expression_Factory {

		public VariableNode basicNew() {
			VariableNode newInstance = new VariableNode();
			newInstance.initialize();
			return newInstance;
		}

		public VariableNode name_(final String _aString) {
			st.gravel.support.jvm.ObjectExtensions.deny_(this, st.gravel.support.jvm.StringExtensions.equals_(_aString, "nil"));
			return ((VariableNode) this.basicNew().initializeName_(_aString));
		}
	}

	static public VariableNode _name_(Object receiver, final String _aString) {
		return factory.name_(_aString);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitVariableNode_(this);
	}

	@Override
	public VariableNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public VariableNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return VariableNode.this;
			}
		});
		return this;
	}

	public AssignmentNode assign_(final Expression _anExpression) {
		return AssignmentNode.factory.variable_value_(this, _anExpression);
	}

	public VariableNode copy() {
		try {
			VariableNode _temp1 = (VariableNode) this.clone();
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
		if (this._name == null) {
			if (!(((VariableNode) _anObject)._name == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.StringExtensions.equals_(this._name, ((VariableNode) _anObject)._name)) {
				return false;
			}
		}
		return true;
	}

	public VariableNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ _name.hashCode());
	}

	public VariableNode initializeName_(final String _aString) {
		_name = _aString;
		this.initialize();
		return this;
	}

	@Override
	public VariableNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append(_name);
		return this;
	}

	@Override
	public boolean isAssignable() {
		return true;
	}

	@Override
	public boolean isSelfNode() {
		return st.gravel.support.jvm.StringExtensions.equals_(_name, "self");
	}

	@Override
	public boolean isSuperNode() {
		return st.gravel.support.jvm.StringExtensions.equals_(_name, "super");
	}

	@Override
	public boolean isVariableNode() {
		return true;
	}

	@Override
	public VariableNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_(_name);
		return this;
	}

	public String name() {
		return _name;
	}

	@Override
	public boolean needsBrackets() {
		return false;
	}

	@Override
	public VariableNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		return this;
	}

	@Override
	public int precedence() {
		return 0;
	}

	@Override
	public VariableNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public VariableNode printOn_(final StringBuilder _aStream) {
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
	public VariableNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public boolean referencesVariable_(final String _aString) {
		return st.gravel.support.jvm.StringExtensions.equals_(_name, _aString);
	}

	@Override
	public VariableNode sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return VariableNode.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	@Override
	public VariableNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public VariableNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public VariableNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return VariableNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
