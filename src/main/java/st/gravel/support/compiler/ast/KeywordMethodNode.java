package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.MethodNode;
import st.gravel.support.compiler.ast.MethodNode.MethodNode_Factory;
import st.gravel.support.compiler.ast.VariableDeclarationNode;
import st.gravel.support.compiler.ast.SequenceNode;
import st.gravel.support.compiler.ast.PragmaNode;
import st.gravel.support.compiler.ast.TypeNode;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.Reference;
import st.gravel.support.compiler.ast.StringLiteralNode;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.SymbolLiteralNode;
import st.gravel.support.compiler.ast.KeywordMessageNode;
import st.gravel.support.compiler.ast.NilLiteralNode;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

public class KeywordMethodNode extends MethodNode implements Cloneable {

	public static KeywordMethodNode_Factory factory = new KeywordMethodNode_Factory();

	VariableDeclarationNode[] _arguments;

	public static class KeywordMethodNode_Factory extends MethodNode_Factory {

		public KeywordMethodNode basicNew() {
			KeywordMethodNode newInstance = new KeywordMethodNode();
			newInstance.initialize();
			return newInstance;
		}

		public KeywordMethodNode selector_arguments_body_(final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode) {
			return ((KeywordMethodNode) this.selector_arguments_body_returnType_pragmas_protocol_nlrMarker_(_aString, _anArray, _aSequenceNode, null, new PragmaNode[] {}, null, null));
		}

		public KeywordMethodNode selector_arguments_body_returnType_pragmas_protocol_(final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray2, final String _protocol) {
			return ((KeywordMethodNode) this.selector_arguments_body_returnType_pragmas_protocol_nlrMarker_(_aString, _anArray, _aSequenceNode, _anUndefinedObject, _anArray2, _protocol, null));
		}

		public KeywordMethodNode selector_arguments_body_returnType_pragmas_protocol_nlrMarker_(final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray2, final String _protocol, final String _nlrMarker) {
			return ((KeywordMethodNode) this.basicNew().initializeSelector_arguments_body_returnType_pragmas_protocol_nlrMarker_(_aString, _anArray, _aSequenceNode, _anUndefinedObject, _anArray2, _protocol, _nlrMarker));
		}

		@Override
		public KeywordMethodNode selector_body_returnType_pragmas_protocol_(final String _aString, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray, final String _protocol) {
			return ((KeywordMethodNode) this.selector_body_returnType_pragmas_protocol_nlrMarker_(_aString, _aSequenceNode, _anUndefinedObject, _anArray, _protocol, null));
		}

		@Override
		public KeywordMethodNode selector_body_returnType_pragmas_protocol_nlrMarker_(final String _aString, final SequenceNode _aSequenceNode, final TypeNode _returnType, final PragmaNode[] _anArray, final String _protocol, final String _nlrMarker) {
			return ((KeywordMethodNode) this.basicNew().initializeSelector_body_returnType_pragmas_protocol_nlrMarker_(_aString, _aSequenceNode, _returnType, _anArray, _protocol, _nlrMarker));
		}
	}

	static public KeywordMethodNode _selector_arguments_body_(Object receiver, final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode) {
		return factory.selector_arguments_body_(_aString, _anArray, _aSequenceNode);
	}

	static public KeywordMethodNode _selector_arguments_body_returnType_pragmas_protocol_(Object receiver, final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray2, final String _protocol) {
		return factory.selector_arguments_body_returnType_pragmas_protocol_(_aString, _anArray, _aSequenceNode, _anUndefinedObject, _anArray2, _protocol);
	}

	static public KeywordMethodNode _selector_arguments_body_returnType_pragmas_protocol_nlrMarker_(Object receiver, final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray2, final String _protocol, final String _nlrMarker) {
		return factory.selector_arguments_body_returnType_pragmas_protocol_nlrMarker_(_aString, _anArray, _aSequenceNode, _anUndefinedObject, _anArray2, _protocol, _nlrMarker);
	}

	static public KeywordMethodNode _selector_body_returnType_pragmas_protocol_(Object receiver, final String _aString, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray, final String _protocol) {
		return factory.selector_body_returnType_pragmas_protocol_(_aString, _aSequenceNode, _anUndefinedObject, _anArray, _protocol);
	}

