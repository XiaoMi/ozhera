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
package run.mone.chaos.operator.service;

import com.xiaomi.youpin.docean.anno.Service;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;

import java.util.concurrent.TimeUnit;

@Service
public class TaskWheelTimer {

    private HashedWheelTimer hashedWheelTimer;

    public void init() {
        hashedWheelTimer = new HashedWheelTimer(100, TimeUnit.MILLISECONDS, 512);
    }


    public Timeout newTimeout(Runnable runnable, long delay) {
        return hashedWheelTimer.newTimeout(timeout -> runnable.run(), delay, TimeUnit.MILLISECONDS);
    }
}
