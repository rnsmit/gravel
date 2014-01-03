package st.gravel.systemtests;

import org.junit.Before;
import org.junit.Test;

import st.gravel.support.jvm.runtime.ImageBootstrapper;
import st.gravel.support.jvm.runtime.MethodTools;

public class ZeroDivideTest {
	@Before
	public void setUp() {
		st.gravel.support.compiler.testtools.TestBootstrap.getSingleton();
	}
	@Test
	public void test_dividend() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.ZeroDivideTest", "test_dividend");
	}
	@Test
	public void test_isResumable() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.ZeroDivideTest", "test_isResumable");
	}
}