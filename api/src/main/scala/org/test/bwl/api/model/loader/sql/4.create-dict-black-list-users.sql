USE bwl_dict;

CREATE TABLE black_list_rules (

  msisdn TEXT PRIMARY KEY,
  sn SET<TEXT>
);