	static public KeywordMethodNode _selector_body_returnType_pragmas_protocol_nlrMarker_(Object receiver, final String _aString, final SequenceNode _aSequenceNode, final TypeNode _returnType, final PragmaNode[] _anArray, final String _protocol, final String _nlrMarker) {
		return factory.selector_body_returnType_pragmas_protocol_nlrMarker_(_aString, _aSequenceNode, _returnType, _anArray, _protocol, _nlrMarker);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitKeywordMethodNode_(this);
	}

	@Override
	public KeywordMethodNode allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public KeywordMethodNode allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return KeywordMethodNode.this;
			}
		});
		return this;
	}

	@Override
	public VariableDeclarationNode[] arguments() {
		return _arguments;
	}

	public KeywordMethodNode argumentsDo_(final st.gravel.support.jvm.Block1<Object, VariableDeclarationNode> _aBlock) {
		for (final VariableDeclarationNode _temp1 : _arguments) {
			_aBlock.value_(_temp1);
		}
		return this;
	}

	public KeywordMethodNode copy() {
		try {
			KeywordMethodNode _temp1 = (KeywordMethodNode) this.clone();
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
		if (this._arguments == null) {
			if (!(((KeywordMethodNode) _anObject)._arguments == null)) {
				return false;
			}
		} else {
			if (!st.gravel.support.jvm.ArrayExtensions.equals_(this._arguments, ((KeywordMethodNode) _anObject)._arguments)) {
				return false;
			}
		}
		return true;
	}

	public KeywordMethodNode_Factory factory() {
		return factory;
	}

	@Override
	public boolean hasCompleteArgumentSignature() {
		return st.gravel.support.jvm.ArrayExtensions.allSatisfy_(_arguments, new st.gravel.support.jvm.Predicate1<VariableDeclarationNode>() {

			@Override
			public boolean value_(final VariableDeclarationNode _elem) {
				return _elem.type() != null;
			}
		});
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ java.util.Arrays.hashCode(_arguments));
	}

	public KeywordMethodNode initializeSelector_arguments_body_returnType_pragmas_protocol_nlrMarker_(final String _aString, final VariableDeclarationNode[] _anArray, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray2, final String _protocolString, final String _nlrMarkerString) {
		_selector = _aString;
		_arguments = _anArray;
		_body = _aSequenceNode;
		_returnType = _anUndefinedObject;
		_pragmas = _anArray2;
		_protocol = _protocolString;
		_nlrMarker = _nlrMarkerString;
		this.initialize();
		return this;
	}

	@Override
	public KeywordMethodNode initializeSelector_body_returnType_pragmas_protocol_nlrMarker_(final String _aString, final SequenceNode _aSequenceNode, final TypeNode _anUndefinedObject, final PragmaNode[] _anArray, final String _protocolString, final String _anObject) {
		_selector = _aString;
		_body = _aSequenceNode;
		_returnType = _anUndefinedObject;
		_pragmas = _anArray;
		_protocol = _protocolString;
		_nlrMarker = _anObject;
		this.initialize();
		return this;
	}

	@Override
	public KeywordMethodNode localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	@Override
	public KeywordMethodNode nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(_body);
		for (final VariableDeclarationNode _temp1 : _arguments) {
			_aBlock.value_(_temp1);
		}
		return this;
	}

	@Override
	public int numArgs() {
		return _arguments.length;
	}

	@Override
	public KeywordMethodNode ofTrait_(final Reference _aReference) {
		return this.withPropertyAt_put_(st.gravel.core.Symbol.value("trait"), StringLiteralNode.factory.value_(_aReference.toString()));
	}

	@Override
	public int precedence() {
		return 3;
	}

	@Override
	public KeywordMethodNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public KeywordMethodNode printOn_(final StringBuilder _aStream) {
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
	public KeywordMethodNode pvtSetBody_(final SequenceNode _aSequenceNode) {
		_body = _aSequenceNode;
		return this;
	}

	@Override
	public KeywordMethodNode pvtSetNlrMarker_(final String _anObject) {
		_nlrMarker = _anObject;
		return this;
	}

	@Override
	public KeywordMethodNode pvtSetPragmas_(final PragmaNode[] _anArray) {
		_pragmas = _anArray;
		return this;
	}

	@Override
	public KeywordMethodNode pvtSetProtocol_(final String _aString) {
		_protocol = _aString;
		return this;
	}

	@Override
	public KeywordMethodNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public KeywordMethodNode returnTypeAndBodySourceOn_(final StringBuilder _aStream) {
		if (_returnType != null) {
			_aStream.append(' ');
			_aStream.append("{^");
			_returnType.sourceOn_(_aStream);
			_aStream.append('}');
		}
		for (final PragmaNode _each : _pragmas) {
			_aStream.append('\n');
			_aStream.append(' ');
			_each.sourceOn_(_aStream);
		}
		_body.methodSourceOn_(_aStream);
		return this;
	}

	@Override
	public KeywordMethodNode sourceOn_(final StringBuilder _aStream) {
		final String[] _keywords;
		_keywords = st.gravel.support.jvm.StringExtensions.tokensBasedOn_(_selector, ':');
		for (int _i = 1; _i <= _arguments.length; _i++) {
			final String _keyword;
			final VariableDeclarationNode _argument;
			_keyword = _keywords[_i - 1];
			_argument = _arguments[_i - 1];
			if (!st.gravel.support.jvm.IntegerExtensions.equals_(_i, 1)) {
				_aStream.append(' ');
			}
			_aStream.append(_keyword);
			_aStream.append(':');
			_aStream.append(' ');
			_argument.sourceOn_(_aStream);
		}
		this.returnTypeAndBodySourceOn_(_aStream);
		return this;
	}

	@Override
	public KeywordMethodNode typeDefsDo_(final st.gravel.support.jvm.Block1<Object, TypeNode> _aBlock) {
		for (final VariableDeclarationNode _each : _arguments) {
			_each.typeDefsDo_(_aBlock);
		}
		if (_returnType != null) {
			_returnType.typeDefsDo_(_aBlock);
		}
		return this;
	}

	@Override
	public KeywordMethodNode updatePragmas_(final st.gravel.support.jvm.Block1<PragmaNode, PragmaNode> _aBlock) {
		return this.withPragmas_(st.gravel.support.jvm.ArrayExtensions.collect_(_pragmas, _aBlock));
	}

	@Override
	public KeywordMethodNode withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public KeywordMethodNode withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public KeywordMethodNode withBody_(final SequenceNode _aSequenceNode) {
		return this.copy().pvtSetBody_(_aSequenceNode);
	}

	@Override
	public KeywordMethodNode withNlrMarker_(final String _anObject) {
		return this.copy().pvtSetNlrMarker_(_anObject);
	}

	@Override
	public KeywordMethodNode withPragmas_(final PragmaNode[] _anArray) {
		return this.copy().pvtSetPragmas_(_anArray);
	}

	@Override
	public KeywordMethodNode withPropertyAt_put_(final st.gravel.core.Symbol _aKey, final Expression _aValue) {
		if (st.gravel.support.jvm.ArrayExtensions.anySatisfy_(_pragmas, new st.gravel.support.jvm.Predicate1<PragmaNode>() {

			@Override
			public boolean value_(final PragmaNode _each) {
				return _each.isPropertyPragmaAt_(_aKey);
			}
		})) {
			return KeywordMethodNode.this.updatePragmas_(((st.gravel.support.jvm.Block1<PragmaNode, PragmaNode>) (new st.gravel.support.jvm.Block1<PragmaNode, PragmaNode>() {

				@Override
				public PragmaNode value_(final PragmaNode _each) {
					if (_each.isPropertyPragmaAt_(_aKey)) {
						return _each.withArguments_(st.gravel.support.jvm.ArrayFactory.with_with_(SymbolLiteralNode.factory.value_(_aKey), _aValue));
					} else {
						return _each;
					}
				}
			})));
		} else {
			return KeywordMethodNode.this.withPragmas_(st.gravel.support.jvm.ArrayExtensions.copyWith_(_pragmas, PragmaNode.factory.expression_(KeywordMessageNode.factory.receiver_selector_arguments_(NilLiteralNode.factory.basicNew(), "propertyAt:put:", st.gravel.support.jvm.ArrayFactory.with_with_(SymbolLiteralNode.factory.value_(_aKey), _aValue)))));
		}
	}

	@Override
	public KeywordMethodNode withProtocol_(final String _aString) {
		return this.copy().pvtSetProtocol_(_aString);
	}

	@Override
	public KeywordMethodNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return KeywordMethodNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
