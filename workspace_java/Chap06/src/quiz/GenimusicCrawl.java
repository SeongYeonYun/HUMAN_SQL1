package quiz;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GenimusicCrawl {
    public static void main(String[] args) {
        String url = "https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250604&hh=13&rtm=N&pg=1";
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36")
            .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Document doc = Jsoup.parse(response.body());
            
            Elements rows = doc.select("#body-content > div.newest-list > div > table > tbody > tr");

            System.out.printf("%-6s %-40s %-30s%n", "Rank", "Title", "Artist");
            System.out.println("----------------------------------------------------------------------");
            for (Element row : rows) {
                String rank = row.selectFirst("td.number").ownText().trim();
                Element titleEl = row.selectFirst("td.info > a.title.ellipsis");
                Element artistEl = row.selectFirst("td.info > a.artist.ellipsis");

                if (titleEl != null && artistEl != null) {
                    String title = titleEl.text().trim();
                    String artist = artistEl.text().trim();
                    System.out.printf("%-6s %-40s %-30s%n", rank, title, artist);
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

	