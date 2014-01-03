package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.TraitUsageNode;
import st.gravel.support.compiler.ast.TraitUsageNode.TraitUsageNode_Factory;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.SystemNode;
import st.gravel.support.compiler.ast.MethodNode;
import st.gravel.support.compiler.ast.SimpleTraitUsageNode;
import st.gravel.support.compiler.ast.ClassDescriptionNode;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.Reference;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class EmptyTraitUsageNode extends TraitUsageNode implements Cloneable {

	public static EmptyTraitUsageNode_Factory factory = new EmptyTraitUsageNode_Factory();

	public static class EmptyTraitUsageNode_Factory extends TraitUsageNode_Factory {

		public EmptyTraitUsageNode basicNew() {
			EmptyTraitUsageNode newInstance = new EmptyTraitUsageNode();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitEmptyTraitUsageNode_(this);
	}

	@Override
	public EmptyTraitUsageNode allMethodsIn_do_(final SystemNode _aSystemNode, final st.gravel.support.jvm.Block1<Object, MethodNode> _aBlock) {
		return this;
	}

	@Override
	public EmptyTraitUsageNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public EmptyTraitUsageNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return EmptyTraitUsageNode.this;
			}
		});
		return this;
	}

	@Override
	public SimpleTraitUsageNode[] components() {
		return new SimpleTraitUsageNode[] {};
	}

	public EmptyTraitUsageNode copy() {
		try {
			EmptyTraitUsageNode _temp1 = (EmptyTraitUsageNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public EmptyTraitUsageNode_Factory factory() {
		return factory;
	}

	@Override
	public ClassDescriptionNode flattenClassDescriptionNode_in_(final ClassDescriptionNode _aClassDescriptionNode, final SystemNode _aSystemNode) {
		return _aClassDescriptionNode;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public EmptyTraitUsageNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public EmptyTraitUsageNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		return this;
	}

	@Override
	public Reference[] prerequisiteReferences() {
		return new Reference[] {};
	}

	@Override
	public EmptyTraitUsageNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public EmptyTraitUsageNode printOn_(final StringBuilder _aStream) {
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
	public EmptyTraitUsageNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public EmptyTraitUsageNode sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public EmptyTraitUsageNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public EmptyTraitUsageNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public EmptyTraitUsageNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return EmptyTraitUsageNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}

	@Override
	public TraitUsageNode withTrait_(final TraitUsageNode _aTraitUsageNode) {
		return _aTraitUsageNode;
	}
}
