/*
 * Copyright (c) 2013-2015 Cinchapi, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cinchapi.concourse.util;

import java.io.File;
import java.util.Comparator;

import org.cinchapi.vendor.com.davekoelle.AlphanumSorter;

/**
 * A {@link Comparator} that sorts files with strictly numerical names between 0
 * and 2^63 - 1 (i.e. a timestamp).
 * 
 * @author jnelson
 */
public enum NaturalSorter implements Comparator<File> {
    INSTANCE;

    private static AlphanumSorter COMPARATOR = new AlphanumSorter();

    @Override
    public int compare(File f1, File f2) {
        return COMPARATOR.compare(f1.getName(), f2.getName());
    }

}
