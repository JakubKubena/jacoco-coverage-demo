package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ApiTest {

    ApiClass apiClass = new ApiClass();

    @Test
    void testApi() {
        Assertions.assertEquals("This API method is covered.", apiClass.coveredApiMethod());
    }
}
