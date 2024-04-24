package day01;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class C01_RequestAndResponse {

    public static void main(String[] args) {
 /*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends a GET Request to the url
    Then
        Print Status Code (should be 200)
    And
        Print Content Type (should be JSON)
    And
        Print Status Line (should be HTTP/1.1 200 OK)
    And
        Print Connection and Date headers on console
    And
        Print all headers on console

*/
        String url="https://restful-booker.herokuapp.com/booking";
       Response response= given().get(url); //All data I need is in response

       //how to print response
      //  System.out.println(response);  //it prints references of the response
        response.prettyPrint();

        //how to print status code
       int statusCode = response.statusCode();
        System.out.println("statusCode ="+statusCode);

        //how to print status line
       String statusLine= response.statusLine();
        System.out.println("statusLine = " + statusLine);

        //how to print Content type
       String contentType= response.contentType();
        System.out.println("contentType = " + contentType);

        //how can i get value from headers
        String conn= response.header("Connection ");
        System.out.println("conn = " + conn);
        System.out.println("--------------------------");
       String date= response.header("Date");
        System.out.println("date = " + date);

        //how to get all headers
       Headers h = response.headers();
        System.out.println("headers = " + h);

        //how to get response time
        System.out.println(response.time());
    }
}
