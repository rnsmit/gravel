package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.NodeVisitor;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.NodeVisitor.NodeVisitor_Factory;
import org.gravel.support.compiler.ast.SimpleTraitUsageNode;
import org.gravel.support.compiler.ast.VariableNode;
import org.gravel.support.compiler.ast.EmptyTraitUsageNode;

abstract public class AbstractTraitUsageToDirectiveConverter extends NodeVisitor<Node[]> implements Cloneable {

	public static AbstractTraitUsageToDirectiveConverter_Factory factory = new AbstractTraitUsageToDirectiveConverter_Factory();

	public static class AbstractTraitUsageToDirectiveConverter_Factory extends NodeVisitor_Factory<Node[]> {

		public AbstractTraitUsageToDirectiveConverter basicNew() {
			throw new RuntimeException("AbstractTraitUsageToDirectiveConverter is an abstract class");
		}
	}

	public AbstractTraitUsageToDirectiveConverter copy() {
		try {
			AbstractTraitUsageToDirectiveConverter _temp1 = (AbstractTraitUsageToDirectiveConverter) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public AbstractTraitUsageToDirectiveConverter_Factory factory() {
		return factory;
	}

	public abstract Node[] produceSimpleNoMethod_(final SimpleTraitUsageNode _aSimpleTraitUsageNode);

	public VariableNode reader() {
		return VariableNode.factory.name_("reader");
	}

	@Override
	public Node[] visitEmptyTraitUsageNode_(final EmptyTraitUsageNode _anEmptyTraitUsageNode) {
		return new Node[] {};
	}

	@Override
	public Node[] visitSimpleTraitUsageNode_(final SimpleTraitUsageNode _aSimpleTraitUsageNode) {
		if (_aSimpleTraitUsageNode.methodOperations().length == 0) {
			return AbstractTraitUsageToDirectiveConverter.this.produceSimpleNoMethod_(_aSimpleTraitUsageNode);
		}
		throw new RuntimeException("Not implemented yet");
	}
}
