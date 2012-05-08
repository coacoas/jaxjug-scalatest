package com.jaxjug

import java.util.{List => juList}

import scala.collection.JavaConverters._

class ShowJavaCollectionInScala { 
	def iterateList(l: juList[_ <: AnyRef]) = l.asScala.foreach { x => 
		println(x)
	}

	val javaList = new java.util.ArrayList[String]
	javaList.add("one")
	javaList.add("two")
	javaList.add("three")

	iterateList(javaList)
}