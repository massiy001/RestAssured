import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_GET
{
    @Test
    void test_1()
    {
        Response resp =  RestAssured.get("https://reqres.in/api/users?page=2");;
        System.out.println(resp.getBody().asString());
        Assert.assertEquals(resp.getStatusCode(), 200);
    }

    @Test
    void test_2()
    {
        Response resp =  RestAssured.get("https://reqres.in/api/users?page=2");;
        System.out.println(resp.getBody().asString());
        Assert.assertEquals(resp.getStatusCode(), 201);
    }
}

