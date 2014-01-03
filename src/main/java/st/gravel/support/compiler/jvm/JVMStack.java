package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMType;

public class JVMStack extends Object implements Cloneable {

	public static JVMStack_Factory factory = new JVMStack_Factory();

	JVMType[] _elements;

	public static class JVMStack_Factory extends st.gravel.support.jvm.SmalltalkFactory {

		public JVMStack basicNew() {
			JVMStack newInstance = new JVMStack();
			newInstance.initialize();
			return newInstance;
		}
	}

	public JVMStack copy() {
		try {
			JVMStack _temp1 = (JVMStack) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public JVMStack elementsDo_(final st.gravel.support.jvm.Block1<Object, JVMType> _aBlock) {
		for (final JVMType _temp1 : _elements) {
			_aBlock.value_(_temp1);
		}
		return this;
	}

	public JVMStack_Factory factory() {
		return factory;
	}

	public JVMStack initialize() {
		_elements = new JVMType[] {};
		return this;
	}

	public boolean isEmpty() {
		return _elements.length == 0;
	}

	public JVMType peek() {
		return this.peek_(1);
	}

	public JVMType peek_(final int _anInteger) {
		return _elements[(_elements.length - (_anInteger - 1)) - 1];
	}

	public JVMType pop() {
		final JVMType _last;
		_last = _elements[_elements.length - 1];
		if (_last.isWide()) {
			throw new RuntimeException("Cannot pop a wide element");
		}
		_elements = st.gravel.support.jvm.ArrayExtensions.copyWithoutLast(_elements);
		return _last;
	}

	public JVMType popLast() {
		st.gravel.support.jvm.ObjectExtensions.assert_(this, st.gravel.support.jvm.IntegerExtensions.equals_(this.size(), 1));
		return this.pop();
	}

	public JVMStack popType_(final JVMType _aJVMType) {
		final JVMType _last;
		_last = _aJVMType.isWide() ? this.popWide() : this.pop();
		st.gravel.support.jvm.ObjectExtensions.assert_(this, st.gravel.support.jvm.ObjectExtensions.equals_(_last, _aJVMType));
		return this;
	}

	public JVMType popWide() {
		final JVMType _last;
		_last = _elements[_elements.length - 1];
		if (!_last.isWide()) {
			throw new RuntimeException("Cannot pop a small element");
		}
		_elements = st.gravel.support.jvm.ArrayExtensions.copyWithoutLast(_elements);
		return _last;
	}

	public JVMStack postCopy() {
		return this;
	}

	public JVMStack push_(final JVMType _aType) {
		st.gravel.support.jvm.ObjectExtensions.deny_(this, _aType.isBottomType());
		_elements = st.gravel.support.jvm.ArrayExtensions.copyWith_(_elements, _aType);
		return this;
	}

	public int size() {
		return _elements.length;
	}
}
