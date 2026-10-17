/*
 * SPDX-FileCopyrightText: The uwuAOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package android.car;

import android.content.Context;
import android.os.Handler;

/** Compile-time placeholder for Android Automotive clients on non-automotive builds. */
public final class Car {
    public static final String CAR_UX_RESTRICTION_SERVICE = "uxrestriction";
    public static final long CAR_WAIT_TIMEOUT_DO_NOT_WAIT = 0;

    private Car() {}

    public static Car createCar(
            Context context,
            Handler handler,
            long waitTimeout,
            CarServiceLifecycleListener listener) {
        return null;
    }

    public void disconnect() {}

    public Object getCarManager(String serviceName) {
        return null;
    }

    public interface CarServiceLifecycleListener {
        void onLifecycleChanged(Car car, boolean ready);
    }
}
