package cx.lehmann.vertx.unit;

import io.vertx.core.logging.Logger;
import io.vertx.core.logging.impl.LoggerFactory;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

/*
 * smtp client test using vertx unit
 */
/**
 * @author <a href="http://oss.lehmann.cx/">Alexander Lehmann</a>
 *
 */
@RunWith(VertxUnitRunner.class)
public class UnitExceptionTest {

  private static final Logger log = LoggerFactory.getLogger(UnitExceptionTest.class);

  @Test
  public void testMail(TestContext context) throws Exception {
    log.info("starting test");
    Async async = context.async();

    throw new Exception(); 
  }

}
