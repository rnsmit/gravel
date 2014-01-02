package st.gravel.systemtests;

import org.junit.Before;
import org.junit.Test;

import st.gravel.support.jvm.runtime.ImageBootstrapper;
import st.gravel.support.jvm.runtime.MethodTools;

public class FractionFactoryTest {
	@Before
	public void setUp() {
		st.gravel.support.compiler.testtools.TestBootstrap.getSingleton();
	}
	@Test
	public void test_numerator_denominator_() throws Throwable {
		MethodTools.debugTest("st.gravel.ansitests.FractionFactoryTest", "test_numerator_denominator_");
	}
}