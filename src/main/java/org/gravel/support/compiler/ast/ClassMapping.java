package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.AbstractMapping;
import org.gravel.support.compiler.ast.AbstractMapping.AbstractMapping_Factory;
import org.gravel.support.compiler.ast.IdentityClassPartMapping;
import org.gravel.support.compiler.ast.ExtensionClassPartMapping;
import java.util.Map;
import org.gravel.support.compiler.ast.InstVarMapping;
import org.gravel.support.compiler.ast.ClassDescriptionNode;
import org.gravel.support.compiler.ast.SystemMapping;
import org.gravel.support.compiler.ast.BoundVariableDeclarationNode;
import java.util.Set;
import java.util.HashSet;
import org.gravel.support.compiler.ast.AbstractMethodMapping;
import org.gravel.support.compiler.ast.VariableDeclarationNode;
import org.gravel.support.compiler.ast.Reference;
import org.gravel.support.compiler.ast.MethodNode;

public class ClassMapping extends AbstractMapping implements Cloneable {

	public static ClassMapping_Factory factory = new ClassMapping_Factory();

	ClassDescriptionNode _classNode;

	ExtensionClassPartMapping[] _extensions;

	IdentityClassPartMapping _identityMapping;

	Map<String, InstVarMapping> _instVarMappings;

	public static class ClassMapping_Factory extends AbstractMapping_Factory {

		public ClassMapping basicNew() {
			ClassMapping newInstance = new ClassMapping();
			newInstance.initialize();
			return newInstance;
		}

		public ClassMapping identityMapping_extensions_instVarMappings_classNode_(final IdentityClassPartMapping _anIdentityClassPartMapping, final ExtensionClassPartMapping[] _anArray, final Map<String, InstVarMapping> _aDictionary, final ClassDescriptionNode _aClassNode) {
			return ((ClassMapping) this.basicNew().initializeIdentityMapping_extensions_instVarMappings_classNode_(_anIdentityClassPartMapping, _anArray, _aDictionary, _aClassNode));
		}
	}

	static public ClassMapping _identityMapping_extensions_instVarMappings_classNode_(Object receiver, final IdentityClassPartMapping _anIdentityClassPartMapping, final ExtensionClassPartMapping[] _anArray, final Map<String, InstVarMapping> _aDictionary, final ClassDescriptionNode _aClassNode) {
		return factory.identityMapping_extensions_instVarMappings_classNode_(_anIdentityClassPartMapping, _anArray, _aDictionary, _aClassNode);
	}

	public BoundVariableDeclarationNode[] allInstVarsIn_(final SystemMapping _aSystemMapping) {
		final BoundVariableDeclarationNode[] _arr;
		final ClassMapping _scm;
		_arr = this.boundInstVars();
		_scm = this.superclassMappingIn_(_aSystemMapping);
		if (_scm != null) {
			return org.gravel.support.jvm.ArrayExtensions.copyWithAll_(_arr, _scm.allInstVarsIn_(_aSystemMapping));
		}
		return _arr;
	}

	public java.util.Set<org.gravel.core.Symbol> allSelectorsIn_(final SystemMapping _aSystemMapping) {
		final java.util.Set<org.gravel.core.Symbol> _set;
		final ClassMapping _scm;
		_set = new java.util.HashSet();
		_set.addAll(this.selectors());
		_scm = this.superclassMappingIn_(_aSystemMapping);
		if (_scm != null) {
			_set.addAll(_scm.allSelectorsIn_(_aSystemMapping));
		}
		return _set;
	}

	public BoundVariableDeclarationNode[] boundInstVars() {
		return _classNode.boundInstVars();
	}

	public ClassDescriptionNode classNode() {
		return _classNode;
	}

