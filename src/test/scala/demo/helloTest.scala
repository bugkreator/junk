package demo

import org.scalatest.FunSuite

/**
 * Created by orotem on 5/14/2015.
 */
class helloTest extends FunSuite {
   test("First test") {
      val hello = new hello()
      assert(hello.foo() == 5)
   }
}
