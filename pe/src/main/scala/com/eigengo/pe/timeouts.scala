package com.eigengo.pe

import akka.util.Timeout

object timeouts {
  import scala.concurrent.duration._

  object defaults {
    implicit val defaultTimeout = Timeout(3.seconds)
  }

}
