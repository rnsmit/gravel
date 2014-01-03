package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.AbstractMapping;
import st.gravel.support.compiler.ast.AbstractMapping.AbstractMapping_Factory;

public class InstVarMapping extends AbstractMapping implements Cloneable {

	public static InstVarMapping_Factory factory = new InstVarMapping_Factory();

	public static class InstVarMapping_Factory extends AbstractMapping_Factory {

		public InstVarMapping basicNew() {
			InstVarMapping newInstance = new InstVarMapping();
			newInstance.initialize();
			return newInstance;
		}
	}

	public InstVarMapping copy() {
		try {
			InstVarMapping _temp1 = (InstVarMapping) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public InstVarMapping_Factory factory() {
		return factory;
	}
}
