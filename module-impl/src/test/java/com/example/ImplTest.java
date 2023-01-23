package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ImplTest {

    ImplClass implClass = new ImplClass();

    @Test
    void testImpl() {
        Assertions.assertEquals("This IMPL method is covered.", implClass.coveredImplMethod());
    }
}
