package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.NodeCopierWithLocals;
import st.gravel.support.compiler.ast.NodeCopierWithLocals.NodeCopierWithLocals_Factory;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.HolderDeclarationNode;
import st.gravel.support.compiler.ast.TypeNode;
import st.gravel.support.compiler.ast.ToDoNode;
import st.gravel.support.compiler.ast.Expression;
import st.gravel.support.compiler.ast.SequenceNode;
import st.gravel.support.compiler.ast.VariableDeclarationNode;
import st.gravel.support.compiler.ast.FieldReadNode;
import st.gravel.support.compiler.ast.FieldWriteNode;
import st.gravel.support.compiler.ast.GlobalReadNode;
import st.gravel.support.compiler.ast.GlobalWriteNode;
import st.gravel.support.compiler.ast.LocalReadNode;
import st.gravel.support.compiler.ast.LocalWriteNode;
import st.gravel.support.compiler.ast.NonLocalReturnNode;
import st.gravel.support.compiler.ast.Statement;
import st.gravel.support.compiler.ast.ReadHolderNode;
import st.gravel.support.compiler.ast.SelfNode;
import st.gravel.support.compiler.ast.VariableNode;
import st.gravel.support.compiler.ast.SuperNode;
import st.gravel.support.compiler.ast.WriteHolderNode;
import java.util.HashSet;

abstract public class AbstractVariableRenamer extends NodeCopierWithLocals implements Cloneable {

	public static AbstractVariableRenamer_Factory factory = new AbstractVariableRenamer_Factory();

	String _newName;

	String _oldName;

	public static class AbstractVariableRenamer_Factory extends NodeCopierWithLocals_Factory {

		public AbstractVariableRenamer basicNew() {
			throw new RuntimeException("AbstractVariableRenamer is an abstract class");
		}

		public Node in_rename_to_(final Node _aNode, final String _oldName, final String _newName) {
			if (st.gravel.support.jvm.StringExtensions.equals_(_oldName, _newName)) {
				return _aNode;
			}
			return this.oldName_newName_(_oldName, _newName).visit_(_aNode);
		}

		public AbstractVariableRenamer oldName_newName_(final String _aString, final String _aString2) {
			return ((AbstractVariableRenamer) this.basicNew().initializeOldName_newName_(_aString, _aString2));
		}
	}

	static public Node _in_rename_to_(Object receiver, final Node _aNode, final String _oldName, final String _newName) {
		return factory.in_rename_to_(_aNode, _oldName, _newName);
	}

	static public AbstractVariableRenamer _oldName_newName_(Object receiver, final String _aString, final String _aString2) {
		return factory.oldName_newName_(_aString, _aString2);
	}

	@Override
	public AbstractVariableRenamer addLocalName_(final String _name) {
		_localNames.add(_name);
		return this;
	}

