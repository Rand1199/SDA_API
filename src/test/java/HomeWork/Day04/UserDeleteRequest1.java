package HomeWork.Day04;

import HomeWork.Day03.HW11.PetStoreBaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class UserDeleteRequest1 extends PetStoreBaseUrl {
    @Test
    public void deleteRequest(){

        //SetUrl
        spec.pathParams("first","user","second","Ralnakhebi2114");

        //Send Post Request and get Response
        Response response = given(spec).when().delete("{first}/{second}");
        response.prettyPrint();

        //Do assertions
        assertEquals(200,response.statusCode());
        //Send Get Request to verify the username is no longer exist
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();

        //Do assertions
        assertEquals(404,response.statusCode());

    }
}
