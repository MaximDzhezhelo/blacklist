package org.test.bwl.model.dao

import java.util

import com.datastax.driver.mapping.Result
import com.datastax.driver.mapping.annotations.{Accessor, PartitionKey, Query, Table}

@Accessor trait BlackListAccessor {
  @Query("SELECT * FROM bwl_dict.black_list_rules") def getAll: Result[BlackListRule]
}

@Table(keyspace = "bwl_dict", name = "black_list_rules", readConsistency = "ONE", writeConsistency = "ONE")
case class BlackListRule(@PartitionKey msisdn: String, shortNumbers: util.Set[String]) {
  def this() = this(null, null)
}