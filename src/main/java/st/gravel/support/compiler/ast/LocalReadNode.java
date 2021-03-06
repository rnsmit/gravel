package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.StateAccessNode;
import st.gravel.support.compiler.ast.StateAccessNode.StateAccessNode_Factory;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class LocalReadNode extends StateAccessNode implements Cloneable {

	public static LocalReadNode_Factory factory = new LocalReadNode_Factory();

	String _name;

	public static class LocalReadNode_Factory extends StateAccessNode_Factory {

		public LocalReadNode basicNew() {
			LocalReadNode newInstance = new LocalReadNode();
			newInstance.initialize();
			return newInstance;
		}

		public LocalReadNode name_(final String _aString) {
			return this.basicNew().initializeName_(_aString);
		}
	}

	static public LocalReadNode _name_(Object receiver, final String _aString) {
		return factory.name_(_aString);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitLocalReadNode_(this);
	}

	@Override
	public LocalReadNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public LocalReadNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return LocalReadNode.this;
			}
		});
		return this;
	}

	public LocalReadNode copy() {
		try {
			LocalReadNode _temp1 = (LocalReadNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public LocalReadNode_Factory factory() {
		return factory;
	}

	public LocalReadNode initializeName_(final String _aString) {
		_name = _aString;
		this.initialize();
		return this;
	}

	@Override
	public LocalReadNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{");
		_aStream.append(_name);
		_aStream.append("}");
		return this;
	}

	@Override
	public boolean isVariableNode() {
		return true;
	}

	@Override
	public LocalReadNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_(_name);
		return this;
	}

	@Override
	public String name() {
		return _name;
	}

	@Override
	public LocalReadNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		return this;
	}

	@Override
	public LocalReadNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public LocalReadNode printOn_(final StringBuilder _aStream) {
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
	public LocalReadNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public boolean referencesVariable_(final String _aString) {
		return st.gravel.support.jvm.StringExtensions.equals_(_name, _aString);
	}

	@Override
	public LocalReadNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public LocalReadNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public LocalReadNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public LocalReadNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return LocalReadNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
