package st.gravel.support.jvm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetExtensions {
	public static final Factory factory = new Factory();

	public static class Factory extends SmalltalkFactory {
		public Object basicNew() {
			return new HashSet();
		}

	}

	public static Object r_class(Object receiver) {
		return factory;
	}

	public static <X> Set<X> copy(Collection<X> values) {
		return new HashSet<X>(values);
	}

	public static <E> Set<E> select_(Set<E> receiver, Predicate1<E> predicate1) {
		HashSet<E> result = new HashSet<E>();
		for (E element : receiver) {
			if (predicate1.value_(element))
				result.add(element);
		}
		return result;
	}
}
