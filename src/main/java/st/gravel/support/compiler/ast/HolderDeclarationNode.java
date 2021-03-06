package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.VariableDeclarationNode;
import st.gravel.support.compiler.ast.VariableDeclarationNode.VariableDeclarationNode_Factory;
import st.gravel.support.compiler.ast.TypeNode;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class HolderDeclarationNode extends VariableDeclarationNode implements Cloneable {

	public static HolderDeclarationNode_Factory factory = new HolderDeclarationNode_Factory();

	public static class HolderDeclarationNode_Factory extends VariableDeclarationNode_Factory {

		public HolderDeclarationNode basicNew() {
			HolderDeclarationNode newInstance = new HolderDeclarationNode();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public HolderDeclarationNode name_type_(final String _aString, final TypeNode _aVariableNode) {
			return ((HolderDeclarationNode) this.basicNew().initializeName_type_(_aString, _aVariableNode));
		}
	}

	static public HolderDeclarationNode _name_type_(Object receiver, final String _aString, final TypeNode _aVariableNode) {
		return factory.name_type_(_aString, _aVariableNode);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitHolderDeclarationNode_(this);
	}

	@Override
	public HolderDeclarationNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public HolderDeclarationNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return HolderDeclarationNode.this;
			}
		});
		return this;
	}

	public HolderDeclarationNode copy() {
		try {
			HolderDeclarationNode _temp1 = (HolderDeclarationNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public HolderDeclarationNode_Factory factory() {
		return factory;
	}

	@Override
	public HolderDeclarationNode initializeName_type_(final String _aString, final TypeNode _aVariableNode) {
		_name = _aString;
		_type = _aVariableNode;
		this.initialize();
		return this;
	}

	@Override
	public boolean isHolderDeclarationNode() {
		return true;
	}

	@Override
	public HolderDeclarationNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_(_name);
		return this;
	}

	@Override
	public HolderDeclarationNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public HolderDeclarationNode printOn_(final StringBuilder _aStream) {
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
	public HolderDeclarationNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public HolderDeclarationNode sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_name);
		if (_type != null) {
			_aStream.append(' ');
			_aStream.append("{");
			_type.innerSourceOn_(_aStream);
			_aStream.append('}');
		}
		return this;
	}

	@Override
	public HolderDeclarationNode typeDefsDo_(final st.gravel.support.jvm.Block1<Object, TypeNode> _aBlock) {
		if (_type != null) {
			_type.typeDefsDo_(_aBlock);
		}
		return this;
	}

	@Override
	public HolderDeclarationNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public HolderDeclarationNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public HolderDeclarationNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return HolderDeclarationNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
