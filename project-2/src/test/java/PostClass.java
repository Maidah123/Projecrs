import groovy.json.JsonOutput;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class PostClass {

    public static String method123 =
            "{\n" +
                    "   \"address\":\"test\",\n" +
                    "   \"admissionDate\":\"123\",\n" +
                    "   \"age\":\"78\",\n" +
                    "   \"city\":\"karachi\",\n" +
                    "   \"country\":\"pakistan\",\n" +
                    "   \"courses\":[\n" +
                    "      \"string\"\n" +
                    "   ],\n" +
                    "   \"description\":\"string\",\n" +
                    "   \"email\":\"maidahq.sol\",\n" +
                    "   \"firstName\":\"$firtName$\",\n" +
                    "   \"lastName\":\"$lastName$\",\n" +
                    "   \"mobile\":\"string\",\n" +
                    "   \"programme\":\"string\"\n" +
                    "}";
        }

