//import com.codahale.jerkson.Json
import java.io.StringWriter
import com.fasterxml.jackson.core
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.core.json
import com.fasterxml.jackson.module.scala.DefaultScalaModule
object sheet1{
   val m : Map[String, Any] = Map("A"->"Alphabet", "B"->"Bobby", "C"->5,
      "D"->Map("x"->"ex", "y"->"why"))
   val mapper = new ObjectMapper()
   mapper.registerModule(DefaultScalaModule)
   val out = new StringWriter
   mapper.writeValue(out, m)
   out.toString()
   out.write("\r\n")
   mapper.writeValue(out, m)
   out.toString()
}