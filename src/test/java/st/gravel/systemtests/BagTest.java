package st.gravel.systemtests;

import org.junit.Before;
import org.junit.Test;

import st.gravel.support.jvm.runtime.ImageBootstrapper;
import st.gravel.support.jvm.runtime.MethodTools;

public class BagTest {
	@Before
	public void setUp() {
		st.gravel.support.compiler.testtools.TestBootstrap.getSingleton();
	}
	@Test
	public void test_addAll_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.BagTest", "test_addAll_");
	}
	@Test
	public void test_add_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.BagTest", "test_add_");
	}
	@Test
	public void test_add_withOccurrences_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.BagTest", "test_add_withOccurrences_");
	}
	@Test
	public void test_collect_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.BagTest", "test_collect_");
	}
}