package hudson.plugins.grizz;

import junit.framework.TestCase;

public class RoundhouseActionTest extends TestCase {

	private RoundhouseAction action;

	public void setUp() {
		action = new RoundhouseAction(Style.BAD_ASS,
				"Grizz can divide by zero.");
	}

	public void testAccessors() {
		assertEquals(Style.BAD_ASS, action.getStyle());
		assertEquals("Grizz can divide by zero.", action
				.getFact());
		assertEquals("Grizz", action.getDisplayName());
		assertNull(action.getIconFileName());
		assertEquals("grizz", action.getUrlName());
	}
}
