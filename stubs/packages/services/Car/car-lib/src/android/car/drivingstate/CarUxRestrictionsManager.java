/*
 * SPDX-FileCopyrightText: The uwuAOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package android.car.drivingstate;

/** Compile-time placeholder for Android Automotive clients on non-automotive builds. */
public final class CarUxRestrictionsManager {
    public CarUxRestrictions getCurrentCarUxRestrictions() {
        return null;
    }

    public void registerListener(OnUxRestrictionsChangedListener listener) {}

    public void unregisterListener() {}

    public interface OnUxRestrictionsChangedListener {
        void onUxRestrictionsChanged(CarUxRestrictions restrictions);
    }
}
