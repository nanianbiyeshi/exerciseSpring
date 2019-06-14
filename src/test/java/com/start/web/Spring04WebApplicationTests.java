package com.start.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import sun.jvm.hotspot.debugger.DataSource;

//import javax.sql.DataSource;
//import javax.activation.DataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring04WebApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
