(reader defineTrait: 'ByteArray' superclass: nil)
!
(reader addSimpleTrait: 'st.gravel.lang.collections.interface.SequenceableCollection')
!
(reader addSimpleTrait: 'st.gravel.lang.collections.interface.ArrayedCollection')
!
(reader addSimpleClassTrait: 'st.gravel.lang.collections.interface.SequenceableCollection class')
!
(reader addSimpleClassTrait: 'st.gravel.lang.collections.interface.ArrayedCollection class')
!
(reader addMethod: 'testing')
!
isByteArray
	^true
!
(reader addClassMethod: 'As yet unclassified')
!
defaultImplementation
	^JavaByteArray
!