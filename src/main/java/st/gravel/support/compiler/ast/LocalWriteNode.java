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
import st.gravel.support.compiler.ast.AssignmentNode;
import st.gravel.support.compiler.ast.VariableNode;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class LocalWriteNode extends StateAccessNode implements Cloneable {

	public static LocalWriteNode_Factory factory = new LocalWriteNode_Factory();

	String _name;

	Expression _value;

	public static class LocalWriteNode_Factory extends StateAccessNode_Factory {

		public LocalWriteNode basicNew() {
			LocalWriteNode newInstance = new LocalWriteNode();
			newInstance.initialize();
			return newInstance;
		}

		public LocalWriteNode name_value_(final String _aString, final Expression _anUnaryMessageNode) {
			return this.basicNew().initializeName_value_(_aString, _anUnaryMessageNode);
		}
	}

	static public LocalWriteNode _name_value_(Object receiver, final String _aString, final Expression _anUnaryMessageNode) {
		return factory.name_value_(_aString, _anUnaryMessageNode);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitLocalWriteNode_(this);
	}

	@Override
	public LocalWriteNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public LocalWriteNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return LocalWriteNode.this;
			}
		});
		return this;
	}

	public LocalWriteNode copy() {
		try {
			LocalWriteNode _temp1 = (LocalWriteNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public LocalWriteNode_Factory factory() {
		return factory;
	}

	public LocalWriteNode initializeName_value_(final String _aString, final Expression _anUnaryMessageNode) {
		_name = _aString;
		_value = _anUnaryMessageNode;
		this.initialize();
		return this;
	}

	@Override
	public LocalWriteNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{");
		_aStream.append(_name);
		_aStream.append(" := ");
		_value.sourceOn_(_aStream);
		_aStream.append("}");
		return this;
	}

	@Override
	public LocalWriteNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_(_name);
		return this;
	}

	@Override
	public String name() {
		return _name;
	}

	@Override
	public LocalWriteNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_value);
		return this;
	}

	@Override
	public LocalWriteNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public LocalWriteNode printOn_(final StringBuilder _aStream) {
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
	public LocalWriteNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public boolean referencesVariable_(final String _aString) {
		return st.gravel.support.jvm.StringExtensions.equals_(_name, _aString);
	}

	@Override
	public LocalWriteNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public Expression unoptimized() {
		return AssignmentNode.factory.variable_value_(VariableNode.factory.name_(this.name()), _value);
	}

	public Expression value() {
		return _value;
	}

	@Override
	public LocalWriteNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public LocalWriteNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public LocalWriteNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return LocalWriteNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
