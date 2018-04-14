package com.tdd.racing;
import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        /* path 방식으로 */
        get("/hello/:name", (req, res) -> {
            return "Hello : " + req.params(":name");
        });

        /* get 방식으로 */
        get("/hello2", (req, res) -> {
            return "Hello : " + req.queryParams("name") + " 나이는 : " + req.queryParams("age");
        });

        /* get 방식으로 */
        get("/car-racing", (req, res) -> {
            return "이름 : " + req.queryParams("names") + " 차 댓수 : " + req.queryParams("carcnt") + " 라운드 수 : " + req.queryParams("roundcnt");
        });
    }
}
