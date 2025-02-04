/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid;

public interface Constants {
    /**
     * 这两个配置和监控有关，文档没有具体描述，后续再看 TODO
     */

    public final static String DRUID_STAT_SQL_MAX_SIZE             = "druid.stat.sql.MaxSize";

    public final static String DRUID_TIME_BETWEEN_LOG_STATS_MILLIS = "druid.timeBetweenLogStatsMillis";
}
