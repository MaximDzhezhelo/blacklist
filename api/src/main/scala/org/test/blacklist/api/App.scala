package org.test.blacklist.api

import akka.http.scaladsl.server.HttpApp

object App extends HttpApp{

  def main(args: Array[String]): Unit = {
    startServer("0.0.0.0", 8080)
  }

  override def routes = pathSingleSlash {
    complete("Hello world with akka :) !")
  }

}