	public AbstractVariableRenamer copy() {
		try {
			AbstractVariableRenamer _temp1 = (AbstractVariableRenamer) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public AbstractVariableRenamer_Factory factory() {
		return factory;
	}

	@Override
	public AbstractVariableRenamer initialize() {
		super.initialize();
		_localNames = new java.util.HashSet();
		return this;
	}

	public AbstractVariableRenamer initializeOldName_newName_(final String _aString, final String _aString2) {
		_oldName = _aString;
		_newName = _aString2;
		this.initialize();
		return this;
	}

	public String newName() {
		return _newName;
	}

	public String oldName() {
		return _oldName;
	}

	@Override
	public AbstractVariableRenamer postCopy() {
		super.postCopy();
		_localNames = st.gravel.support.jvm.SetExtensions.copy(_localNames);
		return this;
	}

	@Override
	public HolderDeclarationNode produceHolderDeclarationNode_(final HolderDeclarationNode _anObject) {
		return HolderDeclarationNode.factory.name_type_(this.renameDefinition_(_anObject.name()), ((TypeNode) this.visit_(_anObject.type())));
	}

	@Override
	public ToDoNode produceToDoNode_(final ToDoNode _anObject) {
		return ToDoNode.factory.start_stop_step_counterName_doSequence_(((Expression) this.visit_(_anObject.start())), ((Expression) this.visit_(_anObject.stop())), ((Expression) this.visit_(_anObject.step())), this.renameDefinition_(_anObject.counterName()), ((SequenceNode) this.visit_(_anObject.doSequence())));
	}

	@Override
	public VariableDeclarationNode produceVariableDeclarationNode_(final VariableDeclarationNode _anObject) {
		return VariableDeclarationNode.factory.name_type_(this.renameDefinition_(_anObject.name()), ((TypeNode) this.visit_(_anObject.type())));
	}

	public abstract String renameDefinition_(final String _aString);

	public abstract String rename_(final String _aString);

	@Override
	public AbstractVariableRenamer subconverter() {
		return this.copy();
	}

	@Override
	public FieldReadNode visitFieldReadNode_(final FieldReadNode _anObject) {
		return FieldReadNode.factory.owner_field_(((Expression) this.visit_(_anObject.owner())), this.rename_(_anObject.field()));
	}

	@Override
	public FieldWriteNode visitFieldWriteNode_(final FieldWriteNode _anObject) {
		return FieldWriteNode.factory.owner_field_value_(((Expression) this.visit_(_anObject.owner())), this.rename_(_anObject.field()), ((Expression) this.visit_(_anObject.value())));
	}

	@Override
	public GlobalReadNode visitGlobalReadNode_(final GlobalReadNode _anObject) {
		return GlobalReadNode.factory.namespace_name_(_anObject.namespace(), this.rename_(_anObject.name()));
	}

	@Override
	public GlobalWriteNode visitGlobalWriteNode_(final GlobalWriteNode _anObject) {
		return GlobalWriteNode.factory.namespace_name_value_(_anObject.namespace(), this.rename_(_anObject.name()), ((Expression) this.visit_(_anObject.value())));
	}

	@Override
	public LocalReadNode visitLocalReadNode_(final LocalReadNode _anObject) {
		return LocalReadNode.factory.name_(this.rename_(_anObject.name()));
	}

	@Override
	public LocalWriteNode visitLocalWriteNode_(final LocalWriteNode _anObject) {
		return LocalWriteNode.factory.name_value_(this.rename_(_anObject.name()), ((Expression) this.visit_(_anObject.value())));
	}

	@Override
	public Statement visitNonLocalReturnNode_(final NonLocalReturnNode _anObject) {
		return NonLocalReturnNode.factory.marker_value_(this.rename_(_anObject.marker()), ((Expression) this.visit_(_anObject.value())));
	}

	@Override
	public ReadHolderNode visitReadHolderNode_(final ReadHolderNode _anObject) {
		return ReadHolderNode.factory.varName_(this.rename_(_anObject.varName()));
	}

	@Override
	public Expression visitSelfNode_(final SelfNode _anObject) {
		if (st.gravel.support.jvm.StringExtensions.equals_(_oldName, "self")) {
			return VariableNode.factory.name_(_newName);
		}
		return _anObject;
	}

	@Override
	public SuperNode visitSuperNode_(final SuperNode _anObject) {
		if (st.gravel.support.jvm.StringExtensions.equals_(_oldName, "self")) {
			throw new RuntimeException("Cant rename super");
		}
		return super.visitSuperNode_(_anObject);
	}

	@Override
	public Expression visitVariableNode_(final VariableNode _anObject) {
		return VariableNode.factory.name_(this.rename_(_anObject.name()));
	}

	@Override
	public WriteHolderNode visitWriteHolderNode_(final WriteHolderNode _anObject) {
		return WriteHolderNode.factory.varName_value_(this.rename_(_anObject.varName()), ((Expression) this.visit_(_anObject.value())));
	}
}
