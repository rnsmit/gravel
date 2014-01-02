package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.IntermediateNode;
import st.gravel.support.compiler.ast.IntermediateNode.IntermediateNode_Factory;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

abstract public class ArrayAccessNode extends IntermediateNode implements Cloneable {

	public static ArrayAccessNode_Factory factory = new ArrayAccessNode_Factory();

	Expression _receiver;

	public static class ArrayAccessNode_Factory extends IntermediateNode_Factory {

		public ArrayAccessNode basicNew() {
			throw new RuntimeException("ArrayAccessNode is an abstract class");
		}

		public ArrayAccessNode receiver_(final Expression _anExpression) {
			return ((ArrayAccessNode) this.basicNew().initializeReceiver_(_anExpression));
		}
	}

	static public ArrayAccessNode _receiver_(Object receiver, final Expression _anExpression) {
		return factory.receiver_(_anExpression);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitArrayAccessNode_(this);
	}

	@Override
	public ArrayAccessNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ArrayAccessNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ArrayAccessNode.this;
			}
		});
		return this;
	}

	public ArrayAccessNode copy() {
		try {
			ArrayAccessNode _temp1 = (ArrayAccessNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ArrayAccessNode_Factory factory() {
		return factory;
	}

	public ArrayAccessNode initializeReceiver_(final Expression _anExpression) {
		_receiver = _anExpression;
		this.initialize();
		return this;
	}

	@Override
	public abstract ArrayAccessNode innerSourceOn_(final StringBuilder _aStream);

	@Override
	public ArrayAccessNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public abstract ArrayAccessNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock);

	@Override
	public ArrayAccessNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ArrayAccessNode printOn_(final StringBuilder _aStream) {
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
	public ArrayAccessNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	public Expression receiver() {
		return _receiver;
	}

	@Override
	public ArrayAccessNode sourceOn_(final StringBuilder _aStream) {
		this.innerSourceOn_(_aStream);
		return this;
	}

	@Override
	public ArrayAccessNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ArrayAccessNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public ArrayAccessNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ArrayAccessNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
