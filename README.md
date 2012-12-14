Cljbcrypt
=========

[![Build Status](https://secure.travis-ci.org/omarkj/cljbcrypt.png)](https://travis-ci.org/omarkj/cljbcrypt)

Thin wrapper for [jBCrypt](http://www.mindrot.org/projects/jBCrypt/) in Clojure.

Clojure API
-----------

### Create a salt

``` clojure
(gen-salt)
(gen-salt byte-lengt)
```

Returns a salt as a string.

### Hash password

``` clojure
(hash-password password salt)
```

Returns the hashed password as a string.

### Check password

``` cljoure
(check-password password hashed-password)
```

Returns true or false.

### Create password

``` clojure
(create-password password)
```

Returns a `hash-map` with `password` and `salt`.

Licence
-------

Check the `LICENCE` file.
