package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.DiffVisitor;
import st.gravel.support.compiler.ast.Reference;

abstract public class ClassDiff extends Object implements Cloneable {

	public static ClassDiff_Factory factory = new ClassDiff_Factory();

	public static class ClassDiff_Factory extends st.gravel.support.jvm.SmalltalkFactory {

		public ClassDiff basicNew() {
			throw new RuntimeException("ClassDiff is an abstract class");
		}
	}

	public DiffVisitor accept_(final DiffVisitor _visitor) {
		return _visitor.visitClassDiff_(this);
	}

	public abstract ClassDiff beStatic();

	public ClassDiff copy() {
		try {
			ClassDiff _temp1 = (ClassDiff) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ClassDiff_Factory factory() {
		return factory;
	}

	public ClassDiff initialize() {
		return this;
	}

	public boolean isEmpty() {
		return false;
	}

	public boolean isNewClassDiff() {
		return false;
	}

	public boolean isStatic() {
		return this.isStaticDefault();
	}

	public boolean isStaticDefault() {
		return false;
	}

	public ClassDiff postCopy() {
		return this;
	}

	public abstract Reference reference();

	public abstract Reference superclassReference();
}
