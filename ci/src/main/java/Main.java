
import static spark.Spark.*;

class Main {
    public static void main(String[] args) {

        post("/event_handler", (req, res) -> {

            System.out.println(req.body());
            return "worked";
        });
    }
}