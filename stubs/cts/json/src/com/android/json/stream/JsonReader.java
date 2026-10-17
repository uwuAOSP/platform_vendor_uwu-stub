/*
 * SPDX-FileCopyrightText: The uwuAOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */
package com.android.json.stream;

import java.io.Reader;

/** Compatibility wrapper used by retained host tooling. */
public final class JsonReader extends com.google.gson.stream.JsonReader {
    public JsonReader(Reader reader) {
        super(reader);
    }
}
