import io.restassured.http.Header;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;

import static io.restassured.RestAssured.given;

//import java.util.HashMap;
//import java.util.Map;


public class Automate1 {


        @Test
                public static void method1(){




            given().headers("ClientId" , "web")
                    .pathParam("StudentId", "37fd9426-b7ef-47ea-9b57-260895834328")
                    .get("http://localhost:8080/api/v1/{StudentId}")
                    .then().log().all();

        }

    @Test
    public static void method2(){

        given().headers("ClientId" , "web")
                .header(new Header("clientId", "web"))
                .pathParam("StudentId", "37fd9426-b7ef-47ea-9b57-260895834328")
                .get("http://localhost:8080/api/v1/{StudentId}")
                .then().assertThat().header("Content-Type", "application/json").log().all();

    }

//    @Test
//    public static void method3(){
//
//
//        given().headers("ClientId" , "web")
//
//                .headers(getHeader())
//                .pathParam("StudentId", "37fd9426-b7ef-47ea-9b57-260895834328")
//                .get("http://localhost:8080/api/v1/{StudentId}")
//                .then().assertThat().header("Content-Type", "application/json").log().all();
//
//    }

//    private static Map<String, String> getHeader() {
//        Map<String, String> obj = new HashMap<String, String >();
//        obj.put("clientId", "web");
//        obj.put("fname", "shahid");
//        return obj;
//    }
//    @Test
//    public static void method4(){
//        Cookie obj1 = new Builder("ClientId", "Web").setComment("hello").setVersion(1).build();
//        given().headers("ClientId" , "web")
//                .cookie(obj1)
//                .header(new Header("clientId", "web"))
//                .pathParam("StudentId", "37fd9426-b7ef-47ea-9b57-260895834328")
//                .get("http://localhost:8080/api/v1/{StudentId}")
//                .then().log().all();
//
//    }
    @Test
    public static void testcase1(){
        Random random = new Random();
        System.out.println(random.nextInt());
        PostClass.method123= PostClass.method123.replace("$firtName$",String.valueOf(random.nextInt()));
        PostClass.method123= PostClass.method123.replace("$lastName$", String.valueOf(random.nextInt()));
        given().header("ClientId", "Web")
                .header("Content-Type", "application/json")
                .body(PostClass.method123)
                .post("http://localhost:8080/api/v1/create")
                .then().log().all();



    }

//    @Test
//    public static void testcase2(){
//
//        PostClass.method123= PostClass.method123.replace("$firtName$", RandomStringUtils.randomAlphabetic(10));
//        PostClass.method123= PostClass.method123.replace("$lastName$", RandomStringUtils.randomAlphabetic(10));
//        given().header("ClientId", "Web")
//                .header("Content-Type", "application/json")
//                .body(new File("C:\\Users\\Toshiba\\OneDrive\\Desktop\\textFile.Json"))
//                .post("http://localhost:8080/api/v1/create")
//                .then().log().all();
//
//
//
//    }

    @Test
    public static void testcase3(){

        String filePth= System.getProperty("user.dir")+ "\\src\\test\\resources\\textFile.Json";
        given().header("ClientId", "Web")
                .header("Content-Type", "application/json")
                .body(new File(filePth))
                .post("http://localhost:8080/api/v1/create")
                .then().log().all();



    }

    @Test
    public static void testcase4(){





        given().header("ClientId", "Web")
                .header("Content-Type", "application/json")
                .body(callmethod())
//                .body(callmethod())
                .post("http://localhost:8080/api/v1/create")
                .then().log().all();



    }

    public static Newtech callmethod() {
        Newtech pay = new Newtech();
 pay.setFirstName("Maidah");
        pay.setLastName("shahid");
        pay.setAddress("gulshan");
        pay.setAdmissionDate("7654");
        pay.setAge("12345");
        pay.setCountry("pakistan");


            return pay;
    }


}
