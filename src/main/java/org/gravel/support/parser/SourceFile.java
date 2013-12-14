package org.gravel.support.parser;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.parser.SourcePosition;

public class SourceFile extends Object implements Cloneable {

	public static SourceFile_Factory factory = new SourceFile_Factory();

	String _directory;

	String _name;

	org.gravel.core.Symbol _packageName;

	public static class SourceFile_Factory extends org.gravel.support.jvm.SmalltalkFactory {

		public SourceFile basicNew() {
			SourceFile newInstance = new SourceFile();
			newInstance.initialize();
			return newInstance;
		}

		public SourceFile directory_name_packageName_(final String _directory, final String _aName, final org.gravel.core.Symbol _packageName) {
			return this.basicNew().initializeDirectory_name_packageName_(_directory, _aName, _packageName);
		}
	}

	static public SourceFile _directory_name_packageName_(Object receiver, final String _directory, final String _aName, final org.gravel.core.Symbol _packageName) {
		return factory.directory_name_packageName_(_directory, _aName, _packageName);
	}

	public java.io.File asFile() {
		return new java.io.File(org.gravel.support.jvm.StringExtensions.asFilename(_directory), _name);
	}

	public SourceFile copy() {
		try {
			SourceFile _temp1 = (SourceFile) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean equals(final Object _anObject) {
		if (!(this.getClass() == _anObject.getClass())) {
			return false;
		}
		if (this._directory == null) {
			if (!(((SourceFile) _anObject)._directory == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.StringExtensions.equals_(this._directory, ((SourceFile) _anObject)._directory)) {
				return false;
			}
		}
		if (this._name == null) {
			if (!(((SourceFile) _anObject)._name == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.StringExtensions.equals_(this._name, ((SourceFile) _anObject)._name)) {
				return false;
			}
		}
		if (this._packageName == null) {
			if (!(((SourceFile) _anObject)._packageName == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ObjectExtensions.equals_(this._packageName, ((SourceFile) _anObject)._packageName)) {
				return false;
			}
		}
		return true;
	}

	public SourceFile_Factory factory() {
		return factory;
	}

	public SourcePosition from_to_(final int _start, final int _stop) {
		return SourcePosition.factory.sourceFile_start_stop_(this, _start, _stop);
	}

	public int hashCode() {
		return ((this.factory() == null ? 0 : this.factory().hashCode()) ^ _name.hashCode());
	}

	public SourceFile initialize() {
		return this;
	}

	public SourceFile initializeDirectory_name_packageName_(final String _aDirectory, final String _aName, final org.gravel.core.Symbol _anObject) {
		_directory = _aDirectory;
		_name = _aName;
		_packageName = _anObject;
		this.initialize();
		return this;
	}

	public String name() {
		return _name;
	}

	public org.gravel.core.Symbol packageName() {
		return _packageName;
	}

	public SourceFile postCopy() {
		return this;
	}
}