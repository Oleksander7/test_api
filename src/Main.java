import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.URI;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Запит для отримання даних конкретного користувача
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://gorest.co.in/public/v2/users/7538673"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .header("accept", "application/json")
                .header("Authorization", "Bearer 415a698823090ef3308b63057fddc9b34057053af083f0804c033aefefff9410")
                .build();

        try {

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response Body: ");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