	public ClassMapping copy() {
		try {
			ClassMapping _temp1 = (ClassMapping) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public AbstractMethodMapping extensionMethodMappingAt_ifAbsent_(final org.gravel.core.Symbol _aSymbol, final org.gravel.support.jvm.Block0<AbstractMethodMapping> _aBlock) {
		for (final ExtensionClassPartMapping _ex : _extensions) {
			final AbstractMethodMapping _m;
			_m = _ex.methodMappingAt_ifAbsent_(_aSymbol, ((org.gravel.support.jvm.Block0<AbstractMethodMapping>) (new org.gravel.support.jvm.Block0<AbstractMethodMapping>() {

				@Override
				public AbstractMethodMapping value() {
					return (AbstractMethodMapping) null;
				}
			})));
			if (_m != null) {
				return _m;
			}
		}
		return _aBlock.value();
	}

	public ExtensionClassPartMapping[] extensions() {
		return _extensions;
	}

	public ClassMapping_Factory factory() {
		return factory;
	}

	public ClassMapping generatedJavaClassesDo_(final org.gravel.support.jvm.Block1<Object, Class> _aBlock) {
		if (_identityMapping.isGenerated()) {
			_aBlock.value_(_identityMapping.javaClass());
		}
		for (final ExtensionClassPartMapping _each : _extensions) {
			if (_each.isGenerated()) {
				_aBlock.value_(_each.javaClass());
			}
		}
		return this;
	}

	public Class identityClass() {
		return _identityMapping.javaClass();
	}

	public IdentityClassPartMapping identityMapping() {
		return _identityMapping;
	}

	public ClassMapping initializeIdentityMapping_extensions_instVarMappings_classNode_(final IdentityClassPartMapping _anIdentityClassPartMapping, final ExtensionClassPartMapping[] _anArray, final Map<String, InstVarMapping> _aDictionary, final ClassDescriptionNode _aClassNode) {
		_identityMapping = _anIdentityClassPartMapping;
		_extensions = _anArray;
		_instVarMappings = _aDictionary;
		_classNode = _aClassNode;
		this.initialize();
		return this;
	}

	public Map<String, InstVarMapping> instVarMappings() {
		return _instVarMappings;
	}

	public VariableDeclarationNode[] instVars() {
		return _classNode.instVars();
	}

	public ClassMapping javaClassesDo_(final org.gravel.support.jvm.Block1<Object, Class> _aBlock) {
		_aBlock.value_(_identityMapping.javaClass());
		for (final ExtensionClassPartMapping _each : _extensions) {
			_aBlock.value_(_each.javaClass());
		}
		return this;
	}

	public AbstractMethodMapping methodMappingAt_ifAbsent_(final org.gravel.core.Symbol _aSymbol, final org.gravel.support.jvm.Block0<AbstractMethodMapping> _aBlock) {
		return _identityMapping.methodMappingAt_ifAbsent_(_aSymbol, ((org.gravel.support.jvm.Block0<AbstractMethodMapping>) (new org.gravel.support.jvm.Block0<AbstractMethodMapping>() {

			@Override
			public AbstractMethodMapping value() {
				return (AbstractMethodMapping) ClassMapping.this.extensionMethodMappingAt_ifAbsent_(_aSymbol, _aBlock);
			}
		})));
	}

	public ClassMapping pvtSetClassNode_(final ClassDescriptionNode _aClassDescriptionNode) {
		_classNode = _aClassDescriptionNode;
		return this;
	}

	public ClassMapping pvtSetExtensions_(final ExtensionClassPartMapping[] _anArray) {
		_extensions = _anArray;
		return this;
	}

	public ClassMapping pvtSetIdentityMapping_(final IdentityClassPartMapping _anObject) {
		_identityMapping = _anObject;
		return this;
	}

	public Reference reference() {
		return _classNode.reference();
	}

	public java.util.Set<org.gravel.core.Symbol> selectors() {
		final java.util.Set<org.gravel.core.Symbol> _set;
		_set = new java.util.HashSet();
		for (final MethodNode _each : _classNode.methods()) {
			_set.add(org.gravel.core.Symbol.value(_each.selector()));
		}
		return _set;
	}

	public ClassMapping superclassMappingIn_(final SystemMapping _aSystemMapping) {
		final Reference _superclassReference;
		_superclassReference = this.superclassReference();
		if (_superclassReference == null) {
			return null;
		}
		return _aSystemMapping.classMappingAtReference_(_superclassReference);
	}

	public Reference superclassReference() {
		return _classNode.superclassReference();
	}

	public Reference superclassReferenceForMethodLookup() {
		return _classNode.superclassReferenceForMethodLookup();
	}

	public ClassMapping withClassNode_(final ClassDescriptionNode _aClassDescriptionNode) {
		return this.copy().pvtSetClassNode_(_aClassDescriptionNode);
	}

	public ClassMapping withExtensions_(final ExtensionClassPartMapping[] _anArray) {
		return this.copy().pvtSetExtensions_(_anArray);
	}

	public ClassMapping withExtension_(final ExtensionClassPartMapping _anExtensionClassPartMapping) {
		return this.withExtensions_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_extensions, _anExtensionClassPartMapping));
	}

	public ClassMapping withoutMethodMapping_(final String _aSelector) {
		ClassMapping _temp1 = this.copy();
		_temp1.pvtSetIdentityMapping_(_identityMapping.withoutMethodMapping_(_aSelector));
		return _temp1.pvtSetExtensions_(org.gravel.support.jvm.ArrayExtensions.collect_(_extensions, ((org.gravel.support.jvm.Block1<ExtensionClassPartMapping, ExtensionClassPartMapping>) (new org.gravel.support.jvm.Block1<ExtensionClassPartMapping, ExtensionClassPartMapping>() {

			@Override
			public ExtensionClassPartMapping value_(final ExtensionClassPartMapping _each) {
				return (ExtensionClassPartMapping) _each.withoutMethodMapping_(_aSelector);
			}
		}))));
	}
}