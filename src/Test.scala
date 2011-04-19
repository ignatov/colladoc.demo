package org.test

trait T

class Test(s: String) extends T {
  /**
   * Override toString.
   */
  def toString = "test"

  /**
   * Constructor
   */
  def this() = this ("string")

  /**
   * Multiline comment.
   */
  def another = println(toString)

  /**
   * Simple comment.
   */
  def simple = {
    1 * 100 * 30
  }
}

class SecondTest(s: String) extends Test {
  override def simple = 2
}

