package example

import com.fasterxml.jackson.databind.node.{JsonNodeFactory, ObjectNode}

object Hello extends Greeting with App {
  println(greeting)

  val event = new ObjectNode(JsonNodeFactory.instance)
    .put("platform", "lala")

  val y2: ObjectNode = event.put("clientSideParams", "x")

  val y3 = event.set("clientSideParams", new ObjectNode(JsonNodeFactory.instance).put("x", "y"))

  println(y2)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
