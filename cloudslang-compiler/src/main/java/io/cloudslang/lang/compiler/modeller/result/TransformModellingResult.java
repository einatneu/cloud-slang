/**
 * ****************************************************************************
 * (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0 which accompany this distribution.
 * <p/>
 * The Apache License is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * *****************************************************************************
 */
package io.cloudslang.lang.compiler.modeller.result;

/**
 * @author Bonczidai Levente
 * @since 7/19/2016
 */
public interface TransformModellingResult<T> extends ModellingResult {
    T getTransformedData();
}
