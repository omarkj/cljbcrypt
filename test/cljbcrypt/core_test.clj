(ns cljbcrypt.core-test
  (:use clojure.test
        cljbcrypt.core))

(deftest hash-password-test
  (testing "Test a password hashing"
      (is (= "$2a$10$vBc4TDJMXSzezaiwmWU2suJGTtkmLzd50Y5jEKGVJDoHZzoL2OBf2"
             (hash-password "test" "$2a$10$vBc4TDJMXSzezaiwmWU2su")))))


(deftest check-password-test
  (testing "Test check password"
    (is (= true (check-password "test"
                                "$2a$10$vBc4TDJMXSzezaiwmWU2suJGTtkmLzd50Y5jEKGVJDoHZzoL2OBf2")))))