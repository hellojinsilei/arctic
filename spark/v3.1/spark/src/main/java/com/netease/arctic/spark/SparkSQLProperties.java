/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netease.arctic.spark;

public class SparkSQLProperties {

  public static final String DELEGATE_DEFAULT_CATALOG_TABLE = "spark.arctic.sql.delegate.enable";

  public static final String USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES =
          "spark.sql.arctic.use-timestamp-without-timezone-in-new-tables";

  public static final String USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES_DEFAULT =
          "false";

  public static final String FORCE_REFRESH = "force.refresh";

  public static final String FORCE_REFRESH_DEFAULT = "false";
}
