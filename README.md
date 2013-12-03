rate-password--java-webservice
==============================

Simple rate password java webservice (using Jersey and Grizzly)
/www.google.com/accounts/RatePassword?Passwd=1111111111111111$@-**


Technical solution
--------
 * Java
 * Jersey
 * Grizzly
 * vt-password library for rating (http://code.google.com/p/vt-middleware/wiki/vtpassword)


How to start
------------

Run tests
---------
mvn clean test

Run service
---------
mvn exec:java