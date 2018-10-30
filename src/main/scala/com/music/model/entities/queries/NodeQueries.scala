package com.music.model.entities.queries

import org.neo4j.driver.v1.{Record, Value}

abstract class NodeQueries[T] {
  def findAll(): List[T]
  def findById(id: String): Option[T]
  def findByName(name: String): Option[T]
  def delete(id: String): Option[T]
  def save(t: T): Option[T]
  protected def buildFrom(record: Record): Option[T]
  protected def setParams(before: Option[T], after: T): Value
}