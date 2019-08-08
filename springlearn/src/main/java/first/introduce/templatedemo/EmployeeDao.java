package first.introduce.templatedemo;

/**
 * @author zk
 * @DATE 19-8-8
 */
public class EmployeeDao {

//    private JdbcTemplate jdbcTemplate = new JdbcTemplate();
//
//    private Employee getEmployeeById(long id) {
//        return jdbcTemplate.queryForObject(
//                "select id, firstname, lastname, salary "
//                        + "from employee where id=?",
//                (resultSet, i) -> {
//                    Employee employee = new Employee();
//                    employee.setId(resultSet.getLong("id"));
//                    employee.setFirstName(resultSet.getString("firstname"));
//                    employee.setLastName(resultSet.getString("lastname"));
//                    employee.setSalary(resultSet.getBigDecimal("salary"));
//                    return employee;
//                }
//                , id);
//    }

}
