/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.policy.privateutil;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 *
 * @author Fabian Ritzmann
 */
public class ServiceFinderTest extends TestCase {
    
    public ServiceFinderTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of find method, of class ServiceFinder.
     */
    public void testFind_Class_ClassLoader() {
        Class<String> service = String.class;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        ServiceFinder result = ServiceFinder.find(service, loader);
        assertNotNull(result);
    }

    /**
     * Test of find method, of class ServiceFinder.
     */
    public void testFind_Class() {
        Class<Integer> service = Integer.class;
        ServiceFinder result = ServiceFinder.find(service);
        assertNotNull(result);
    }

    /**
     * Test of iterator method, of class ServiceFinder.
     */
    public void testIterator() {
        ServiceFinder instance = ServiceFinder.find(Double.class);
        Iterator result = instance.iterator();
        assertNotNull(result);
    }

    /**
     * Test of toArray method, of class ServiceFinder.
     */
    public void testToArray() {
        ServiceFinder instance = ServiceFinder.find(Byte.class);
        Object[] result = instance.toArray();
        assertNotNull(result);
    }

    public void testFail() {
        final ServiceFinder instance = ServiceFinder.find(ServiceFinderTestInterface.class);
        final Iterator iterator = instance.iterator();
        try {
            final boolean result = iterator.hasNext();
            fail("Expected ServiceConfigurationError, got \"" + result + "\" intead.");
        } catch (ServiceConfigurationError e) {
            // Expected error
        }
    }

}
