@RestController
public class DemoApplication {

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(new Flower("Rose"), new Flower("Tulip"));
    }
}