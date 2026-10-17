/*
 * SPDX-FileCopyrightText: The uwuAOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */
package com.android.json.stream;

import java.io.Writer;

/** Compatibility wrapper used by retained host tooling. */
public final class JsonWriter extends com.google.gson.stream.JsonWriter {
    public JsonWriter(Writer writer) {
        super(writer);
    }
}
