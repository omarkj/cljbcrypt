(ns cljbcrypt.core
  (import (org.mindrot.jbcrypt BCrypt)))

(defn gen-salt
  "Create a salt"
  ([] (gen-salt 10))
  ([length] (BCrypt/gensalt length)))

(defn hash-password
  "Hash a password with BCrypt"
  [password salt]
  (BCrypt/hashpw password salt))

(defn check-password
  "Checks a password against a previously hashed password"
  [password hashed]
  (BCrypt/checkpw password hashed))

(defn create-password
  "Returns a new password and salt"
  [password]
  (let [salt (gen-salt)
        hashed-password (hash-password password salt)]
    (hash-map :password hashed-password
              :salt salt)))