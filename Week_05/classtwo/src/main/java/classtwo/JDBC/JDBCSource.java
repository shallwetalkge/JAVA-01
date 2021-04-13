package classtwo.JDBC;

import java.sql.*;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>原生jdbc接口增删改查 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/14 2:54
 * @since 1.8
 */
public class JDBCSource {

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        Statement statement = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://192.168.31.107:3306/soul";
        conn = DriverManager.getConnection(url, "root", "123456");

        statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from rule");
        String selectorId = null;
        while (resultSet.next()){
            System.out.println("selector id = "+resultSet.getString(1));
            selectorId = resultSet.getString(1);
        }

        statement.executeUpdate("UPDATE `soul`.`rule` SET `selector_id` = '1376517871502663680', `match_mode` = 0, `name` = '/http/order/findById', `enabled` = 1, `loged` = 1, `sort` = 1, `handle` = '{\\\"loadBalance\\\":\\\"random\\\",\\\"retry\\\":0,\\\"timeout\\\":3000}', `date_created` = '2021-04-29 20:53:30', `date_updated` = '2021-04-29 20:53:30' WHERE `id` = '1376517872203112448';\n");

        //statement.executeUpdate("INSERT INTO `soul`.`rule`(`id`, `selector_id`, `match_mode`, `name`, `enabled`, `loged`, `sort`, `handle`, `date_created`, `date_updated`) VALUES ('666666', '666666', 0, '/test', 1, 1, 1, '{\\\"loadBalance\\\":\\\"random\\\",\\\"retry\\\":0,\\\"timeout\\\":3000}', '2021-03-29 20:53:30', '2021-03-29 20:53:30');\n");

        statement.executeUpdate("delete from rule where id = '666666'");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            conn.close();
            statement.close();
        }
    }

}
