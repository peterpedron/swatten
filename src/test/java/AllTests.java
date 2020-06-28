import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import st.watten.test.CardDeckTest;
import st.watten.test.CardTest;
import st.watten.test.PlayerTest;

@RunWith(Suite.class)
@SuiteClasses({ CardTest.class, CardDeckTest.class, PlayerTest.class })
public class AllTests {
}