# Jetty WebApp Examples

* [`error-handling-4/`](error-handling-4/) - Using the Servlet 4 `<error-page>` descriptor element
* [`hello-servlet-3/`](hello-servlet-3/) - Simple Hello World in Servlet 3.1
* [`hello-servlet-5/`](hello-servlet-5/) - Simple Hello World in Servlet 5.0
* [`http2-client-from-webapp/`](http2-client-from-webapp/) - Using the Jetty Http2 Client from a WebApp (with a focus on packaging choices)
* [`http2-demo/`](http2-demo/) - Using the Jetty `PushCacheFilter` (now deprecated by HTTP/2 spec) to auto push resources to HTTP2 client 
* [`jaspi-webapp/`](jaspi-webapp/) - Using JASPI from a WebApp
* [`logging-overlap/`](logging-overlap/) - Example of having multiple active Logging libraries at the same time and routing all of the events to a single logging implementation. (webapp + standalone `${jetty.base}` dir)