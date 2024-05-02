package HomeWork.Day04;



import HomeWork.Day03.HW10.UserPojo_HW2;
import HomeWork.Day03.HW11.PetStoreBaseUrl;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilities.ObjectMapperUtilities;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;
import static utilities.ObjectMapperUtilities.convertJsonToJava;

public class UserPostRequest extends PetStoreBaseUrl {

    @Test
    public void postRequest(){

        //SetUrl
        spec.pathParam("first","user");
        //Set expected Data
        String expectedStr = """
                {
                  "id": 0,
                  "username": "Ralnakhebi2114",
                  "firstName": "Reemah",
                  "lastName": "alnakhebi",
                  "email": "test@test",
                  "password": "123456",
                  "phone": "12456987",
                  "userStatus": 0
                }""";

        UserPojo_HW2 expectedData= convertJsonToJava(expectedStr, UserPojo_HW2.class);

        //Send Post Request and get Response
        Response response = given(spec).body(expectedData).when().post("{first}");
        response.prettyPrint();

        //Do assertions
        assertEquals(200,response.statusCode());

    }
}
