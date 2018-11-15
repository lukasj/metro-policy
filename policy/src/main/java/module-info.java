/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/**
 * WS-Policy implementation for Metro
 */
module com.sun.xml.ws.policy {

    requires transitive java.xml;
    requires java.logging;

    requires com.sun.istack.runtime;
    requires com.sun.xml.txw2;

    exports com.sun.xml.ws.policy.sourcemodel.wspolicy;
    exports com.sun.xml.ws.policy.privateutil;
    exports com.sun.xml.ws.policy;
    exports com.sun.xml.ws.policy.sourcemodel;
    exports com.sun.xml.ws.policy.spi;
    exports com.sun.xml.ws.policy.subject;
    exports com.sun.xml.ws.policy.util;
}
