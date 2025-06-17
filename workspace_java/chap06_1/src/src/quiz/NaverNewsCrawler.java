package src.quiz;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverNewsCrawler {

    public static void main(String[] args) throws IOException, InterruptedException {
        int rows = 0;
        for (int page = 1; page <= 10; page++) {
            System.out.println("/////////////////////// Page " + page + " ////////////////////////////");
            String listUrl = "https://news.naver.com/main/list.naver?mode=LSD&mid=sec&sid1=101&date=20250616&page=" + page;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(listUrl))
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Document doc = Jsoup.parse(response.body());

            Elements items = doc.select("ul.type06_headline li, ul.type06 li");

            for (Element item : items) {
                Elements links = item.select("a");
                Element titleElement = (links.size() > 1) ? links.get(1) : links.first();
                Element summaryElement = item.selectFirst("span.lede");

                if (titleElement != null && summaryElement != null) {
                    String title = titleElement.text();
                    String summary = summaryElement.text();
                    String link = titleElement.attr("href");

                    System.out.println("제목: " + title);
                    System.out.println("요약: " + summary);
                    System.out.println("링크: " + link);
                    System.out.println("-----");

                    rows += 1; // ✅ 카운트는 여기서!
                }
            }

            Thread.sleep(3000); // 3초 대기
        }
        System.out.println("\n✅ 총 데이터 수: " + rows);
    }
}
