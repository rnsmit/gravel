package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.VariableScopeAnalyzerState;
import st.gravel.support.compiler.ast.VariableScopeAnalyzerState.VariableScopeAnalyzerState_Factory;
import st.gravel.support.compiler.ast.VariableScopeAnalyzerStateBlockReadAfterWritten;
import st.gravel.support.compiler.ast.VariableScopeAnalyzerStateReadWritten;

public class VariableScopeAnalyzerStateWritten extends VariableScopeAnalyzerState implements Cloneable {

	public static VariableScopeAnalyzerStateWritten_Factory factory = new VariableScopeAnalyzerStateWritten_Factory();

	public static class VariableScopeAnalyzerStateWritten_Factory extends VariableScopeAnalyzerState_Factory {

		public VariableScopeAnalyzerStateWritten basicNew() {
			VariableScopeAnalyzerStateWritten newInstance = new VariableScopeAnalyzerStateWritten();
			newInstance.initialize();
			return newInstance;
		}
	}

	public VariableScopeAnalyzerStateWritten copy() {
		try {
			VariableScopeAnalyzerStateWritten _temp1 = (VariableScopeAnalyzerStateWritten) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public VariableScopeAnalyzerStateWritten_Factory factory() {
		return factory;
	}

	@Override
	public VariableScopeAnalyzerState withBlockRead() {
		return VariableScopeAnalyzerStateBlockReadAfterWritten.factory.basicNew();
	}

	@Override
	public VariableScopeAnalyzerState withLocalRead() {
		return VariableScopeAnalyzerStateReadWritten.factory.basicNew();
	}

	@Override
	public VariableScopeAnalyzerState withLocalWrite() {
		return this;
	}
}