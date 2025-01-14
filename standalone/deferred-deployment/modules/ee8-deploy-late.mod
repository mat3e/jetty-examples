[description]
Enables late ee8 application deployment from the $JETTY_BASE/webapps-late/ directory.

[depend]
ee8-deploy

[files]
webapps-late/

[xml]
etc/jetty-ee8-deploy-late.xml

[ini-template]
# Monitored directory name (relative to $jetty.base)
# jetty.deploy.late.monitoredDir=webapps-late

# Monitored directory scan period (seconds)
# jetty.deploy.late.scanInterval=1

# Whether to extract *.war files
# jetty.deploy.late.extractWars=true

