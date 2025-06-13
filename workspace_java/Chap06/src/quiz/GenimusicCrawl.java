package quiz;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GenimusicCrawl {

    public static void main(String[] args) {
        List<String> musicData = new ArrayList<>();
        musicData.add("Rank,Title,Artist");

        for (int page = 1; page <= 10; page++) {
            String url = "https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250604&hh=13&rtm=N&pg=" + page;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36")
                    .build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                Document doc = Jsoup.parse(response.body());

                Elements rows = doc.select("#body-content > div.newest-list > div > table > tbody > tr");

                for (Element row : rows) {
                    String rank = row.selectFirst("td.number").ownText().trim();
                    Element titleEl = row.selectFirst("td.info > a.title.ellipsis");
                    Element artistEl = row.selectFirst("td.info > a.artist.ellipsis");

                    if (titleEl != null && artistEl != null) {
                        String title = titleEl.text().trim().replace(",", " ");
                        String artist = artistEl.text().trim().replace(",", " ");
                        musicData.add(rank + "," + title + "," + artist);
                    }
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        String filePath = "genie_music_20250604.csv";
        try (FileOutputStream fos = new FileOutputStream(filePath);
             Writer writer = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"))) {

            // BOM 추가
            fos.write(0xEF);
            fos.write(0xBB);
            fos.write(0xBF);

            for (String line : musicData) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }

            System.out.println("UTF-8 with BOM으로 저장 완료: " + filePath);
        } catch (IOException e) {
            System.err.println("파일 저장 중 오류 발생: " + e.getMessage());
        }
    }
}
