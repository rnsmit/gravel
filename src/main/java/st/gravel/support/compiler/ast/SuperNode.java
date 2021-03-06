package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.StateAccessNode;
import st.gravel.support.compiler.ast.StateAccessNode.StateAccessNode_Factory;
import st.gravel.support.compiler.ast.Reference;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class SuperNode extends StateAccessNode implements Cloneable {

	public static SuperNode_Factory factory = new SuperNode_Factory();

	Reference _reference;

	public static class SuperNode_Factory extends StateAccessNode_Factory {

		public SuperNode basicNew() {
			SuperNode newInstance = new SuperNode();
			newInstance.initialize();
			return newInstance;
		}

		public SuperNode reference_(final Reference _anAbsoluteReference) {
			return ((SuperNode) this.basicNew().initializeReference_(_anAbsoluteReference));
		}
	}

	static public SuperNode _reference_(Object receiver, final Reference _anAbsoluteReference) {
		return factory.reference_(_anAbsoluteReference);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitSuperNode_(this);
	}

	@Override
	public SuperNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public SuperNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return SuperNode.this;
			}
		});
		return this;
	}

	public SuperNode copy() {
		try {
			SuperNode _temp1 = (SuperNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public SuperNode_Factory factory() {
		return factory;
	}

	public SuperNode initializeReference_(final Reference _aReference) {
		_reference = _aReference;
		this.initialize();
		return this;
	}

	@Override
	public SuperNode innerSourceOn_(final StringBuilder _aStream) {
		_aStream.append("{(super of ");
		_aStream.append(_reference.toString());
		_aStream.append(") super}");
		return this;
	}

	@Override
	public boolean isSuperNode() {
		return true;
	}

	@Override
	public SuperNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_("super");
		return this;
	}

	@Override
	public String name() {
		return "super";
	}

	@Override
	public SuperNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		return this;
	}

	@Override
	public SuperNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public SuperNode printOn_(final StringBuilder _aStream) {
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
	public SuperNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	public Reference reference() {
		return _reference;
	}

	@Override
	public boolean referencesVariable_(final String _aString) {
		return st.gravel.support.jvm.StringExtensions.equals_(_aString, "super");
	}

	@Override
	public SuperNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public SuperNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public SuperNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public SuperNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return SuperNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
