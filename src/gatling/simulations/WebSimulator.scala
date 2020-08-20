import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

import scala.concurrent.duration._
 
class WebSimulator extends Simulation {
 
 val rampUpTimeSecs = 5
 val testTimeSecs = 20
 val noOfUsers = 10
 val minWaitMs: FiniteDuration = 1000 milliseconds
 val maxWaitMs: FiniteDuration = 3000 milliseconds
 
 val baseURL = "http://127.0.0.1:8080"
 val baseName = "hello"
 val requestName: String = baseName + "-request"
 val scenarioName: String = baseName + "-scenario"
 val URI = "/hello"
 
 val httpConf: HttpProtocolBuilder = http
  .baseUrl(baseURL)
  .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // 6
  .doNotTrackHeader("1")
  .acceptLanguageHeader("en-US,en;q=0.5")
  .acceptEncodingHeader("gzip, deflate")
  .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
 
 val scn: ScenarioBuilder = scenario(scenarioName).repeat(noOfUsers, "n") {
   exec { session =>
     session.set("num", 12)
   }
    .exec(http(requestName).get("/hello"))
  }
  
 setUp(
  scn.inject(atOnceUsers(noOfUsers))
  ).protocols(httpConf)
 }
