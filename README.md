# BY USING SPRING SECURITY 3.0

firstly, save admin details to postgres db

secondly, config security and /admin/**,/authenticate/** not secured
and /student/** to be secured

finally, when admin login by using /authenticate then token generates..
By using that token which can pass to /student/** in the authorization header in bearer request and then the request successfull
