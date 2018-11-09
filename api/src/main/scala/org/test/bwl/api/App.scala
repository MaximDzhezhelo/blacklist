package org.test.bwl.api

import akka.http.scaladsl.server.HttpApp
import org.test.bwl.model.conf.Conf

object App extends HttpApp with Conf{

  def main(args: Array[String]): Unit = {
    println(conf.getList("client.db.contact.points"))
//    startServer("0.0.0.0", 8080)
  }

  override def routes = pathSingleSlash {
    complete("Hello world with akka :) !")
  }

}