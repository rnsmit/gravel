package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;

public class NodeVisitorError extends RuntimeException implements Cloneable {

	public static NodeVisitorError_Factory factory = new NodeVisitorError_Factory();

	public static class NodeVisitorError_Factory extends org.gravel.support.jvm.SmalltalkFactory {

		public NodeVisitorError basicNew() {
			NodeVisitorError newInstance = new NodeVisitorError();
			newInstance.initialize();
			return newInstance;
		}
	}

	public NodeVisitorError copy() {
		try {
			NodeVisitorError _temp1 = (NodeVisitorError) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public NodeVisitorError_Factory factory() {
		return factory;
	}

	public NodeVisitorError initialize() {
		return this;
	}

	public NodeVisitorError postCopy() {
		return this;
	}
}