//
// ========================================================================
// Copyright (c) 1995 Mort Bay Consulting Pty Ltd and others.
//
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License v. 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
// which is available at https://www.apache.org/licenses/LICENSE-2.0.
//
// SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
// ========================================================================
//

package examples;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SuppressWarnings("serial")
public class HelloCommonsLoggingServlet extends HttpServlet
{
    private static final Log LOG = LogFactory.getLog(HelloCommonsLoggingServlet.class);
    private final String msg;

    public HelloCommonsLoggingServlet(String msg)
    {
        this.msg  = msg;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        LOG.info(String.format(
            "Got request from %s for %s",
            request.getRemoteAddr(), request.getRequestURL()));
        response.setContentType("text/plain");
        response.getWriter().printf("%s%n",msg);
    }
}