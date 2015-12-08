//
// Generated from archetype; please customize.
//

package com.u14n.snapshot.groovy

import com.u14n.snapshot.groovy.Helper
import com.u14n.snapshot.groovy.Example

/**
 * Tests for the {@link Helper} class.
 */
class HelperTest
    extends GroovyTestCase
{
    void testHelp() {
        new Helper().help(new Example())
    }
}
