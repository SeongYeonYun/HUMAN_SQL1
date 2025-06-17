package src.quiz;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Qupang {
    public static void main(String[] args) {
        try {
            for (int page = 1; page < 10; page++) { //9페이지 까지 출력
                String url = String.format(
                    "https://www.coupang.com/np/campaigns/82/components/194176/products?"
                    + "page=%d&limit=24&sorter=scoreDesc",
                    page
                );
                
                //url을 출력해보자
                System.out.println(url);
                
                //헤더값 설정
//                HttpClient client = HttpClient.newBuilder()
//                        .version(HttpClient.Version.HTTP_1_1) //쿠팡은 가끔 이 버전이 안되는게 있다
//                        .build();
                HttpClient client = HttpClient.newBuilder()
                	    .followRedirects(HttpClient.Redirect.ALWAYS)
                	    .version(HttpClient.Version.HTTP_1_1)
                	    .build();

//                HttpRequest request = HttpRequest.newBuilder()
//                        .uri(URI.create(url))
//                        .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
//                        		+ "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36")
//                        .header("Referer", "https://www.coupang.com/np/campaigns/82/components/194176")
//                        .header("Accept", "*/*")
//                        .header("authority","ljc.coupang.com")
//                        .build();
                HttpRequest request = HttpRequest.newBuilder()
                	    .uri(URI.create(url))
                	    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/114.0.0.0 Safari/537.36")
                	    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                	    .header("Accept-Encoding", "gzip, deflate, br")
                	    .header("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.5,en;q=0.3")
                	    .header("Referer", "https://www.coupang.com/")
                	    //.header("Connection", "keep-alive")
                	    // .header("Cookie", "브라우저에서 복사해 붙여넣기 (선택사항)")
                	    .build();


                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                
                //데이터 할당 및 status반환, json 파싱
                if (response.statusCode() == 200) {
                    String responseBody = response.body();

                    ObjectMapper mapper = new ObjectMapper();
                    JsonNode root = mapper.readTree(responseBody);
                    JsonNode products = root.path("data").path("products");

                    for (JsonNode product : products) {
                        String name = product.path("productName").asText();
                        int price = product.path("price").asInt();
                        int unitPrice = product.path("unitPrice").asInt();
                        double rating = product.path("reviewRating").asDouble();
                        String imageUrl = product.path("imageUrl").asText();

                        System.out.println("상품명: " + name);
                        System.out.println("가격: " + price);
                        System.out.println("개당 가격: " + unitPrice);
                        System.out.println("별점: " + rating);
                        System.out.println("이미지: " + imageUrl);
                        System.out.println("--------------");
                    }
                } else {
                    System.out.println("응답 코드: " + response.statusCode());
                    Thread.sleep(3000); //3초후 실행
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
