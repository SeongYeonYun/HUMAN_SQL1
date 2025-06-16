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

public class NaverNewsCrawler {

    public static void main(String[] args) throws IOException, InterruptedException {
    	int rows = 0;
    	for(int page = 1; page<=10;page++) { //1번 페이지 부터 10번 페이지 까지 크롤링
    		System.out.println("///////////////////////" + page + "////////////////////////////");
	        String listUrl = "https://news.naver.com/main/list.naver?mode=LSD&mid=sec&sid1=101&date=20250616&page="+page;
//	        sid1 100 = 정치.
//	        101 경제,
//	        102 사회,
//	        103 생활/문화,
//	        104 세계,
//	        105 IT과학,
//	        110 오피니언.
//	        140 연합뉴스 특보(oid=001&isYeonhapFlash=Y)
	        
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(listUrl))
	                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
	                .build();
	
	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	        Document doc = Jsoup.parse(response.body());
	
	        Elements items = doc.select("ul.type06_headline li, ul.type06 li");
	
	        for (Element item : items) {
	            // 제목: 두 번째 <a> 태그 (첫 번째는 썸네일 이미지 링크일 수 있음)
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
	                
	                
	            }
	            rows = rows + 1;
	          
	        }
	        rows =+rows;
	        
	      //3초후 반복, 한번에 너무 많은 요청이 있으면 차단당할수 있음
            Thread.sleep(3000); //3초후에 다음 코드 실행
    	}
    	System.out.println("총 데이터 수 " + rows); 
    }
}
