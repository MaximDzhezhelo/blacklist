package org.test.bwl.api.model

import com.datastax.driver.mapping.annotations.Table

@Table(keyspace = "bwl_dict", name = "users", readConsistency = "ONE", writeConsistency = "ONE")
case class BlackListRule(msisdn: String, sn: Set[String])