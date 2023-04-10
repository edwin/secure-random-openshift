# Random Number Generator using Java and Openshift

## How to Test
A regular `SecureRandom secureRandom = new SecureRandom();` 
```
$ curl -k http://localhost:8080/secure-random
{"random-value":582955}                                                                         
```

SecureRandom using `SecureRandom.getInstance("SHA1PRNG");`
```
$ curl -k http://localhost:8080/secure-random-new
{"random-value":997607}                                                                     
```