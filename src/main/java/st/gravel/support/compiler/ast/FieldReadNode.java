package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.StateAccessNode;
import st.gravel.support.compiler.ast.StateAccessNode.StateAccessNode_Factory;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class FieldReadNode extends StateAccessNode implements Cloneable {

	public static FieldReadNode_Factory factory = new FieldReadNode_Factory();

	String _field;

	Expression _owner;

	public static class FieldReadNode_Factory extends StateAccessNode_Factory {

		public FieldReadNode basicNew() {
			FieldReadNode newInstance = new FieldReadNode();
			newInstance.initialize();
			return newInstance;
		}

		public FieldReadNode owner_field_(final Expression _anExpression, final String _aString) {
			return this.basicNew().initializeOwner_field_(_anExpression, _aString);
		}
	}

	static public FieldReadNode _owner_field_(Object receiver, final Expression _anExpression, final String _aString) {
		return factory.owner_field_(_anExpression, _aString);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitFieldReadNode_(this);
	}

	@Override
	public FieldReadNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public FieldReadNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return FieldReadNode.this;
			}
		});
		return this;
	}

	public FieldReadNode copy() {
		try {
			FieldReadNode _temp1 = (FieldReadNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public FieldReadNode_Factory factory() {
		return factory;
	}

	public String field() {
		return _field;
	}

	public FieldReadNode initializeOwner_field_(final Expression _anExpression, final String _aString) {
		_owner = _anExpression;
		_field = _aString;
		this.initialize();
		return this;
	}

	@Override
	public FieldReadNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{");
		_owner.sourceOn_(_aStream);
		_aStream.append(".");
		_aStream.append(_field);
		_aStream.append("}");
		return this;
	}

	@Override
	public FieldReadNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public String name() {
		return _field;
	}

	@Override
	public FieldReadNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_owner);
		return this;
	}

	public Expression owner() {
		return _owner;
	}

	@Override
	public FieldReadNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public FieldReadNode printOn_(final StringBuilder _aStream) {
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
	public FieldReadNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public boolean referencesVariable_(final String _aString) {
		return st.gravel.support.jvm.StringExtensions.equals_(_field, _aString);
	}

	@Override
	public FieldReadNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public FieldReadNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public FieldReadNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public FieldReadNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return FieldReadNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
