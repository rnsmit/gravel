package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.Node.Node_Factory;
import st.gravel.support.compiler.ast.TypeNode;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Reference;
import st.gravel.support.compiler.ast.BoundVariableDeclarationNode;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class VariableDeclarationNode extends Node implements Cloneable {

	public static VariableDeclarationNode_Factory factory = new VariableDeclarationNode_Factory();

	String _name;

	TypeNode _type;

	public static class VariableDeclarationNode_Factory extends Node_Factory {

		public VariableDeclarationNode basicNew() {
			VariableDeclarationNode newInstance = new VariableDeclarationNode();
			newInstance.initialize();
			return newInstance;
		}

		public VariableDeclarationNode name_(final String _aString) {
			return this.name_type_(_aString, null);
		}

		public VariableDeclarationNode name_type_(final String _aString, final TypeNode _aVariableNode) {
			return ((VariableDeclarationNode) this.basicNew().initializeName_type_(_aString, _aVariableNode));
		}
	}

	static public VariableDeclarationNode _name_(Object receiver, final String _aString) {
		return factory.name_(_aString);
	}

	static public VariableDeclarationNode _name_type_(Object receiver, final String _aString, final TypeNode _aVariableNode) {
		return factory.name_type_(_aString, _aVariableNode);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitVariableDeclarationNode_(this);
	}

	@Override
	public VariableDeclarationNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public VariableDeclarationNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return VariableDeclarationNode.this;
			}
		});
		return this;
	}

	public VariableDeclarationNode copy() {
		try {
			VariableDeclarationNode _temp1 = (VariableDeclarationNode) this.clone();
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
			if (!(((VariableDeclarationNode) _anObject)._name == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.StringExtensions.equals_(this._name, ((VariableDeclarationNode) _anObject)._name)) {
				return false;
			}
		}
		if (this._type == null) {
			if (!(((VariableDeclarationNode) _anObject)._type == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.ObjectExtensions.equals_(this._type, ((VariableDeclarationNode) _anObject)._type)) {
				return false;
			}
		}
		return true;
	}

	public VariableDeclarationNode_Factory factory() {
		return factory;
	}

	@Override
	public int hashCode() {
		return ((super.hashCode() ^ _name.hashCode()) ^ (_type == null ? 0 : _type.hashCode()));
	}

	public VariableDeclarationNode initializeName_type_(final String _aString, final TypeNode _aVariableNode) {
		_name = _aString;
		_type = _aVariableNode;
		this.initialize();
		return this;
	}

	public boolean isHolderDeclarationNode() {
		return false;
	}

	@Override
	public VariableDeclarationNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_(_name);
		return this;
	}

	public String name() {
		return _name;
	}

	@Override
	public VariableDeclarationNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		return this;
	}

	@Override
	public VariableDeclarationNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public VariableDeclarationNode printOn_(final StringBuilder _aStream) {
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
	public VariableDeclarationNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public VariableDeclarationNode sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_name);
		if (_type != null) {
			_aStream.append(' ');
			_aStream.append("{");
			_type.innerSourceOn_(_aStream);
			_aStream.append('}');
		}
		return this;
	}

	public TypeNode type() {
		return _type;
	}

	public VariableDeclarationNode typeDefsDo_(final st.gravel.support.jvm.Block1<Object, TypeNode> _aBlock) {
		if (_type != null) {
			_type.typeDefsDo_(_aBlock);
		}
		return this;
	}

	@Override
	public VariableDeclarationNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public VariableDeclarationNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	public BoundVariableDeclarationNode withOwnerType_(final Reference _aReference) {
		return BoundVariableDeclarationNode.factory.name_type_ownerType_(_name, _type, _aReference);
	}

	@Override
	public VariableDeclarationNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return VariableDeclarationNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
