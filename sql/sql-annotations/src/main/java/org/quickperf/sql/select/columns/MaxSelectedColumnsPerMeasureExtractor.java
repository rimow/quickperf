/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2019-2019 the original author or authors.
 */

package org.quickperf.sql.select.columns;

import org.quickperf.ExtractablePerformanceMeasure;
import org.quickperf.sql.SqlExecutions;
import org.quickperf.unit.Count;

public class MaxSelectedColumnsPerMeasureExtractor implements ExtractablePerformanceMeasure<SqlExecutions, Count> {

    public static final MaxSelectedColumnsPerMeasureExtractor INSTANCE = new MaxSelectedColumnsPerMeasureExtractor();

    private MaxSelectedColumnsPerMeasureExtractor() {}

    @Override
    public Count extractPerfMeasureFrom(SqlExecutions sqlExecutions) {
        long maxNumberOfColumns = sqlExecutions.getMaxNumberOfSelectedColumns();
        return new Count(maxNumberOfColumns);
    }

}
