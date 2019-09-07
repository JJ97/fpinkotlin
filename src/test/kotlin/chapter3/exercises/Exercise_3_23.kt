package chapter3.exercises

import chapter3.Cons
import chapter3.List
import chapter3.Nil
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

tailrec fun <A> startsWith(l1: List<A>, l2: List<A>): Boolean = TODO()
// tag::init[]
tailrec fun <A> hasSubsequence(xs: List<A>, sub: List<A>): Boolean = TODO()
// end::init[]

class Exercise_3_23 : WordSpec({
  "list subsequence" should {
    "!determine if a list starts with" {
      startsWith(List.of(1, 2, 3), List.of(1)) shouldBe true
      startsWith(List.of(1, 2, 3), List.of(1, 2)) shouldBe true
      startsWith(List.of(1, 2, 3), List.of(1, 2, 3)) shouldBe true
      startsWith(List.of(1, 2, 3), List.of(2, 3)) shouldBe false
      startsWith(List.of(1, 2, 3), List.of(3)) shouldBe false
      startsWith(List.of(1, 2, 3), List.of(6)) shouldBe false
    }

    "!identify subsequences of a list" {
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(1)) shouldBe true
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(1, 2)) shouldBe true
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(2, 3)) shouldBe true
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(3, 4)) shouldBe true
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(3, 4, 5)) shouldBe true
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(4)) shouldBe true

      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(1, 4)) shouldBe false
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(1, 3)) shouldBe false
      hasSubsequence(List.of(1, 2, 3, 4, 5), List.of(2, 4)) shouldBe false
    }
  }
})