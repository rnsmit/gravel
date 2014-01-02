package st.gravel.systemtests;

import org.junit.Before;
import org.junit.Test;

import st.gravel.support.jvm.runtime.ImageBootstrapper;
import st.gravel.support.jvm.runtime.MethodTools;

public class InitializableCollectionFactoryTest {
	@Before
	public void setUp() {
		st.gravel.support.compiler.testtools.TestBootstrap.getSingleton();
	}
	@Test
	public void test_withAll_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.InitializableCollectionFactoryTest", "test_withAll_");
	}
	@Test
	public void test_with_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.InitializableCollectionFactoryTest", "test_with_");
	}
	@Test
	public void test_with_with_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.InitializableCollectionFactoryTest", "test_with_with_");
	}
	@Test
	public void test_with_with_with_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.InitializableCollectionFactoryTest", "test_with_with_with_");
	}
	@Test
	public void test_with_with_with_with_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.InitializableCollectionFactoryTest", "test_with_with_with_with_");
	}
}