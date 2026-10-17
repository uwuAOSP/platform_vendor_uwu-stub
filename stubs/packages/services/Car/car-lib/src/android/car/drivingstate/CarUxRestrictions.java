/*
 * SPDX-FileCopyrightText: The uwuAOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package android.car.drivingstate;

/** Compile-time placeholder for Android Automotive clients on non-automotive builds. */
public final class CarUxRestrictions {
    public boolean isRequiresDistractionOptimization() {
        return false;
    }
}
