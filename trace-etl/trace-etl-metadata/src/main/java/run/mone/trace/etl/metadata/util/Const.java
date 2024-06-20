/*
 * Copyright 2020 Xiaomi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package run.mone.trace.etl.metadata.util;

public class Const {
    public static final String SYNC_DATA_LOCK_REDIS_KEY = "hera_meta_data_sync";
    public static final String REDIS_DISLOCK_KEY_PREFIX = "hera_metadata_";
    // Maximum waiting time for data synchronization to block
    public static final int SYNC_REDIS_WAIT_DURATION = 3 * 60 * 1000;
}
