package bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
@Test
    void getNameDay(){
    int a=3;
    int b=4;
    int c=3;
    String expect="tam giac can";
    String result=Triangle.nameTriangle(a,b,c);
    assertEquals(expect,result);
}
}